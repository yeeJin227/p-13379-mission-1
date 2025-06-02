package com.back;

public class Calc {
    public static int run(String expression){
        String[] expressionBits = expression.split(" ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[2]);

        if (expressionBits[1].equals("+")) {
            return num1+num2;
        }else if(expressionBits[1].equals("-")){
            return num1-num2;
        }

        return 0;
    }
}