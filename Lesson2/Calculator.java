public class Calculator {
    public int calculateExpression(int num1, int num2, char arithmeticSign) {
        int result = 0;
        switch(arithmeticSign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
        }
        return result;
    }
}