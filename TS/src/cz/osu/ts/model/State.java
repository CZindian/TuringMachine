package cz.osu.ts.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class State {

    //region Attributes
    private static final AtomicInteger atomicInteger = new AtomicInteger(-1);

    private final int value;
    private String headReadStrings;
    private String headWriteStrings;
    private String headDirection;
    //endregion

    public State() {
        this.value = atomicInteger.getAndIncrement();
    }

    public State(String headRead, String headWrite, String headDirection) {
        this.value = atomicInteger.getAndIncrement();
        this.headReadStrings = headRead;
        this.headWriteStrings = headWrite;
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
    public int getValue() {
        return value;
    }

    public String getHeadReadStrings() {
        return headReadStrings;
    }

    public String getHeadWriteStrings() {
        return headWriteStrings;
    }

    public String getHeadDirection() {
        return headDirection;
    }
    //endregion
}
