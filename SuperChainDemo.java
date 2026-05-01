/**
 * Демонстрация работы super через цепочку наследования.
 *
 * @author lsszrn
 * @version 1.0
 */

class A {
    int a = 10;
    
    void method() {
        System.out.println("Метод класса A, a=" + a);
    }
}

class B extends A {
    // a и method() не определены в B
    // они наследуются от A без изменений
}

class C extends B {
    
    @Override
    void method() {
        System.out.println("Метод класса C");
        
        // super.a - поднимется по цепочке до A, где найдёт поле a
        int a = super.a;
        System.out.println("super.a = " + a);
        
        // super.method() - вызовет метод из A (через B)
        System.out.print("super.method(): ");
        super.method();
    }
}

public class SuperChainDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: SUPER ЧЕРЕЗ ЦЕПОЧКУ ===\n");
        
        C obj = new C();
        obj.method();
        
        System.out.println("\nОбъяснение:");
        System.out.println("- Класс B не определяет a и method()");
        System.out.println("- super в классе C обращается к A через B");
        System.out.println("- super найдёт ближайшее определение в цепочке наследования");
        System.out.println("- Всё работает корректно, ошибки нет");
    }
}
