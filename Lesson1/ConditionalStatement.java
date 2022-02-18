public class ConditionalStatement {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        
        byte age = 23;
        boolean isMail = false;
        float height = 1.75F;
        String name = "Oleg";
        
        if(age > 20) {
            System.out.println("Возраст = " + age + " - может участвовать");
        } else {
            System.out.println("Возраст = " + age + " - не может участвовать");
        }

        if(!isMail) {
            System.out.println("Женский пол - поместить в другую группу");
        }
        
        if(height < 1.80) {
            System.out.println("Рост меньше 1.8 - в танковые войска");
        } else {
            System.out.println("Рост больше 1.8 - в ВДВ");
        }
        
        char firstLetterName = name.charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Поместить во вторую группу");
        } else if(firstLetterName == 'I') {
            System.out.println("Поместить в третью группу");
        } else {
            System.out.println("Поместить в любую группу");
        }
        
        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int num1 = 0;
        int num2 = 1870;
        if(num1 > num2) {
            System.out.println("Максимальное число - " + num1 + ", минимальное число " + num2);
        } else {
            System.out.println("Максимальное число - " + num2 + ", минимальное число " + num1);
        }
        
        //3. Работа с числом
        System.out.println("\n3. Работа с числом");
        int srcNumber = -19782;
        if(srcNumber % 2 == 0) {
            System.out.println("Число " + srcNumber + " четное");
        } else {
            System.out.println("Число " + srcNumber + " нечетное"); 
        }
        if(srcNumber > 0) {
            System.out.println("Число " + srcNumber + " больше нуля");
        } else if(srcNumber < 0) {
            System.out.println("Число " + srcNumber + " меньше нуля"); 
        } else {
            System.out.println("Число " + srcNumber + " это ноль"); 
        }
        
        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах");
        num1 = 345;
        num2 = 975;
        if(num1 / 100 == num2 / 100) {
            System.out.println("Цифра 1 в числах " + num1 + " и " + num2 + " одинаковая");
        }
        if(num1 / 10 % 10 == num2 / 10 % 10) {
            System.out.println("Цифра 2 в числах " + num1 + " и " + num2 + " одинаковая");
        }
        if(num1 % 10 == num2 % 10) {
            System.out.println("Цифра 3 в числах " + num1 + " и " + num2 + " одинаковая");
        }
        
        //5. Определение буквы или символа по их коду
        System.out.println("\n5. Определение буквы или символа по их коду");
        char elementСode = '\u005A';
        System.out.print("В переменной символ " + elementСode + " с кодом " + (int)elementСode);
        if((int)elementСode >= 48 && (int)elementСode <=57){
            System.out.println(" - это число");
        } else if(((int)elementСode >= 65 && (int)elementСode <= 90) || ((int)elementСode >= 97 && (int)elementСode <= 122)) { 
            System.out.println(" - это буква");
        } else {
            System.out.println(" - это не буква и не число");
        }
        
        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        float depositAmount = 300000.0F;
        float  depositPercentage;
        if(depositAmount < 100000) {
            depositPercentage = 5;
        } else if(depositAmount >= 100000 || depositAmount <= 300000) {
            depositPercentage = 7;
        } else {
            depositPercentage = 10;
        }
        float TotalSum = depositAmount + depositAmount * depositPercentage / 100;
        System.out.println("Сумма вклада - " + depositAmount + ", начисленный процент - " + depositAmount * depositPercentage / 100 + ", итог - " + TotalSum);
        
        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percentageHistory = 59;
        int percentageProgramming = 91;
        int scoreHistory;
        int scoreProgramming;
        
        if(percentageHistory <= 60) {
            scoreHistory = 2;
        } else if(percentageHistory > 60 || percentageHistory < 73) {
            scoreHistory = 3;
        } else if(percentageHistory >= 73 || percentageHistory < 91) {
            scoreHistory = 4;
        } else {
            scoreHistory = 5;
        }
        System.out.println("История - " + scoreHistory);
        
        if(percentageProgramming <= 60) {
            scoreProgramming = 2;
        } else if(percentageProgramming > 60 && percentageProgramming < 73) {
            scoreProgramming = 3;
        } else if(percentageProgramming >= 73 && percentageProgramming < 91) {
            scoreProgramming = 4;
        } else {
            scoreProgramming = 4;
        }
        System.out.println("Программирование - " + scoreProgramming);
        
        int averageScore = (scoreHistory + scoreProgramming) / 2;
        System.out.println("Средний балл - " + averageScore);
        
        int averagePercentage = (percentageHistory + percentageProgramming) / 2;
        System.out.println("Средний процент - " + averagePercentage);
        
        //8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)");
        int roomRent = 5000;
        int proceeds = 15000;
        int costPrice = 9000;
        int financialResult = proceeds * 12 - roomRent * 12 - costPrice * 12;
        if(financialResult > 0) {
            System.out.println("Прибыль: " + financialResult);
        } else {
            financialResult = -financialResult;
            System.out.println("Убыток: " + financialResult);
        }
       
       //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");
        double sideA = 5;
        double sideB = 5;
        double sideC = 7;
        double halfMeter = (sideA + sideB + sideC) / 2;
        double areaTriangle = Math.sqrt(halfMeter * (halfMeter - sideA) * (halfMeter - sideB) * (halfMeter - sideC));
        
        if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        System.out.println("Полупериметр - " + halfMeter);
        System.out.println("Площадь треугольника - " + areaTriangle);
        char backslash = '\\';
        char underscore = '_';
        char straightLine = '|';
        char whitespace = ' ';
        System.out.println("" + straightLine + whitespace + backslash);
        System.out.println("" + straightLine + whitespace + whitespace + backslash);
        System.out.println("" + straightLine + whitespace + whitespace + whitespace + backslash);
        System.out.println("" + straightLine + whitespace + whitespace + whitespace + whitespace + backslash);
        System.out.println("" + straightLine + underscore + underscore + underscore + underscore + underscore + backslash);
        
       //10. Подсчет количества банкнот
       System.out.println("\n10. Подсчет количества банкнот");
       int amount = 567;
       int banknote50 = amount / 50;
       int banknote10 = amount % 50 / 10;
       int banknote1 = amount % 50 % 10;
       System.out.println("Банкнот 50 - " + banknote50 + ", банкнот 10 - " + banknote10 + ", банкнот 1 - " + banknote1);
       banknote50 = 11;
       banknote10 = 1;
       banknote1 = 7;
       amount = banknote50 * 50 + banknote10 * 10 + banknote1;
       System.out.println("Выдаваемая сумма - " + amount);
       
    }
}