/**
 * Демонстрация перегрузки методов (overloading).
 *
 * @author lsszrn
 * @version 1.0
 */
public class OverloadingDemo {
    
    // Перегрузка: разные типы параметров
    public void print(int value) {
        System.out.println("int: " + value);
    }
    
    public void print(double value) {
        System.out.println("double: " + value);
    }
    
    public void print(String value) {
        System.out.println("String: " + value);
    }
    
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
    
    // Перегрузка: разный порядок типов
    public void show(String s, int n) {
        System.out.println("String + int: " + s + n);
    }
    
    public void show(int n, String s) {
        System.out.println("int + String: " + n + s);
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕГРУЗКА МЕТОДОВ ===\n");
        
        OverloadingDemo demo = new OverloadingDemo();
        
        System.out.println("--- Разные типы параметров ---");
        demo.print(42);
        demo.print(3.14);
        demo.print("Hello");
        
        System.out.println("\n--- Разное количество параметров ---");
        System.out.println("sum(5) = " + demo.sum(5));
        System.out.println("sum(5, 3) = " + demo.sum(5, 3));
        System.out.println("sum(5, 3, 2) = " + demo.sum(5, 3, 2));
        
        System.out.println("\n--- Разный порядок типов ---");
        demo.show("Число: ", 42);
        demo.show(42, " - число");
    }
}
