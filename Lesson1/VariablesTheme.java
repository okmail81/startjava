public class VariablesTheme {	
    public static void main(String[] args) {
		//1. Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");
		byte b = 109;
		short s = 32700;
		int i = 200000;
		long ln = 10873586;
		float f = 3.2546F;
		double d = 2.9854545451;
		char c = 'O';
		boolean bn = true;
		
		System.out.println("byte " + b);
		System.out.println("short " + s);
		System.out.println("int " + i);
		System.out.println("long " + ln);
		System.out.println("float " + f);
		System.out.println("double " + d);
		System.out.println("char " + c);
		System.out.println("boolean " + bn);
		
		//2. Расчет стоимости товара со скидкой
        System.out.println("");
		System.out.println("2. Расчет стоимости товара со скидкой");
		int productx = 100;
		int producty = 200;	
		int discount = 11;
		int sumproduct = productx + producty; 
		int sumdiscount = sumproduct * discount / 100;
		int totalsum = sumproduct - sumdiscount; 
		System.out.println("Стоимость товаров со скидкой " + totalsum);
		System.out.println("Скидка " + sumdiscount);
		
		//3. Вывод на консоль слова JAVA
        System.out.println("");
		System.out.println("3. Вывод на консоль слова JAVA");
		System.out.println("   J    a  v     v  a");
		System.out.println("   J   a a  v   v  a a");
		System.out.println("J  J  aaaaa  V V  aaaaa");
		System.out.println(" JJ  a     a  V  a     a");
		 		
		//4. Отображение min и max значений числовых типов данных
        System.out.println("");
		System.out.println("4. Отображение min и max значений числовых типов данных");
		
		byte byte_max = 127;
		System.out.println("byte MAX " + byte_max);
		byte_max = (byte) (byte_max + 1);
		System.out.println("byte MAX+1 " + byte_max);
		byte_max = (byte) (byte_max - 1);
		System.out.println("byte MAX-1 " + byte_max);
	
		short short_max = 32767;
		System.out.println("short MAX " + short_max);
		short_max = (short) (short_max + 1);
		System.out.println("short MAX+1 " + short_max);
		short_max = (short) (short_max - 1);
		System.out.println("short MAX-1 " + short_max);
				
		int int_max =  2147483647;
		System.out.println("Int MAX " + int_max);
		int_max = int_max + 1;
		System.out.println("Int MAX+1 " +int_max);
		int_max = int_max - 1;
		System.out.println("Int MAX-1 " +int_max);
		
		long long_max = 9223372036854775807L;
		System.out.println("long MAX " + long_max);
		long_max = long_max + 1;
		System.out.println("long MAX+1 " + long_max);
		long_max = long_max - 1;
		System.out.println("long MAX-1 " + long_max);
		
		float float_max = Float.MAX_VALUE;
		System.out.println("Float MAX " + String.format("%f", float_max));
		float_max = float_max + 1.0F;
		System.out.println("Float MAX+1 " + String.format("%f", float_max));
		float_max = float_max - 1.0F;
		System.out.println("Float MAX-1 " + String.format("%f", float_max));
		
		double double_max = Double.MAX_VALUE;
		System.out.println("Double MAX " + String.format("%f", double_max));
		double_max = double_max + 1.0;
		System.out.println("Double MAX+1 " + String.format("%f", double_max));
		double_max = double_max - 1.0;
		System.out.println("Double MAX-1 " + String.format("%f", double_max));
		
		//5. Перестановка значений переменных
		System.out.println("");
        System.out.println("5. Перестановка значений переменных");
		float variable1 = 5.78F;
		float variable2 = 9.63F;
		float variable_vrem;
		
		System.out.println("variable1 " + variable1);
		System.out.println("variable2 " + variable2);
		
		variable_vrem = variable1;
		variable1 = variable2;
		variable2 = variable_vrem;
		
		System.out.println("variable1 " + variable1);
		System.out.println("variable2 " + variable2);
		
		//6. Вывод ASCII-символов и их кодов
		System.out.println("");
        System.out.println("6. Вывод ASCII-символов и их кодов");
		
		int var1 = 35;
		int var2 = 38;
		int var3 = 64;
		int var4 = 94;
		int var5 = 95;
		System.out.println("35: " + (char) var1);
		System.out.println("38: " + (char) var2);
		System.out.println("64: " + (char) var3);
		System.out.println("94: " + (char) var4);
		System.out.println("95: " + (char) var5);
		
		//7. Произведение и сумма цифр числа
		System.out.println("");
        System.out.println("7. Произведение и сумма цифр числа");
		int variable = 345;
		int hundreds = variable / 100;
		int tens = (variable - hundreds * 100) / 10;
		int units = variable - hundreds * 100 - tens * 10;
		int sum = hundreds + tens + units;
		int proizv = hundreds * tens * units;
		System.out.println("Сумма: " + sum);
		System.out.println("Произведение: " + proizv);	
		
		//8. Вывод на консоль ASCII-арт Дюка
		System.out.println("");
        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
		/*
			/\                                                                                                                                       
		   /  \                                                                                                                                      
		  /_( )\                                                                                                                                     
		 /      \                                                                                                                                    
		/____/\__\
		*/
		String  s1 = "/";
		String  s2 = "\\";
		String  s3 = "_";
		String  s4 = "(";
		String  s5 = ")";
		String  pr = " ";
		System.out.println(pr + pr + pr + pr + s1 + s2);
		System.out.println(pr + pr + pr + s1 + pr + pr + s2);
		System.out.println(pr + pr + s1 + s3 + s4 + pr + s5 + s2);
		System.out.println(pr + s1 + pr + pr + pr + pr + pr + pr + s2);
		System.out.println(s1 + s3 + s3 + s3 + s3 + s1 + s2 + s3 + s3 + s2);

		//9. Отображение сотен, десятков, единиц числа
		System.out.println("");
        System.out.println("9. Отображение сотен, десятков, единиц числа");
		variable = 123;
		hundreds = variable/100;
		tens = (variable - hundreds * 100) / 10;
		units = variable - hundreds * 100 - tens * 10;
		sum = hundreds + tens + units;
		proizv = hundreds * tens * units;
		System.out.println("Сотни: " + hundreds);
		System.out.println("Десятки: " + tens);
		System.out.println("Единицы: " + units);
					
		//10. Преобразование секунд
		System.out.println("");
        System.out.println("10. Преобразование секунд");
		int variable_sec = 86399;
		int hour = variable_sec /60 / 60;
		int minute = (variable_sec - hour * 60 * 60) / 60;
		int seconds = (variable_sec - hour * 60 * 60 - minute * 60);
		System.out.println(hour + ":" + minute + ":" + seconds);
    }
}