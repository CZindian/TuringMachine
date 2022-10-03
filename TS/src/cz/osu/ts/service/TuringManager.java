package cz.osu.ts.service;

import cz.osu.ts.model.Rule;
import cz.osu.ts.model.Tape;

import java.util.ArrayList;
import java.util.List;

import static cz.osu.ts.service.RuleManager.*;

public class TuringManager {

    private static List<Rule> rules;

    public static void manageTuring(Tape tape, String binaryDigit1) {
        List<String> tapeOfChars = tape.getTapeOfChars();
        int headIndex = getFirstNonEmptyIdx(tapeOfChars);

        readTapeOfChars(headIndex, tapeOfChars, binaryDigit1);

    }

    private static void readTapeOfChars(int headIndex, List<String> tapeOfChars, String binaryDigit1) {
        rules = getRules();
        int beginingIndex = headIndex;
        int endIndex = beginingIndex + binaryDigit1.length();

        while(!containsOnlyDigitBetween(tapeOfChars, beginingIndex, endIndex)){
            for (Rule rule : rules){
                RuleManager.checkByRule(headIndex, tapeOfChars, rule);
            }
        }
    }

    private static List<Rule> getRules(){
        if (rules == null || rules.isEmpty()){
            fillRules();
            return rules;
        }else {
            return rules;
        }
    }

    private static void fillRules() {
        rules = new ArrayList<Rule>();
        addRule(ruleQ0Q1);
        addRule(ruleQ1Q2);
        addRule(ruleQ2Q3);
        addRule(ruleQ3Q4);
        addRule(ruleQ4Q5);
        addRule(ruleQ4Q6);
        addRule(ruleQ5Q0);
        addRule(ruleQ6Q0);
        addRule(ruleQ2Q8);
        addRule(ruleQ8Q9);
        addRule(ruleQ9Q0);
        addRule(ruleQ2QK);
        addRule(ruleQ10QK);
    }

    private static void addRule(Rule rule) {
        rules.add(rule);
    }

    private static boolean containsOnlyDigitBetween(List<String> tapeOfChars, int beginingIndex, int endIndex) {
        boolean ret = false;
        if (tapeOfChars.get(endIndex+2).equals("#")){
            for (int i = beginingIndex; i <= endIndex; i++) {
                ret = tapeOfChars.get(i).equals("0") || tapeOfChars.get(i).equals("1");
            }
        }

        return ret;
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
