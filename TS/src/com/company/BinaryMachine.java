package com.company;

public class BinaryMachine {
    private BinaryMachine(){};

    /* 
    Rules encoding system:
    
    start of rules                  10101
    start of rule                   111
    String readSymbol               0 -> 00; 1 -> 01; # -> 11;
    String writeSymbol              0 -> 00; 1 -> 01; # -> 11;
    int currentState                6b number 0-63
    int nextState                   6b number 0-63
    Operation operation             RIGHT -> 00; LEFT -> 01; STAY -> 11;
    end of rule                     101
    after last rule: finalState     6b number 0-63
    end of rules                    10101
    */
    public static Rule[] decodeMachineToRules(String binaryRules){
        Rule[] rules = new Rule[0];
        //regex: (10101)((111)(([01]{2})([01]{2})([01]{6})([01]{6})([01]{2}))(101))*(([01]{6}))(10101)

        return rules;

    }
    public static String encodeMachineToBinary(Rule[] rules,int finalState){
        String binaryTuringRules;
        StringBuffer buffer = new StringBuffer();
        buffer.append("10101");
        for (Rule r : rules) {
            buffer.append("111");

            //readSymbol  0 -> 00; 1 -> 01; # -> 11
            buffer.append(convertSymbolToBinary(r.readSymbol));

            //readSymbol  0 -> 00; 1 -> 01; # -> 11
            buffer.append(convertSymbolToBinary(r.writeSymbol));

            //currentState   6b number 0-63
            buffer.append(convertToSixBitBinary(r.currentState));

            //nextState    6b number 0-63
            buffer.append(convertToSixBitBinary(r.nextState));

            //operation     RIGHT -> 00; LEFT -> 01; STAY -> 11
            switch (r.operation){
                case RIGHT -> buffer.append("00");
                case LEFT -> buffer.append("01");
                case STAY -> buffer.append("11");
            }
            buffer.append("101");
        }
        buffer.append(convertToSixBitBinary(finalState));
        buffer.append("10101");

        binaryTuringRules = buffer.toString();
        return binaryTuringRules;

    }
    private static String convertSymbolToBinary(String symbol){
        String ret = "";
        //read/writeSymbol   0 -> 00; 1 -> 01; # -> 11;
        switch (symbol){
            case "X" -> ret = "00"; //for test porous
            case "Y" -> ret = "01"; //for test porous
            case "1" -> ret = "00";
            case "0" -> ret = "01";
            case "#" -> ret = "11";
        }
        return ret;
    }
    private static String convertToSixBitBinary(int number){

        String ret = Integer.toBinaryString(number);
        ret = String.format("%6s", ret).replaceAll(" ", "0");
        return ret;
    }
}
