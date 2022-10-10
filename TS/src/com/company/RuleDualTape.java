package com.company;

public class RuleDualTape extends Rule{

    private String readSymbolSecondTape;
    private String writeSymbolSecondTape;
    private Operation operationSecondTape;

    public RuleDualTape(int currentState, int nextState, String readSymbol, String writeSymbol,String readSymbolSecondTape,
                        String writeSymbolSecondTape, Operation operation,Operation operationSecondTape) {
        super(currentState, nextState, readSymbol, writeSymbol, operation);
        this.operationSecondTape = operationSecondTape;
        this.readSymbolSecondTape = readSymbolSecondTape;
        this.writeSymbolSecondTape = writeSymbolSecondTape;
    }

    public String getReadSymbolSecondTape() {
        return readSymbolSecondTape;
    }

    public String getWriteSymbolSecondTape() {
        return writeSymbolSecondTape;
    }

    public Operation getOperationSecondTape() {
        return operationSecondTape;
    }
}
