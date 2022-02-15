public class VariablesTheme {
    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        byte сores = 4;
        short frequency = 2300;
        int memory = 8192;
        long hardDrive = 714766;
        float frequencyDisplay = 59.9F;
        double processorTemperature = 63.7;
        boolean notebook = true;
        
        System.out.println("Ядер " + сores);
        System.out.println("Частота процессора " + frequency);
        System.out.println("Память " + memory);
        System.out.println("Жесткий диск " + hardDrive);
        System.out.println("Частота обновления монитора " + frequencyDisplay);
        System.out.println("Температура процессора " + processorTemperature);
        System.out.println("Это ноутбук " + notebook);
        
        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int priceX = 100;
        int priceY = 200; 
        int discount = 11;
        int sumProduct = priceX + priceY; 
        int sumDiscount = sumProduct * discount / 100;
        int totalSum = sumProduct - sumDiscount; 
        System.out.println("Стоимость товаров со скидкой " + totalSum);
        System.out.println("Скидка " + sumDiscount);
        
        //3. Вывод на консоль слова JAVA
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
                
        //4. Отображение min и max значений числовых типов данных
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        
        byte byteMax = 127;
        System.out.println("byte MAX " + byteMax);
        System.out.println("byte MAX+1 " + ++byteMax);
        System.out.println("byte MAX-1 " + --byteMax);
        
        short shortMax = 32767;
        System.out.println("short MAX " + shortMax);
        System.out.println("short MAX+1 " + ++shortMax);
        System.out.println("short MAX-1 " + --shortMax);
                
        int intMax =  2147483647;
        System.out.println("Int MAX " + intMax);
        System.out.println("Int MAX+1 " + ++intMax);
        System.out.println("Int MAX-1 " + --intMax);
        
        long longMax = 9223372036854775807L;
        System.out.println("long MAX " + longMax);
        System.out.println("long MAX+1 " + ++longMax);
        System.out.println("long MAX-1 " + --longMax);
        
        float floatMax = Float.MAX_VALUE;
        System.out.printf("Float MAX " + "%f", floatMax);
        System.out.printf("\nFloat MAX+1 " + "%f", ++floatMax);
        System.out.printf("\nFloat MAX-1 " + "%f", --floatMax);
        
        double doubleMax = Double.MAX_VALUE;
        System.out.printf("\nDouble MAX " + "%f", doubleMax);
        System.out.printf("\nDouble MAX+1 " + "%f", ++doubleMax);
        System.out.printf("\nDouble MAX-1 " + "%f", --doubleMax);
        
        //5. Перестановка значений переменных
        System.out.println("\n\n5. Перестановка значений переменных");
        float variable1 = 5.78F;
        float variable2 = 9.63F;
        float temporaryVariable;
        
        System.out.println("variable1 " + variable1);
        System.out.println("variable2 " + variable2);
        
        temporaryVariable = variable1;
        variable1 = variable2;
        variable2 = temporaryVariable;
        
        System.out.println("variable1 " + variable1);
        System.out.println("variable2 " + variable2);
        
        //6. Вывод ASCII-символов и их кодов
        System.out.println("\n6. Вывод ASCII-символов и их кодов");
        
        int var1 = 35;
        int var2 = 38;
        int var3 = 64;
        int var4 = 94;
        int var5 = 95;
        System.out.println("" + var1 + ": " + (char) var1);
        System.out.println("" + var2 + ": " + (char) var2);
        System.out.println("" + var3 + ": " + (char) var3);
        System.out.println("" + var4 + ": " + (char) var4);
        System.out.println("" + var5 + ": " + (char) var5);
        
        //7. Произведение и сумма цифр числа
        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNumber = 345;
        int hundreds = srcNumber / 100;
        int tens = srcNumber /10 % 10;
        int units = srcNumber % 10;
        int sum = hundreds + tens + units;
        int multiply = hundreds * tens * units;
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + multiply);
        
        //8. Вывод на консоль ASCII-арт Дюка
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openingParenthesis = '(';
        char closingParenthesis = ')';
        char whitespace = ' ';
        System.out.println("" + whitespace + whitespace + whitespace + whitespace + slash + backslash);
        System.out.println("" + whitespace + whitespace + whitespace + slash + whitespace + whitespace + backslash);
        System.out.println("" + whitespace + whitespace + slash + underscore + openingParenthesis + whitespace + closingParenthesis + backslash);
        System.out.println("" + whitespace + slash + whitespace + whitespace + whitespace + whitespace + whitespace + whitespace + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);
        
        //9. Отображение сотен, десятков, единиц числа
        System.out.println("\n9. Отображение сотен, десятков, единиц числа");
        srcNumber = 123;
        hundreds = srcNumber / 100;
        tens = srcNumber /10 % 10;
        units = srcNumber % 10;
        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Единицы: " + units);
        
        //10. Преобразование секунд
        System.out.println("\n10. Преобразование секунд");
        int variable_sec = 86399;
        int hour = variable_sec /60 / 60;
        int minute = (variable_sec - hour * 60 * 60) / 60;
        int seconds = (variable_sec - hour * 60 * 60 - minute * 60);
        System.out.println(hour + ":" + minute + ":" + seconds);
    }
}