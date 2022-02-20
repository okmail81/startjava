public class Calculator {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 8;
        String arithmeticSign = "/";
        long result = 1;
        
        if(arithmeticSign == "+") {
            result = num1 + num2;
        } else if(arithmeticSign == "-") {
            result = num1 - num2;
        } else if(arithmeticSign == "*") {
            result = num1 * num2;
        } else if(arithmeticSign == "/") {
            result = num1 / num2;
        } else if(arithmeticSign == "%") {
            result = num1 % num2;
        } else if(arithmeticSign == "^") {
            for(int i = 1; i<=num2; i++) {
                result = result * num1;
            }
        }
        System.out.println("Результат вычисления операции " + num1 + arithmeticSign + num2 + "=" + result);
    }
}