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

            int result = calculator.calculate(expression);
            
            System.out.println("Результат вычисления операции " + expression.replace(" ", "") + "=" + result);

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            }  while(!(answer.equals("yes") || answer.equals("no")));
        }
    }
}