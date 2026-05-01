/**
 * Демонстрация невозможности переопределения final-метода.
 *
 * @author lsszrn
 * @version 1.0
 */

class Parent {
    // Обычный метод - можно переопределить
    public void normalMethod() {
        System.out.println("Обычный метод родителя");
    }
    
    // Final метод - НЕЛЬЗЯ переопределить
    public final void finalMethod() {
        System.out.println("Final метод родителя");
    }
}

class Child extends Parent {
    
    // Переопределение обычного метода - OK
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный метод в Child");
    }
    
    // Попытка переопределить final метод - ОШИБКА КОМПИЛЯЦИИ
    // @Override
    // public void finalMethod() {   // ОШИБКА!
    //     System.out.println("Попытка переопределить final");
    // }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: FINAL-МЕТОД ===\n");
        
        Child child = new Child();
        
        System.out.println("Вызов обычного метода:");
        child.normalMethod();
        
        System.out.println("\nВызов final метода:");
        child.finalMethod();
        
        System.out.println("\nОбъяснение:");
        System.out.println("- normalMethod() переопределен в Child");
        System.out.println("- finalMethod() НЕЛЬЗЯ переопределить из-за final");
        System.out.println("- При попытке переопределения будет ошибка компиляции:");
        System.out.println("  'overridden method is final'");
    }
}
