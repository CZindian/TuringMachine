package cz.osu.ts;

import cz.osu.ts.model.Rule;
import cz.osu.ts.model.State;

public class Config {

    //region States
    private static final State q0 = new State("xy01", "yx01", "R");
    private static final State q1 = new State("01", "01", "R");
    private static final State q2 = new State();
    private static final State q3 = new State("10", "10", "L");
    private static final State q4 = new State("xy", "xy", "L");
    private static final State q5 = new State("1", "0", "L");
    private static final State q6 = new State("01", "01", "L");
    private static final State q8 = new State("10", "10", "L");
    private static final State q9 = new State("xy", "xy", "L");
    private static final State q10 = new State("yx", "10", "L");
    private static final State qk = new State();
    //endregion

    //region Rules
    public static final Rule ruleQ0Q1 = new Rule(q0, q1, "#", "#", "R");
    public static final Rule ruleQ1Q2 = new Rule(q1, q2, "#", "#", "L");

    public static final Rule ruleQ2Q3 = new Rule(q2, q3, "1", "#", "L");
    public static final Rule ruleQ3Q4 = new Rule(q3, q4, "#", "#", "L");
    public static final Rule ruleQ4Q6 = new Rule(q4, q6, "0", "y", "L");

    public static final Rule ruleQ4Q5 = new Rule(q4, q5, "1", "x", "L");
    public static final Rule ruleQ5Q0 = new Rule(q5, q0, "#0", "11", "R");

    public static final Rule ruleQ6Q0 = new Rule(q6, q0, "#", "#", "R");

    public static final Rule ruleQ2Q8 = new Rule(q2, q8, "0", "#", "L");
    public static final Rule ruleQ8Q9 = new Rule(q8, q9, "#", "#", "L");
    public static final Rule ruleQ9Q0 = new Rule(q9, q0, "01", "xy", "L");

    public static final Rule ruleQ2QK = new Rule(q2, q10, "xy#", "xy#", "S");
    public static final Rule ruleQ10QK = new Rule(q10, qk, "01", "01", "S");

    //endregion

}
