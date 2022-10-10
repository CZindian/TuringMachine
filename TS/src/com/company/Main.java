package com.company;

public class Main {

    private static final Tape tape = new Tape(
            new String[]{"#", "#", "#", "1", "0", "0", "#", "1", "0", "#", "#", "#"}
    );
    private static final Tape tapeTwo = new Tape(
            new String[]{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}
    );

    public static void main(String[] args) {
//        Machine machine = new Machine(Config.rules, tape, 3, 10);
//        machine.compute();

        MachineDualTape machineDualTape = new MachineDualTape(
                Config.rulesDualTape,
                tape, tapeTwo,
                3, 3, 7
        ); //just guessed numbers. Check Before Run!!!!!
        machineDualTape.compute();
    }

}