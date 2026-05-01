/**
 * Демонстрация перегруженных методов.
 *
 * @author lsszrn
 * @version 1.0
 */

class Calculator {
    
    // Перегрузка: разное количество параметров
    public int sum(int a) {
        return a;
    }
    
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Перегрузка: разные типы параметров
    public double sum(double a, double b) {
        return a + b;
    }
    
    public String sum(String a, String b) {
        return a + b;
    }
    
    // Перегрузка: разный порядок типов
    public void print(String s, int n) {
        System.out.println(s + ": " + n);
    }
    
    public void print(int n, String s) {
        System.out.println(n + " -> " + s);
    }
    
    // Перегрузка: int и Integer считаются разными типами
    public void show(int value) {
        System.out.println("int: " + value);
    }
    
    public void show(Integer value) {
        System.out.println("Integer: " + value);
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕГРУЖЕННЫЕ МЕТОДЫ ===\n");
        
        Calculator calc = new Calculator();
        
        System.out.println("--- Разное количество параметров ---");
        System.out.println("sum(5) = " + calc.sum(5));
        System.out.println("sum(5, 3) = " + calc.sum(5, 3));
        System.out.println("sum(5, 3, 2) = " + calc.sum(5, 3, 2));
        
        System.out.println("\n--- Разные типы параметров ---");
        System.out.println("sum(2.5, 3.5) = " + calc.sum(2.5, 3.5));
        System.out.println("sum(\"Hello\", \" World\") = " + calc.sum("Hello", " World"));
        
        System.out.println("\n--- Разный порядок типов ---");
        calc.print("Число", 42);
        calc.print(100, "результат");
        
        System.out.println("\n--- int vs Integer ---");
        calc.show(10);
        calc.show(Integer.valueOf(20));
    }
}
