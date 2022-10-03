package cz.osu.ts;

import cz.osu.ts.model.Tape;
import cz.osu.ts.service.TuringManager;

import java.util.List;

public class TuringMachine {

    public static void main(String[] args) {
        String binaryDigit1 = "100";
        String binaryDigit2 = "10";

        Tape turingTape = new Tape(binaryDigit1, binaryDigit2);
        TuringManager.manageTuring(turingTape, binaryDigit1);

    }

    private static int getFirstNonEmptyIdx(List<String> tapeOfChars) {
        for (int i = 0; i < tapeOfChars.size(); i++) {
            if (tapeOfChars.get(i).equals("1") || tapeOfChars.get(i).equals("0")) {
                return i;
            }
        }
        throw new IllegalArgumentException("Tape is empty!");
    }

}