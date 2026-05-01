/**
 * Демонстрация конфликта default методов при реализации двух интерфейсов.
 *
 * @author lsszrn
 * @version 1.0
 */

interface InterfaceA {
    default void doSomething() {
        System.out.println("InterfaceA: doSomething()");
    }
    
    default void common() {
        System.out.println("InterfaceA: common()");
    }
}

interface InterfaceB {
    default void doSomething() {
        System.out.println("InterfaceB: doSomething()");
    }
    
    default void common() {
        System.out.println("InterfaceB: common()");
    }
}

// Класс реализует два интерфейса с одинаковыми default методами
class MyClass implements InterfaceA, InterfaceB {
    
    // Обязательно нужно разрешить конфликт!
    @Override
    public void doSomething() {
        // Можно вызвать конкретную реализацию через InterfaceA.super
        InterfaceA.super.doSomething();
        InterfaceB.super.doSomething();
        System.out.println("MyClass: своя реализация doSomething()");
    }
    
    @Override
    public void common() {
        // Или выбрать одну из реализаций
        InterfaceA.super.common();
        System.out.println("MyClass: расширенная реализация common()");
    }
}

public class InterfaceConflictDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: КОНФЛИКТ DEFAULT МЕТОДОВ ===\n");
        
        MyClass obj = new MyClass();
        
        System.out.println("--- Разрешение конфликта ---");
        obj.doSomething();
        
        System.out.println("\n--- Выбор реализации ---");
        obj.common();
        
        System.out.println("\n--- ЧТО ПРОИЗОЙДЕТ БЕЗ ПЕРЕОПРЕДЕЛЕНИЯ ---");
        System.out.println("Если не переопределить конфликтующий метод,");
        System.out.println("компилятор выдаст ошибку:");
        System.out.println("\"class MyClass inherits unrelated defaults\"");
        
        System.out.println("\n--- СПОСОБЫ ВЫХОДА ---");
        System.out.println("1. Переопределить метод в классе");
        System.out.println("2. Вызвать InterfaceA.super.метод()");
        System.out.println("3. Вызвать InterfaceB.super.метод()");
        System.out.println("4. Написать полностью свою реализацию");
    }
}
