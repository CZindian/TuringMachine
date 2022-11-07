package com.company;

import static com.company.Constants.*;

public class Main {

    private static final Tape tape = new Tape(
            new String[]{h, h, h, a, a, b, c, c, a, a, b, c, d, d, a, c, b, a, d, h, h, h, h}
    );
    private static final Tape tapeTwo = new Tape(
            new String[]{h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h}
    );

    public static void main(String[] args) {

        MachineDualTape machineDualTape = new MachineDualTape(Config.rulesDualTape,tape, tapeTwo,3, 3, 7);
        machineDualTape.compute();
        System.out.println(BinaryMachine.encodeMachineToBinary(Config.rules,10));

    }

}
