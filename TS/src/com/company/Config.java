package com.company;

public class Config {

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
}
