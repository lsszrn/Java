/**
 * Демонстрация спецификаторов доступа при наследовании.
 *
 * @author lsszrn
 * @version 1.0
 */

class A {
    int a1 = 1;          // default
    public int a2 = 2;   // public
    protected int a3 = 3; // protected
    private int a4 = 4;  // private
    
    void method1() {
        System.out.println("default method1, a4=" + a4);
    }
    
    public void method2() {
        System.out.println("public method2");
    }
    
    protected void method3() {
        System.out.println("protected method3");
    }
    
    private void method4() {
        System.out.println("private method4");
    }
    
    public void accessPrivateInA() {
        System.out.println("Доступ к private внутри A: a4=" + a4);
        method4();
    }
}

class B extends A {
    
    public void testAccessInB() {
        System.out.println("--- Доступ из класса B ---");
        
        // Доступны
        System.out.println("a1 (default) = " + a1);    // OK: тот же пакет
        System.out.println("a2 (public) = " + a2);      // OK: public
        System.out.println("a3 (protected) = " + a3);   // OK: protected доступен подклассу
        
        // НЕДОСТУПНЫ
        // System.out.println("a4 (private) = " + a4);  // ОШИБКА! private
        
        method1();   // OK: default, тот же пакет
        method2();   // OK: public
        method3();   // OK: protected
        // method4(); // ОШИБКА! private
        
        // Доступ к private только через public метод родителя
        System.out.print("Доступ к private через метод A: ");
        accessPrivateInA();
    }
}

class C extends B {
    
    public void testAccessInC() {
        System.out.println("\n--- Доступ из класса C ---");
        
        // Доступны (через цепочку наследования)
        System.out.println("a1 (default) = " + a1);    // OK: тот же пакет
        System.out.println("a2 (public) = " + a2);      // OK: public
        System.out.println("a3 (protected) = " + a3);   // OK: protected
        
        // НЕДОСТУПНЫ
        // System.out.println("a4 (private) = " + a4);  // ОШИБКА! private не наследуется
        
        method1();   // OK
        method2();   // OK
        method3();   // OK
        // method4(); // ОШИБКА! private
        
        // Покажем, что private не наследуется
        System.out.print("Доступ к private через цепочку A -> B -> C: ");
        accessPrivateInA();  // OK, метод public в A
    }
}

public class AccessInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: СПЕЦИФИКАТОРЫ ДОСТУПА ПРИ НАСЛЕДОВАНИИ ===\n");
        
        B b = new B();
        b.testAccessInB();
        
        C c = new C();
        c.testAccessInC();
        
        System.out.println("\n--- Доступ через объект класса B ---");
        System.out.println("b.a1 = " + b.a1);  // OK: default в том же пакете
        System.out.println("b.a2 = " + b.a2);  // OK: public
        System.out.println("b.a3 = " + b.a3);  // OK: protected (в том же пакете)
        // System.out.println("b.a4 = " + b.a4); // ОШИБКА! private
        
        System.out.println("\n--- ИТОГОВАЯ ТАБЛИЦА НАСЛЕДОВАНИЯ ---");
        System.out.println("Спецификатор | В том же классе | Подкласс (тот же пакет) | Подкласс (другой пакет) | Внешний класс");
        System.out.println("-------------|-----------------|--------------------------|--------------------------|---------------");
        System.out.println("private      |       ✓         |           ✗              |           ✗              |       ✗");
        System.out.println("default      |       ✓         |           ✓              |           ✗              |       ✗ (если другой пакет)");
        System.out.println("protected    |       ✓         |           ✓              |           ✓              |       ✗ (если другой пакет)");
        System.out.println("public       |       ✓         |           ✓              |           ✓              |       ✓");
        
        System.out.println("\n--- КЛЮЧЕВЫЕ ВЫВОДЫ ---");
        System.out.println("1. private НЕ НАСЛЕДУЕТСЯ. В подклассах недоступен.");
        System.out.println("2. default доступен только в пределах того же пакета.");
        System.out.println("3. protected доступен подклассам даже в других пакетах.");
        System.out.println("4. public доступен всем и везде.");
    }
}
