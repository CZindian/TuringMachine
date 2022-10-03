package com.company;

public class Tape {

       private String[] symbols;	// ["x", "x", "y", "y", "x", "y", "x"]

    public String[] getSymbols() {
        return symbols;
    }
    public String getSymbol(int index) {
        return symbols[index];
    }

    public void setSymbols(String[] symbols) {
        this.symbols = symbols;
    }
    public void setSymbol(String symbol, int index) {
        this.symbols[index] = symbol;
    }

    public Tape(String[] symbols) {
        this.symbols = symbols;
    }
}
