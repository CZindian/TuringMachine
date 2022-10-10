package com.company;

import static com.company.Constants.*;
import static com.company.Constants.h;

public class Main {

    private static final Tape tape = new Tape(
            new String[]{h, h, h, a, a, b, c, c, a, a, b, c, d, d, a, c, b, a, d, h, h, h, h}
    );
    private static final Tape tapeTwo = new Tape(
            new String[]{h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h, h}
    );

    public static void main(String[] args) {
//        Machine machine = new Machine(Config.rules, tape, 3, 10);
//        machine.compute();

        MachineDualTape machineDualTape = new MachineDualTape(
                Config.rulesDualTape,
                tape, tapeTwo,
                3, 6, 19
        ); //just guessed numbers. Check Before Run!!!!!
        machineDualTape.compute();
    }

}
