package cz.osu.ts.model;

import java.util.ArrayList;
import java.util.List;

public class Rule {

    //region Attributes
    private final State state1;
    private final State state2;
    private final String headReadString;
    private final String headWriteString;
    private final String headDirection;
    //endregion

    public Rule(
            State state1, State state2,
            String headReadString, String headWriteString,
            String headDirection
    ) {
        this.state1 = state1;
        this.state2 = state2;
        this.headReadString = headReadString;
        this.headWriteString = headWriteString;
        this.headDirection = headDirection;
    }

    private List<String> getStringsValues(String string) {
        List<String> ret = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++) {
            ret.add(
                    String.valueOf(string.charAt(i))
            );
        }
        return ret;
    }

    //region Getters
    public State getState1() {
        return state1;
    }

    public State getState2() {
        return state2;
    }

    public String getHeadReadString() {
        return headReadString;
    }

    public String getHeadWriteString() {
        return headWriteString;
    }

    public String getHeadDirection() {
        return headDirection;
    }
    //endregion
}
