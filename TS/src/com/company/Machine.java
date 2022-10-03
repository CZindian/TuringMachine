package com.company;

import java.util.Arrays;
import java.util.Optional;

class Machine {

        private Rule[] rules;
        private Tape tape;
        private int head;
        private int finalState;// pozice čtecí/zapisovací hlavy na pásce

    public Machine(Rule[] rules, Tape tape, int head, int finalState) {
        this.rules = rules;
        this.tape = tape;
        this.head = head;
        this.finalState = finalState;
    }

    public Rule[] getRules() {
        return rules;
    }

    public Tape getTape() {
        return tape;
    }

    public int getHead() {
        return head;
    }

    public void LetTheHeadDoHerThings() {
        int currentState = 0;
        while(currentState != finalState) {
            int finalCurrentState = currentState;
            try {
                Optional<Rule> hopefullyRightRule = Arrays.stream(rules).filter(rule -> rule.getCurrentState() == finalCurrentState)
                        .filter(rule -> rule.getReadSymbol().equals(tape.getSymbol(head))).findFirst();
                Rule rightRule = hopefullyRightRule.get();

                tape.setSymbol(rightRule.getWriteSymbol(),head);
                switch (rightRule.getOperation()){
                    case RIGHT -> head++;
                    case LEFT -> head--;
                    case STAY -> head = head;
                    default -> throw new IllegalArgumentException("Illegal Operation!");
                }

                currentState = rightRule.getNextState();

            }catch (Exception e){
                System.out.println("missing rule!");
            }
        }
        System.out.println(Arrays.toString(tape.getSymbols()));
    }
}
