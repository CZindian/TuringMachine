package com.company;

import java.util.Arrays;
import java.util.Optional;

class Machine {

    private final Rule[] rules;
    private final Tape tape;
    private int head;
    private final int finalState;// pozice čtecí/zapisovací hlavy na pásce

    public Machine(Rule[] rules, Tape tape, int head, int finalState) {
        this.rules = rules;
        this.tape = tape;
        this.head = head;
        this.finalState = finalState;
    }

    public void compute() {
        int currentState = 0;
        while (currentState != finalState) {
            int finalCurrentState = currentState;
            try {
                Optional<Rule> hopefullyRightRule = Arrays.stream(rules).
                        filter(rule -> rule.getCurrentState() == finalCurrentState).
                        filter(rule -> rule.getReadSymbol().equals(tape.getSymbol(head))).
                        findFirst();

                Rule rightRule = hopefullyRightRule.get();
                tape.setSymbol(
                        rightRule.getWriteSymbol(), head
                );

                switch (rightRule.getOperation()) {
                    case RIGHT -> head++;
                    case LEFT -> head--;
                    case STAY -> {
                    }
                    default -> throw new IllegalArgumentException("Illegal Operation!");
                }

                currentState = rightRule.getNextState();

            } catch (Exception e) {
                System.out.println("missing rule!");
            }
        }
        System.out.println(
                Arrays.toString(tape.getSymbols())
        );
    }
}
