/**
 * Демонстрация невозможности наследования final-класса.
 *
 * @author lsszrn
 * @version 1.0
 */

// Final класс - НЕЛЬЗЯ наследовать
final class FinalClass {
    private String name;
    
    public FinalClass(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("FinalClass: " + name);
    }
}

// Попытка наследовать final класс - ОШИБКА КОМПИЛЯЦИИ
// class SubClass extends FinalClass { } // ОШИБКА!

// Обычный класс для сравнения
class NormalClass {
    private String name;
    
    public NormalClass(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("NormalClass: " + name);
    }
}

// От обычного класса можно наследовать
class SubClass extends NormalClass {
    public SubClass(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.print("SubClass -> ");
        super.display();
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: FINAL-КЛАСС ===\n");
        
        System.out.println("Создание объекта final класса:");
        FinalClass fc = new FinalClass("Экземпляр");
        fc.display();
        
        System.out.println("\nСоздание объекта подкласса обычного класса:");
        SubClass sub = new SubClass("Экземпляр");
        sub.display();
        
        System.out.println("\nОбъяснение:");
        System.out.println("- FinalClass объявлен как final");
        System.out.println("- Нельзя создать 'class X extends FinalClass'");
        System.out.println("- При попытке наследования будет ошибка компиляции:");
        System.out.println("  'cannot inherit from final class'");
        
        System.out.println("\nПримеры final классов в Java:");
        System.out.println("- java.lang.String");
        System.out.println("- java.lang.Integer");
        System.out.println("- java.lang.Math");
        System.out.println("Эти классы нельзя наследовать");
    }
}
