package com.company;

public class MachineDualTape extends Machine {
    private Tape secondTape;
    private int secondTapeHead;

    public MachineDualTape(
            Rule[] rulesDualTape, Tape tape, Tape secondTape,
            int head, int secondTapeHead, int finalState
    ) {
        super(rulesDualTape, tape, head, finalState);
        this.secondTape = secondTape;
        this.secondTapeHead = secondTapeHead;
    }

    @Override
    public void compute() {
        super.compute();
    }

    public Tape getSecondTape() {
        return secondTape;
    }

    public int getSecondTapeHead() {
        return secondTapeHead;
    }

}
