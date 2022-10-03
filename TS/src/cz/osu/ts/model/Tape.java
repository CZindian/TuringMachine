package cz.osu.ts.model;

import java.util.ArrayList;
import java.util.List;

public class Tape {

    //region Attributes
    private final String emptyCharacter = "#";
    private String binaryDigit1;
    private String binaryDigit2;
    private List<String> tapeOfChars;
    //endregion

    public Tape(String binaryDigit1, String binaryDigit2) {
        this.binaryDigit1 = binaryDigit1;
        this.binaryDigit2 = binaryDigit2;
        this.tapeOfChars = getNewTapeOfChars();
    }


    private List<String> getNewTapeOfChars() {
        List<String> ret = new ArrayList<String>();
        String sequence = getTapeSequence();
        addStringCharsToList(ret, sequence);
        return ret;
    }

    private String getTapeSequence() {
        StringBuffer sb = new StringBuffer();
        sb.append("###").append(binaryDigit1).
                append("#").append(binaryDigit2).
                append("###");
        return sb.toString();
    }

    private void addStringCharsToList(List<String> ret, String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            ret.add(
                    String.valueOf(sequence.charAt(i))
            );
        }
    }

    public List<String> getTapeOfChars() {
        return tapeOfChars;
    }

    @Override
    public String toString() {
        return "TuringTape{" +
                "tapeOfChars=" + tapeOfChars.toString() +
                '}';
    }
}
