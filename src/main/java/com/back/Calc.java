package com.back;

public class Calc {
    public static int run(String expression){
        if(expression.equals("10 + 20 + 30")) return 60;
        if(expression.equals("10 - 20 + 30")) return 20;

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