package com.company;

public class Rule {
    private final int currentState;
    private final String readSymbol;
    private final int nextState;
    private final String writeSymbol;
    private final Operation operation;

    public Rule(int currentState, int nextState, String readSymbol, String writeSymbol, Operation operation) {
        this.currentState = currentState;
        this.readSymbol = readSymbol;
        this.nextState = nextState;
        this.writeSymbol = writeSymbol;
        this.operation = operation;
    }

    public int getCurrentState() {
        return currentState;
    }


    public String getReadSymbol() {
        return readSymbol;
    }

    public int getNextState() {
        return nextState;
    }


    public String getWriteSymbol() {
        return writeSymbol;
    }

    public Operation getOperation() {
        return operation;
    }

}
