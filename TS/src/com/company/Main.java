package com.company;

import static com.company.Constants.*;

public class Main {

    private static final Tape tape = new Tape(
            new String[]{h, h, h, a, a, b, c, c, a, a, b, c, d, d, a, c, b, a, d, h, h, h, h}
    );
    private static final Tape tapeTwo = new Tape(
            new String[]{h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h}
    );
    private static final Tape tapeBE = new Tape(
            new String[]{h, h, i,o, h}
    );
    private static final Tape tapeTwoBE = new Tape(
            new String[]{h,i,o,o, h}
    );

    public static void main(String[] args) {

        //MachineDualTape machineDualTape = new MachineDualTape(Config.rulesDualTape,tape, tapeTwo,3, 3, 7);
        //machineDualTape.compute();

        MachineDualTape machineDualTape = new MachineDualTape(Config.rulesForBinaryExport,tapeBE, tapeTwoBE,1, 2, 6);
        machineDualTape.compute();

        //System.out.println(BinaryMachine.encodeMachineToBinary(Config.rules,10));

    }

}
