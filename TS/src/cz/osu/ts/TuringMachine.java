package cz.osu.ts;

import cz.osu.ts.model.Tape;
import cz.osu.ts.service.TuringManager;

public class TuringMachine {

    public static void main(String[] args) {
        String binaryDigit1 = "100";
        String binaryDigit2 = "10";

        Tape turingTape = new Tape(binaryDigit1, binaryDigit2);
        TuringManager.manageTuring(turingTape, binaryDigit1);

    }

}