package com.company;

import java.util.Arrays;
import java.util.Optional;

public class MachineDualTape extends Machine {
    private final Tape secondTape;
    private int secondTapeHead;
    private RuleDualTape[] ruleDualTapes;

    public MachineDualTape(
            RuleDualTape[] rulesDualTape, Tape tape, Tape secondTape,
            int head, int secondTapeHead, int finalState
    ) {
        super(rulesDualTape, tape, head, finalState);
        this.ruleDualTapes = rulesDualTape;
        this.secondTape = secondTape;
        this.secondTapeHead = secondTapeHead;
    }

    @Override
    public void compute() {
        int currentState = 0;
        while (currentState != finalState) {
            int finalCurrentState = currentState;
            try {
                Optional<RuleDualTape> hopefullyRightRule = Arrays.stream(ruleDualTapes).
                        filter(rule -> rule.getCurrentState() == finalCurrentState).
                        filter(rule -> rule.getReadSymbol().equals(tape.getSymbol(head))).
                        filter(rule -> rule.getReadSymbolSecondTape().equals(tape.getSymbol(head))).
                        findFirst();

                RuleDualTape rightRule = hopefullyRightRule.get();
                tape.setSymbol(
                        rightRule.getWriteSymbol(), head
                );
                tape.setSymbol(
                        rightRule.getWriteSymbolSecondTape(), secondTapeHead
                );

                switch (rightRule.getOperation()) {
                    case RIGHT -> head++;
                    case LEFT -> head--;
                    case STAY -> {
                    }
                    default -> throw new IllegalArgumentException("Illegal Operation!");
                }
                switch (rightRule.getOperation()) {
                    case RIGHT -> secondTapeHead++;
                    case LEFT -> secondTapeHead--;
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
        System.out.println(
                Arrays.toString(secondTape.getSymbols())
        );
    }

    public Tape getSecondTape() {
        return secondTape;
    }

    public int getSecondTapeHead() {
        return secondTapeHead;
    }

}
