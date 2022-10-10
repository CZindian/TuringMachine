package com.company;

import java.util.Arrays;
import java.util.Optional;

public class MachineDualTape extends Machine {
    private Tape secondTape;
    private int secondTapeHead;
    public MachineDualTape(Rule[] rulesDualTape, Tape tape,Tape secondTape, int head,int secondTapeHead, int finalState) {
        super(rulesDualTape, tape, head, finalState);
        this.secondTape = secondTape;
        this.secondTapeHead =secondTapeHead;
    }
    public void computeDualTape() {
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
    public Tape getSecondTape() {
        return secondTape;
    }

    public int getSecondTapeHead() {
        return secondTapeHead;
    }

}
