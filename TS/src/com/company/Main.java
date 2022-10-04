package com.company;

public class Main {

    private static final Tape tape = new Tape(
            new String[]{"#", "#", "#", "1", "0", "0", "#", "1", "0", "#", "#", "#"}
    );

    public static void main(String[] args) {
        Machine machine = new Machine(Config.rules, tape, 3, 10);
        machine.compute();
    }

}
