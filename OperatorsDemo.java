/**
 * Демонстрация всех операторов Java с базовыми типами и String.
 * Включает примеры приоритета операторов.
 *
 * @author Isszrn
 * @version 1.0
 */
public class OperatorsDemo {
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ОПЕРАТОРЫ JAVA ===\n");
        
        // 1. Оператор присваивания =
        System.out.println("--- 1. Оператор присваивания = ---");
        int x = 10;
        String s = "Hello";
        System.out.println("int x = 10;        // x = " + x);
        System.out.println("String s = \"Hello\"; // s = " + s);
        
        // 2. Составные операторы присваивания (+=, -=, *=, /=, %=)
        System.out.println("\n--- 2. Составные операторы ---");
        int a = 5;
        System.out.println("int a = 5;");
        
        a += 3;  // a = a + 3
        System.out.println("a += 3;  // a = " + a);
        
        a -= 2;  // a = a - 2
        System.out.println("a -= 2;  // a = " + a);
        
        a *= 4;  // a = a * 4
        System.out.println("a *= 4;  // a = " + a);
        
        a /= 3;  // a = a / 3
        System.out.println("a /= 3;  // a = " + a);
        
        a %= 5;  // a = a % 5
        System.out.println("a %= 5;  // a = " + a);
        
        // Составные операторы со String
        System.out.println("\n--- += со String ---");
        String str = "Java";
        System.out.println("String str = \"Java\";");
        str += " is";
        str += " cool!";
        System.out.println("str += \" is\"; str += \" cool!\"; // str = " + str);
        
        // 3. Тернарный оператор ?:
        System.out.println("\n--- 3. Тернарный оператор ?: ---");
        int age = 20;
        String status = (age >= 18) ? "совершеннолетний" : "несовершеннолетний";
        System.out.println("age = 20;");
        System.out.println("status = (age >= 18) ? \"совершеннолетний\" : \"несовершеннолетний\";");
        System.out.println("status = " + status);
        
        int max = (10 > 5) ? 10 : 5;
        System.out.println("max = (10 > 5) ? 10 : 5; // max = " + max);
        
        // 4. Логические операторы
        System.out.println("\n--- 4. Логические операторы ---");
        boolean t = true;
        boolean f = false;
        
        System.out.println("|| (ИЛИ):");
        System.out.println("true || false = " + (t || f));
        System.out.println("false || false = " + (f || f));
        
        System.out.println("\n&& (И):");
        System.out.println("true && false = " + (t && f));
        System.out.println("true && true = " + (t && t));
        
        // Короткое замыкание
        System.out.println("\n--- Короткое замыкание ---");
        int n = 5;
        boolean result = (n > 3) || (n++ > 10);  // вторая часть не выполняется
        System.out.println("n = 5;");
        System.out.println("(n > 3) || (n++ > 10) -> " + result + ", n остался = " + n);
        
        result = (n < 3) && (n++ > 10);  // вторая часть не выполняется
        System.out.println("(n < 3) && (n++ > 10) -> " + result + ", n остался = " + n);
        
        // 5. Побитовые операторы
        System.out.println("\n--- 5. Побитовые операторы ---");
        int p = 5;  // 0101 в двоичной
        int q = 3;  // 0011 в двоичной
        
        System.out.println("5 (0101) | 3 (0011) = " + (p | q) + " (0111 = 7)");
        System.out.println("5 (0101) ^ 3 (0011) = " + (p ^ q) + " (0110 = 6)");
        System.out.println("5 (0101) & 3 (0011) = " + (p & q) + " (0001 = 1)");
        System.out.println("~5 = " + (~p) + " (инверсия битов)");
        
        // 6. Операторы сравнения
        System.out.println("\n--- 6. Операторы сравнения == != > >= < <= ---");
        System.out.println("5 == 5: " + (5 == 5));
        System.out.println("5 != 3: " + (5 != 3));
        System.out.println("5 > 3:  " + (5 > 3));
        System.out.println("5 >= 5: " + (5 >= 5));
        System.out.println("5 < 10: " + (5 < 10));
        System.out.println("5 <= 5: " + (5 <= 5));
        
        // Сравнение String (важно!)
        System.out.println("\n--- Сравнение String ---");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        
        System.out.println("s1 = \"Hello\"; s2 = \"Hello\"; s3 = new String(\"Hello\");");
        System.out.println("s1 == s2: " + (s1 == s2) + " (сравнение ссылок)");
        System.out.println("s1 == s3: " + (s1 == s3) + " (разные объекты!)");
        System.out.println("s1.equals(s3): " + s1.equals(s3) + " (сравнение содержимого)");
        
        // 7. Операторы сдвига
        System.out.println("\n--- 7. Операторы сдвига >> >>> << ---");
        int num = 8;  // 1000 в двоичной
        
        System.out.println("8 << 1  = " + (num << 1) + " (сдвиг влево, умножить на 2)");
        System.out.println("8 >> 1  = " + (num >> 1) + " (сдвиг вправо, разделить на 2)");
        System.out.println("-8 >> 1 = " + (-8 >> 1) + " (с сохранением знака)");
        System.out.println("-8 >>> 1 = " + (-8 >>> 1) + " (без сохранения знака)");
        
        // 8. Арифметические операторы
        System.out.println("\n--- 8. Арифметические операторы + - * / % ---");
        System.out.println("10 + 5 = " + (10 + 5));
        System.out.println("10 - 5 = " + (10 - 5));
        System.out.println("10 * 5 = " + (10 * 5));
        System.out.println("10 / 3 = " + (10 / 3) + " (целочисленное деление)");
        System.out.println("10.0 / 3 = " + (10.0 / 3) + " (деление с плавающей точкой)");
        System.out.println("10 % 3 = " + (10 % 3) + " (остаток от деления)");
        
        // Конкатенация String с +
        System.out.println("\n--- Оператор + со String ---");
        String hello = "Привет";
        String world = "мир";
        System.out.println("hello + \", \" + world + \"!\" = " + hello + ", " + world + "!");
        System.out.println("Число: " + 42);
        System.out.println("Сумма: " + (10 + 20));  // скобки важны!
        System.out.println("Без скобок: " + 10 + 20);  // конкатенация слева направо
        
        // 9. Инкремент и декремент (префиксная и постфиксная формы)
        System.out.println("\n--- 9. Инкремент ++ и декремент -- ---");
        
        // Постфиксная форма (сначала используется, потом увеличивается)
        System.out.println("--- Постфиксная форма (x++) ---");
        int y = 5;
        System.out.println("int y = 5;");
        System.out.println("y++   = " + (y++) + " (вернуло 5, теперь y = " + y + ")");
        System.out.println("y--   = " + (y--) + " (вернуло 6, теперь y = " + y + ")");
        
        // Префиксная форма (сначала увеличивается, потом используется)
        System.out.println("\n--- Префиксная форма (++x) ---");
        int z = 5;
        System.out.println("int z = 5;");
        System.out.println("++z   = " + (++z) + " (увеличило до 6, вернуло 6)");
        System.out.println("--z   = " + (--z) + " (уменьшило до 5, вернуло 5)");
        
        // Пример разницы
        System.out.println("\n--- Разница между префиксной и постфиксной ---");
        int a1 = 10;
        int b1 = a1++;  // b1 = 10, a1 = 11
        System.out.println("int a1 = 10;");
        System.out.println("int b1 = a1++; // b1 = " + b1 + ", a1 = " + a1);
        
        int a2 = 10;
        int b2 = ++a2;  // b2 = 11, a2 = 11
        System.out.println("int a2 = 10;");
        System.out.println("int b2 = ++a2; // b2 = " + b2 + ", a2 = " + a2);
        
        // 10. Операторы ~ и !
        System.out.println("\n--- 10. Операторы ~ (побитовое НЕ) и ! (логическое НЕ) ---");
        int num2 = 5;  // 0000 0101
        System.out.println("int num = 5;");
        System.out.println("~num = " + (~num2) + " (побитовая инверсия)");
        
        boolean flag = true;
        System.out.println("boolean flag = true;");
        System.out.println("!flag = " + (!flag));
        
        // 11. Скобки () и []
        System.out.println("\n--- 11. Скобки () и [] ---");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("int[] arr = {1, 2, 3, 4, 5};");
        System.out.println("arr[2] = " + arr[2]);
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4) + " (приоритет *)");
        
        // 12. Демонстрация приоритета операторов
        System.out.println("\n--- 12. Приоритет операторов ---");
        int result1 = 2 + 3 * 4;        // 14, не 20
        int result2 = (2 + 3) * 4;      // 20
        boolean result3 = 5 > 3 && 2 < 4 || 1 > 2;
        
        System.out.println("2 + 3 * 4 = " + result1 + " (* имеет приоритет над +)");
        System.out.println("(2 + 3) * 4 = " + result2 + " (скобки меняют порядок)");
        System.out.println("5 > 3 && 2 < 4 || 1 > 2 = " + result3);
        System.out.println("  (&& имеет приоритет над ||)");
    }
}
