public class Cycle {
    public static void main(String[] args) {
        //1. Выведите на консоль с помощью цикла for все числа от [0, 20]
        System.out.println("\n1. Выведите на консоль с помощью цикла for все числа от [0, 20]");
        for(int i = 0; i <= 20; i++) {
            System.out.println("Число " + i);
        }
        
        //2. Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        System.out.println("\n2. Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
        
        int i = 6;
        while(i >= -6) {
            System.out.println("Число " + i);
            i = i - 2;
        }
        //3. Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        System.out.println("\n3. Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");
        i = 10;
        int numSum = 0;
        do {
            if (i % 2 > 0) {
                System.out.println("Число " + i);
                numSum = numSum + i;
            }
            i++;
        } while(i <= 20);
        System.out.println("Cумма нечетных чисел от [10, 20] - " + numSum);
    }
}