package package2;

import package1.AccessDemo;

/**
 * Тест из другого пакета (подкласс).
 *
 * @author lsszrn
 * @version 1.0
 */
public class SubClassTest extends AccessDemo {
    
    public void testInheritedMembers() {
        System.out.println("--- Внутри подкласса из другого пакета ---");
        // System.out.println("privateVar = " + privateVar);   // ОШИБКА!
        // System.out.println("defaultVar = " + defaultVar);   // ОШИБКА!
        System.out.println("protectedVar = " + protectedVar);   // OK (наследование)
        System.out.println("publicVar = " + publicVar);         // OK
        
        // privateMethod();   // ОШИБКА!
        // defaultMethod();   // ОШИБКА!
        protectedMethod();    // OK (наследование)
        publicMethod();       // OK
    }
    
    public static void main(String[] args) {
        System.out.println("=== ТЕСТ ИЗ ДРУГОГО ПАКЕТА (подкласс) ===\n");
        
        SubClassTest obj = new SubClassTest();
        
        System.out.println("--- Доступ через экземпляр подкласса ---");
        // System.out.println("privateVar = " + obj.privateVar);   // ОШИБКА!
        // System.out.println("defaultVar = " + obj.defaultVar);   // ОШИБКА!
        System.out.println("protectedVar = " + obj.protectedVar);   // OK
        System.out.println("publicVar = " + obj.publicVar);         // OK
        
        obj.testInheritedMembers();
        
        System.out.println("\n--- Доступ через экземпляр родителя ---");
        AccessDemo parent = new AccessDemo();
        // System.out.println(parent.protectedVar); // ОШИБКА! (только через наследование)
        System.out.println("parent.publicVar = " + parent.publicVar); // OK
        
        System.out.println("\nВывод: private и default НЕ доступны,");
        System.out.println("protected доступен через наследование, public доступен");
    }
}
