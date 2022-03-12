package com.startjava.Lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        
        while(answer.equals("yes")) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите математическое выражение: ");
            String expression = scan.nextLine();
            String[] arrayExpression;
            arrayExpression = expression.split(" ");

            int result = calculator.calculate(arrayExpression);
            
            System.out.println("Результат вычисления операции " + arrayExpression[0] + arrayExpression[1] + arrayExpression[2] + "=" + result);

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            }  while(!(answer.equals("yes") || answer.equals("no")));
        }
    }
}