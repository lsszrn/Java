package package1;

/**
 * Тест из того же пакета.
 *
 * @author lsszrn
 * @version 1.0
 */
public class SamePackageTest {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТ ИЗ ТОГО ЖЕ ПАКЕТА ===\n");
        
        AccessDemo obj = new AccessDemo();
        
        System.out.println("--- Доступ к полям ---");
        // System.out.println("privateVar = " + obj.privateVar); // ОШИБКА!
        System.out.println("defaultVar = " + obj.defaultVar);     // OK
        System.out.println("protectedVar = " + obj.protectedVar); // OK
        System.out.println("publicVar = " + obj.publicVar);       // OK
        
        System.out.println("\n--- Доступ к методам ---");
        // obj.privateMethod();   // ОШИБКА!
        obj.defaultMethod();      // OK
        obj.protectedMethod();    // OK
        obj.publicMethod();       // OK
        
        System.out.println("\nВывод: private НЕ доступен, остальные ДОСТУПНЫ");
    }
}
