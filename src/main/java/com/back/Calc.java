package com.back;

public class Calc {
    public static int run(String expression){
        int result = 0;

        String[] expressionBits = expression.split(" ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[2]);

        if(expressionBits[1].equals("+")){
            result =  num1+num2;
        } else if(expressionBits[1].equals("-")){
            result = num1-num2;
        } else if (expressionBits[1].equals("*")) {
            result = num1*num2;
        }

        for(int i = 3; i<expressionBits.length; i++){
            if (expressionBits[i].equals("+")) {
                result += Integer.parseInt(expressionBits[i+1]);
            } else if(expressionBits[i].equals("-")){
                result -= Integer.parseInt(expressionBits[i+1]);
            } else if (expressionBits[i].equals("*")) {
                result *= Integer.parseInt(expressionBits[i+1]);
            }
        }

        return result;
    }
}