package com.startjava.Lesson2_3_4.calculator;

public class Calculator {
    public int calculate(String[] arrayExpression) {
        int result = 0;
        int num1 = Integer.parseInt(arrayExpression[0]);
        int num2 = Integer.parseInt(arrayExpression[2]);
        switch(arrayExpression[1]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
                result = (int) Math.pow(num1, num2);
        }
        return result;
    }
}