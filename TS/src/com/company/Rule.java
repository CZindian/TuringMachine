package com.company;

public class Rule {
    private int currentState;
    private String readSymbol;
    private int nextState;
    private String writeSymbol;
    private Operation operation;

    public Rule(int currentState, int nextState, String readSymbol , String writeSymbol, Operation operation) {
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

    public void setReadSymbol(String readSymbol) {
        this.readSymbol = readSymbol;
    }

    public int getNextState() {
        return nextState;
    }


    public String getWriteSymbol() {
        return writeSymbol;
    }

    public void setWriteSymbol(String writeSymbol) {
        this.writeSymbol = writeSymbol;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
