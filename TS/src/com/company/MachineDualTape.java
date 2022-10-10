package com.company;

import java.util.Arrays;
import java.util.Optional;

public class MachineDualTape extends Machine {

    //region Attributes
    private final Tape secondTape;
    private int secondTapeHead;
    private final RuleDualTape[] ruleDualTapes;
    //endregion

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
                        filter(rule -> rule.getReadSymbolSecondTape().equals(secondTape.getSymbol(secondTapeHead))).
                        findFirst();

                RuleDualTape rightRule = hopefullyRightRule.get();

                setTapeSymbol(rightRule);
                setSecondTapeSymbol(rightRule);

                updateTapeHead(rightRule);
                updateSecondTapeHead(rightRule);

                currentState = rightRule.getNextState();

            } catch (Exception e) {
                System.out.println("missing rule!");
                e.printStackTrace();
                break;
            }
        }
        printResult();
    }

    //region Util methods
    private void setTapeSymbol(RuleDualTape rightRule) {
        tape.setSymbol(
                rightRule.getWriteSymbol(), head
        );
    }

    private void setSecondTapeSymbol(RuleDualTape rightRule) {
        secondTape.setSymbol(
                rightRule.getWriteSymbolSecondTape(), secondTapeHead
        );
    }

    private void updateTapeHead(RuleDualTape rightRule) {
        switch (rightRule.getOperation()) {
            case RIGHT -> head++;
            case LEFT -> head--;
            case STAY -> {
            }
            default -> throw new IllegalArgumentException("Illegal Operation!");
        }
    }

    private void updateSecondTapeHead(RuleDualTape rightRule) {
        switch (rightRule.getOperationSecondTape()) {
            case RIGHT -> secondTapeHead++;
            case LEFT -> secondTapeHead--;
            case STAY -> {
            }
            default -> throw new IllegalArgumentException("Illegal Operation!");
        }
    }

    private void printResult() {
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
    //endregion

}
