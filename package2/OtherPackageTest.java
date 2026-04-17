package package2;

import package1.AccessDemo;

/**
 * Тест из другого пакета (не подкласс).
 *
 * @author lsszrn
 * @version 1.0
 */
public class OtherPackageTest {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТ ИЗ ДРУГОГО ПАКЕТА (не подкласс) ===\n");
        
        AccessDemo obj = new AccessDemo();
        
        System.out.println("--- Доступ к полям ---");
        // System.out.println("privateVar = " + obj.privateVar);   // ОШИБКА!
        // System.out.println("defaultVar = " + obj.defaultVar);   // ОШИБКА!
        // System.out.println("protectedVar = " + obj.protectedVar); // ОШИБКА!
        System.out.println("publicVar = " + obj.publicVar);       // OK
        
        System.out.println("\n--- Доступ к методам ---");
        // obj.privateMethod();   // ОШИБКА!
        // obj.defaultMethod();   // ОШИБКА!
        // obj.protectedMethod(); // ОШИБКА!
        obj.publicMethod();       // OK
        
        System.out.println("\nВывод: только public ДОСТУПЕН");
    }
}
