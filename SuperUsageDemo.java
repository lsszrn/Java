/**
 * Демонстрация трёх вариантов использования super.
 *
 * @author lsszrn
 * @version 1.0
 */

class Parent {
    protected String field = "Поле родителя";
    
    public Parent() {
        System.out.println("Конструктор Parent");
    }
    
    public Parent(String message) {
        System.out.println("Конструктор Parent: " + message);
    }
    
    public void method() {
        System.out.println("Метод родителя");
    }
}

class Child extends Parent {
    protected String field = "Поле потомка";
    
    public Child() {
        // 1. Вызов конструктора суперкласса
        super("вызван из Child");
        System.out.println("Конструктор Child");
    }
    
    public void demonstrateSuper() {
        // 2. Доступ к полю суперкласса
        System.out.println("this.field = " + this.field);
        System.out.println("super.field = " + super.field);
        
        // 3. Доступ к методу суперкласса
        System.out.print("this.method(): ");
        this.method();
        System.out.print("super.method(): ");
        super.method();
    }
    
    @Override
    public void method() {
        System.out.println("Метод потомка");
    }
}

public class SuperUsageDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ТРИ ВАРИАНТА SUPER ===\n");
        
        System.out.println("--- 1. super() в конструкторе ---");
        Child child = new Child();
        
        System.out.println("\n--- 2 и 3. super.поле и super.метод() ---");
        child.demonstrateSuper();
    }
}
