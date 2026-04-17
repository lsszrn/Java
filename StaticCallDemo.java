/**
 * Демонстрация всех вариантов вызова статического метода printVars().
 *
 * @author lsszrn
 * @version 1.0
 */

class A {
    public static int a = 1;
    public static int b = 2;
    
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class StaticCallDemo {
    
    static void callFromStaticMethod() {
        System.out.println("Из статического метода того же класса:");
        // Вариант 1: прямой вызов (если в том же классе)
        // printVars(); // если бы метод был в этом классе
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ВАРИАНТЫ ВЫЗОВА СТАТИЧЕСКОГО МЕТОДА ===\n");
        
        // Вариант 1: через имя класса (рекомендуемый)
        System.out.println("1. Через имя класса:");
        A.printVars();
        
        // Вариант 2: через объект класса (не рекомендуется, но работает)
        System.out.println("\n2. Через объект класса:");
        A obj = new A();
        obj.printVars();
        
        // Вариант 3: через null-ссылку (работает, но плохая практика)
        System.out.println("\n3. Через null-ссылку:");
        A nullObj = null;
        nullObj.printVars();  // работает, т.к. метод статический
        
        // Вариант 4: прямой вызов (если метод в том же классе)
        System.out.println("\n4. Прямой вызов (из того же класса):");
        System.out.println("   printVars(); // без имени класса");
        
        // Вариант 5: через импорт static (Java 5+)
        System.out.println("\n5. Через static import:");
        System.out.println("   import static A.printVars;");
        System.out.println("   printVars(); // прямой вызов");
        
        System.out.println("\n--- Рекомендация ---");
        System.out.println("Всегда используйте: ИмяКласса.метод()");
        System.out.println("Пример: A.printVars()");
    }
}
