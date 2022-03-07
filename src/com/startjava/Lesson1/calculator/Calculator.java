package com.startjava.Lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 3;
        char arithmeticSign = '-';
        long result = 0;
        
        if(arithmeticSign == '+') {
            result = num1 + num2;
        } else if(arithmeticSign == '-') {
            result = num1 - num2;
        } else if(arithmeticSign == '*') {
            result = num1 * num2;
        } else if(arithmeticSign == '/') {
            result = num1 / num2;
        } else if(arithmeticSign == '%') {
            result = num1 % num2;
        } else if(arithmeticSign == '^') {
            result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
        }
        System.out.println("Результат вычисления операции " + num1 + arithmeticSign + num2 + "=" + result);
    }
}