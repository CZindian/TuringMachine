package com.company;

import static com.company.Operation.*;

public class Config {

    //region Config constants
    private static final String a = "A";
    public static final String b = "B";
    public static final String c = "C";
    public static final String d = "D";
    public static final String hash = "#";
    //endregion

    //region One tape machine rules
    public static final Rule[] rules = new Rule[]{
            new Rule(0, 0, "X", "X", Operation.RIGHT),
            new Rule(0, 0, "Y", "Y", Operation.RIGHT),
            new Rule(0, 0, "1", "1", Operation.RIGHT),
            new Rule(0, 0, "0", "0", Operation.RIGHT),

            new Rule(0, 1, "#", "#", Operation.RIGHT),

            new Rule(1, 1, "0", "0", Operation.RIGHT),
            new Rule(1, 1, "1", "1", Operation.RIGHT),

            new Rule(1, 2, "#", "#", Operation.LEFT),

            new Rule(2, 7, "0", "#", Operation.LEFT),
            new Rule(2, 3, "1", "#", Operation.LEFT),
            new Rule(2, 9, "X", "X", Operation.STAY),
            new Rule(2, 9, "Y", "Y", Operation.STAY),

            new Rule(2, 9, "#", "#", Operation.LEFT),

            new Rule(3, 3, "1", "1", Operation.LEFT),
            new Rule(3, 3, "0", "0", Operation.LEFT),
            new Rule(3, 4, "#", "#", Operation.LEFT),

            new Rule(4, 4, "X", "X", Operation.LEFT),
            new Rule(4, 4, "Y", "Y", Operation.LEFT),
            new Rule(4, 5, "0", "X", Operation.LEFT),
            new Rule(4, 6, "1", "Y", Operation.LEFT),

            new Rule(5, 5, "1", "1", Operation.LEFT),
            new Rule(5, 5, "0", "0", Operation.LEFT),
            new Rule(5, 0, "#", "#", Operation.RIGHT),

            new Rule(6, 6, "1", "0", Operation.LEFT),
            new Rule(6, 0, "#", "1", Operation.RIGHT),
            new Rule(6, 0, "0", "1", Operation.RIGHT),

            new Rule(7, 7, "1", "1", Operation.LEFT),
            new Rule(7, 7, "0", "0", Operation.LEFT),
            new Rule(7, 8, "#", "#", Operation.LEFT),

            new Rule(8, 8, "X", "X", Operation.LEFT),
            new Rule(8, 8, "Y", "Y", Operation.LEFT),

            new Rule(8, 0, "1", "X", Operation.LEFT),
            new Rule(8, 0, "0", "Y", Operation.LEFT),

            new Rule(9, 9, "X", "1", Operation.LEFT),
            new Rule(9, 9, "Y", "0", Operation.LEFT),
            new Rule(9, 9, "1", "1", Operation.LEFT),
            new Rule(9, 9, "0", "0", Operation.LEFT),
            new Rule(9, 10, "#", "#", Operation.STAY)
    };
    //endregion
    //region Dual tape machine rules
    public static final RuleDualTape[] rulesDualTape = new RuleDualTape[]{
            new RuleDualTape(0, 1, a, hash, hash, a, RIGHT, RIGHT),
            new RuleDualTape(0, 1, b, hash, hash, b, RIGHT, RIGHT),
            new RuleDualTape(0, 1, c, hash, hash, c, RIGHT, RIGHT),
            new RuleDualTape(0, 1, d, hash, hash, d, RIGHT, RIGHT),

            new RuleDualTape(1, 0, a, hash, hash, hash, RIGHT, STAY),
            new RuleDualTape(1, 0, b, hash, hash, b, RIGHT, RIGHT),
            new RuleDualTape(1, 0, c, hash, hash, hash, RIGHT, STAY),
            new RuleDualTape(1, 0, d, hash, hash, d, RIGHT, RIGHT),

            new RuleDualTape(0, 2, hash, hash, hash, hash, STAY, LEFT),
            new RuleDualTape(1, 2, hash, hash, hash, hash, LEFT, LEFT),

            new RuleDualTape(2, 2, hash, a, a, hash, LEFT, LEFT),
            new RuleDualTape(2, 2, hash, b, b, hash, LEFT, LEFT),
            new RuleDualTape(2, 2, hash, c, c, hash, LEFT, LEFT),
            new RuleDualTape(2, 2, hash, d, d, hash, LEFT, LEFT),

            new RuleDualTape(2, 3, hash, hash, hash, hash, RIGHT, RIGHT),

            new RuleDualTape(3, 3, a, a, hash, hash, RIGHT, STAY),
            new RuleDualTape(3, 3, b, b, hash, hash, RIGHT, STAY),
            new RuleDualTape(3, 3, c, c, hash, hash, RIGHT, STAY),
            new RuleDualTape(3, 3, d, d, hash, d, RIGHT, RIGHT),

            new RuleDualTape(3, 4, hash, hash, hash, hash, LEFT, STAY),

            new RuleDualTape(4, 4, a, a, hash, hash, LEFT, STAY),
            new RuleDualTape(4, 4, b, b, hash, hash, LEFT, STAY),
            new RuleDualTape(4, 4, c, c, hash, c, LEFT, RIGHT),
            new RuleDualTape(4, 4, d, d, hash, hash, LEFT, STAY),

            new RuleDualTape(4, 5, hash, hash, hash, hash, RIGHT, STAY),

            new RuleDualTape(5, 5, a, a, hash, hash, RIGHT, STAY),
            new RuleDualTape(5, 5, b, b, hash, b, RIGHT, RIGHT),
            new RuleDualTape(5, 5, c, c, hash, hash, RIGHT, STAY),
            new RuleDualTape(5, 5, d, d, hash, hash, RIGHT, STAY),

            new RuleDualTape(5, 6, hash, hash, hash, hash, LEFT, STAY),

            new RuleDualTape(6, 6, a, a, hash, a, LEFT, RIGHT),
            new RuleDualTape(6, 6, b, b, hash, hash, LEFT, STAY),
            new RuleDualTape(6, 6, c, c, hash, hash, LEFT, STAY),
            new RuleDualTape(6, 6, d, d, hash, hash, LEFT, STAY),

            new RuleDualTape(6, 7, hash, hash, hash, hash, STAY, STAY),
    };
    //endregion
}
