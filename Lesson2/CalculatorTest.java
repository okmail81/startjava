import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator Calculator = new Calculator();
        
        while(answer.equals("yes")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int num1 = scan.nextInt();
            
            System.out.println("Введите знак математической операции:");
            char arithmeticSign = scan.next().charAt(0);
            
            System.out.println("Введите второе число:");
            int num2 = scan.nextInt();
            
            int result = Calculator.calculateExpression(num1, num2, arithmeticSign);
            
            System.out.println("Результат вычисления операции " + num1 + arithmeticSign + num2 + "=" + result);
            scan.nextLine();
            
            while(true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                }
            }
        }
    }
}