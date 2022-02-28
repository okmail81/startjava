import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        
        while(answer.equals("yes")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int num1 = scan.nextInt();
            
            System.out.println("Введите знак математической операции:");
            char sign = scan.next().charAt(0);
            
            System.out.println("Введите второе число:");
            int num2 = scan.nextInt();
            
            int result = calculator.calculate(num1, num2, sign);
            
            System.out.println("Результат вычисления операции " + num1 + sign + num2 + "=" + result);
            scan.nextLine();
            
            answer = "";
            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            }
        }
    }
}