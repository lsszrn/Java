/**
 * Демонстрация неоднозначности при перегрузке методов с varargs.
 *
 * @author lsszrn
 * @version 1.0
 */

class Ambiguous {
    
    // Эти два метода создают неоднозначность
    public void print(int... numbers) {
        System.out.print("int varargs: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
    }
    
    // public void print(Integer... numbers) { // ОШИБКА! Неоднозначность
    //     System.out.print("Integer varargs: ");
    //     for (Integer n : numbers) System.out.print(n + " ");
    //     System.out.println();
    // }
    
    public void print(String... strings) {
        System.out.print("String varargs: ");
        for (String s : strings) System.out.print(s + " ");
        System.out.println();
    }
    
    // Метод с фиксированным параметром имеет приоритет
    public void print(int a) {
        System.out.println("int фиксированный: " + a);
    }
    
    public void print(int a, int b) {
        System.out.println("int два параметра: " + a + ", " + b);
    }
}

public class VarargsAmbiguityDemo {
    public static void main(String[] args) {
        System.out.println("=== НЕОДНОЗНАЧНОСТЬ ПРИ ПЕРЕГРУЗКЕ VARARGS ===\n");
        
        Ambiguous amb = new Ambiguous();
        
        System.out.println("--- Вызов с одним параметром ---");
        amb.print(42);  // вызовет print(int a), а не varargs
        
        System.out.println("\n--- Вызов с двумя параметрами ---");
        amb.print(10, 20);  // вызовет print(int a, int b)
        
        System.out.println("\n--- Вызов с тремя параметрами ---");
        amb.print(1, 2, 3);  // вызовет varargs print(int...)
        
        System.out.println("\n--- Вызов со String ---");
        amb.print("Hello", "World");
        
        System.out.println("\n--- ПРАВИЛА ---");
        System.out.println("1. Нельзя перегружать varargs методы с одинаковым типом");
        System.out.println("   (например, int... и Integer...)");
        System.out.println("2. Методы с фиксированными параметрами имеют приоритет");
        System.out.println("3. Varargs вызывается только если нет более точного совпадения");
    }
}
