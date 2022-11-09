package com.company;

import static com.company.Constants.*;
import static com.company.Operation.*;

public class Config {

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
            new RuleDualTape(0, 1, a, h, h, a, RIGHT, RIGHT),
            new RuleDualTape(0, 1, b, h, h, b, RIGHT, RIGHT),
            new RuleDualTape(0, 1, c, h, h, c, RIGHT, RIGHT),
            new RuleDualTape(0, 1, d, h, h, d, RIGHT, RIGHT),

            new RuleDualTape(1, 0, a, h, h, h, RIGHT, STAY),
            new RuleDualTape(1, 0, b, h, h, b, RIGHT, RIGHT),
            new RuleDualTape(1, 0, c, h, h, h, RIGHT, STAY),
            new RuleDualTape(1, 0, d, h, h, d, RIGHT, RIGHT),

            new RuleDualTape(0, 2, h, h, h, h, STAY, LEFT),
            new RuleDualTape(1, 2, h, h, h, h, LEFT, LEFT),

            new RuleDualTape(2, 2, h, a, a, h, LEFT, LEFT),
            new RuleDualTape(2, 2, h, b, b, h, LEFT, LEFT),
            new RuleDualTape(2, 2, h, c, c, h, LEFT, LEFT),
            new RuleDualTape(2, 2, h, d, d, h, LEFT, LEFT),

            new RuleDualTape(2, 3, h, h, h, h, RIGHT, RIGHT),

            new RuleDualTape(3, 3, a, a, h, h, RIGHT, STAY),
            new RuleDualTape(3, 3, b, b, h, h, RIGHT, STAY),
            new RuleDualTape(3, 3, c, c, h, h, RIGHT, STAY),
            new RuleDualTape(3, 3, d, d, h, d, RIGHT, RIGHT),

            new RuleDualTape(3, 4, h, h, h, h, LEFT, STAY),

            new RuleDualTape(4, 4, a, a, h, h, LEFT, STAY),
            new RuleDualTape(4, 4, b, b, h, h, LEFT, STAY),
            new RuleDualTape(4, 4, c, c, h, c, LEFT, RIGHT),
            new RuleDualTape(4, 4, d, d, h, h, LEFT, STAY),

            new RuleDualTape(4, 5, h, h, h, h, RIGHT, STAY),

            new RuleDualTape(5, 5, a, a, h, h, RIGHT, STAY),
            new RuleDualTape(5, 5, b, b, h, b, RIGHT, RIGHT),
            new RuleDualTape(5, 5, c, c, h, h, RIGHT, STAY),
            new RuleDualTape(5, 5, d, d, h, h, RIGHT, STAY),

            new RuleDualTape(5, 6, h, h, h, h, LEFT, STAY),

            new RuleDualTape(6, 6, a, a, h, a, LEFT, RIGHT),
            new RuleDualTape(6, 6, b, b, h, h, LEFT, STAY),
            new RuleDualTape(6, 6, c, c, h, h, LEFT, STAY),
            new RuleDualTape(6, 6, d, d, h, h, LEFT, STAY),

            new RuleDualTape(6, 7, h, h, h, h, STAY, STAY),
    };
    //endregion
    //region Dual tape machine rules for binary export
    public static final RuleDualTape[] rulesForBinaryExport = new RuleDualTape[]{
            new RuleDualTape(0, 0, i, i, o, o, RIGHT, RIGHT),
            new RuleDualTape(0, 0, o, o, i, i, RIGHT, RIGHT),
            new RuleDualTape(0, 0, i, i, i, i, RIGHT, RIGHT),
            new RuleDualTape(0, 0, o, o, o, o, RIGHT, RIGHT),

            new RuleDualTape(0, 1, h,h,h,h, LEFT, LEFT),

            new RuleDualTape(1, 1, o, o, i, i, LEFT, LEFT),
            new RuleDualTape(1, 1, i, o, i, i, LEFT, LEFT),
            new RuleDualTape(1, 1, i, i, o, o, LEFT, LEFT),
            new RuleDualTape(1, 1, o, o, o, o, LEFT, LEFT),

            new RuleDualTape(1, 2, h,h,h,h, RIGHT, RIGHT),

            new RuleDualTape(2, 2, o,h,o,h, RIGHT, RIGHT),

            new RuleDualTape(2, 3, i,o,o,h, RIGHT, RIGHT),
            new RuleDualTape(2, 4, o,i,i,h, RIGHT, RIGHT),

            new RuleDualTape(3, 3, o,h,o,h, RIGHT, RIGHT),
            new RuleDualTape(3, 3, i,h,i,h, RIGHT, RIGHT),
            new RuleDualTape(3, 3, o,h,i,h, RIGHT, RIGHT),
            new RuleDualTape(3, 3, i,h,o,h, RIGHT, RIGHT),

            new RuleDualTape(4, 4, o,h,o,h, RIGHT, RIGHT),
            new RuleDualTape(4, 4, i,h,i,h, RIGHT, RIGHT),
            new RuleDualTape(4, 4, o,h,i,h, RIGHT, RIGHT),
            new RuleDualTape(4, 4, i,h,o,h, RIGHT, RIGHT),

            new RuleDualTape(3, 5, h,h,h,h, STAY, STAY),
            new RuleDualTape(4, 5, h,h,h,h, STAY, STAY),













    };
    //endregion
}
