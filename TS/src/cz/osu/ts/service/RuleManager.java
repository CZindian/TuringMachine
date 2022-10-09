package cz.osu.ts.service;

import cz.osu.ts.model.Rule;

import java.util.List;

public class RuleManager {

    public static void checkByRule(int headIndex, List<String> tapeOfChars, Rule rule) {
        String currentValue = tapeOfChars.get(headIndex);
        int headReadStringLength = rule.getHeadReadString().length();

        if (rule.getHeadReadString() == null) {
            return;
        }

        if (rule.getHeadReadString().contains(currentValue)) {
            if (
                    equalsLength(headReadStringLength, 1)
            ) {
                replace(tapeOfChars, headIndex, 0, 1, rule);
            } else if (
                    equalsLength(headReadStringLength, 2)
            ) {
                if (
                        equalsStringChars(rule.getHeadWriteString(), 0, 1, currentValue)
                ) {
                    replace(tapeOfChars, headIndex, 0, 1, rule);
                } else if (
                        equalsStringChars(rule.getHeadWriteString(), 1, 2, currentValue)
                ) {
                    replace(tapeOfChars, headIndex, 1, 2, rule);
                }
            } else if (
                    equalsLength(headReadStringLength, 3)
            ) {
                if (
                        equalsStringChars(rule.getHeadWriteString(), 0, 1, currentValue)
                ) {
                    replace(tapeOfChars, headIndex, 0, 1, rule);
                } else if (
                        equalsStringChars(rule.getHeadWriteString(), 1, 2, currentValue)
                ) {
                    replace(tapeOfChars, headIndex, 1, 2, rule);
                } else if (
                        equalsStringChars(rule.getHeadWriteString(), 2, 3, currentValue)
                ) {
                    replace(tapeOfChars, headIndex, 2, 3, rule);
                }
            } else {
                throw new IllegalArgumentException("Wrong headStringLength!");
            }
        }
        updateHeadIndex(headIndex, rule);

    }

    private static boolean equalsLength(int headReadStringLength, int ruleCharsLength) {
        return headReadStringLength == ruleCharsLength;
    }

    private static void replace(List<String> tapeOfChars, int headIndex, int substrIdx1, int substrIdx2, Rule rule) {
        tapeOfChars.add(headIndex, rule.getHeadWriteString().substring(substrIdx1, substrIdx2));
    }

    private static void updateHeadIndex(int headIndex, Rule rule) {
        if (
                equalsStringChars(rule.getHeadDirection(), 0, 1, "R")
        ) {
            headIndex++;
        } else if (
                equalsStringChars(rule.getHeadDirection(), 0, 1, "L")
        ) {
            headIndex--;
        } else if (
                equalsStringChars(rule.getHeadDirection(), 0, 1, "S")
        ) {
            return;
        } else {
            throw new IllegalArgumentException("Wrong head direction!");
        }
    }

    private static boolean equalsStringChars(String ruleString, int substrIdx1, int substrIdx2, String currentValue) {
        return ruleString.substring(substrIdx1, substrIdx2).equals(currentValue);
    }

}
