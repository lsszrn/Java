/**
 * Демонстрация перегрузки методов с переменным числом параметров (varargs).
 *
 * @author lsszrn
 * @version 1.0
 */

class Calculator {
    
    // Метод с переменным числом int
    public int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
    
    // Перегрузка: фиксированные параметры + varargs
    public int sum(String prefix, int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        System.out.println(prefix + result);
        return result;
    }
    
    // Перегрузка: varargs с double
    public double sum(double... numbers) {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }
    
    // Перегрузка: другой тип varargs
    public String concat(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    // Перегрузка: два параметра перед varargs
    public void print(String label, int count, Object... objects) {
        System.out.println(label + " (повтор " + count + " раз):");
        for (int i = 0; i < count; i++) {
            for (Object obj : objects) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }
}

class Printer {
    
    // Перегрузка с разным количеством фиксированных параметров
    public void printAll(String separator, int... numbers) {
        System.out.print("Числа: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
    
    public void printAll(String prefix, String separator, int... numbers) {
        System.out.print(prefix + ": ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
    
    // Перегрузка: varargs разных типов
    public void printAll(double... numbers) {
        System.out.print("Double числа: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class VarargsOverloadDemo {
    
    // Статические методы с перегрузкой varargs
    public static int max(int first, int... rest) {
        int max = first;
        for (int num : rest) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static double max(double first, double... rest) {
        double max = first;
        for (double num : rest) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static String max(String first, String... rest) {
        String max = first;
        for (String s : rest) {
            if (s.compareTo(max) > 0) max = s;
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕГРУЗКА МЕТОДОВ С VARARGS ===\n");
        
        Calculator calc = new Calculator();
        
        System.out.println("--- Перегрузка sum() ---");
        System.out.println("sum(1, 2, 3) = " + calc.sum(1, 2, 3));
        System.out.println("sum(1, 2, 3, 4, 5) = " + calc.sum(1, 2, 3, 4, 5));
        System.out.println("sum() = " + calc.sum());
        
        System.out.println("\n--- Перегрузка sum(String, int...) ---");
        calc.sum("Сумма: ", 10, 20, 30);
        
        System.out.println("\n--- Перегрузка sum(double...) ---");
        System.out.println("sum(1.5, 2.5, 3.0) = " + calc.sum(1.5, 2.5, 3.0));
        
        System.out.println("\n--- Перегрузка concat(String...) ---");
        System.out.println("concat(\"Hello\", \" \", \"World\", \"!\") = " + 
                          calc.concat("Hello", " ", "World", "!"));
        
        System.out.println("\n--- Перегрузка print(String, int, Object...) ---");
        calc.print("Элементы", 2, "A", 1, "B", 2);
        
        System.out.println("\n--- Printer: перегрузка с разными параметрами ---");
        Printer printer = new Printer();
        printer.printAll(", ", 1, 2, 3, 4, 5);
        printer.printAll("Результат", " | ", 10, 20, 30);
        printer.printAll(1.1, 2.2, 3.3);
        
        System.out.println("\n--- Статические методы max() ---");
        System.out.println("max(5, 2, 8, 1, 9) = " + max(5, 2, 8, 1, 9));
        System.out.println("max(3.14, 1.41, 2.71) = " + max(3.14, 1.41, 2.71));
        System.out.println("max(\"apple\", \"banana\", \"cherry\") = " + 
                          max("apple", "banana", "cherry"));
        
        System.out.println("\n--- ПРИОРИТЕТ ПЕРЕГРУЗКИ ---");
        System.out.println("При выборе перегруженного метода компилятор предпочитает:");
        System.out.println("1. Методы с фиксированным числом параметров");
        System.out.println("2. Методы с varargs (если нет точного совпадения)");
    }
}
