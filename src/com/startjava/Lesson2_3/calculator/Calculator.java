package com.startjava.Lesson2_3.calculator;

public class Calculator {
    public int calculate(int num1, int num2, char sign) {
        int result = 0;
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
        }
        return result;
    }
}