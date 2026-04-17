/**
 * Дополнительные примеры использования final.
 *
 * @author lsszrn
 * @version 1.0
 */

// final класс - нельзя наследовать
final class FinalClass {
    public void method() {
        System.out.println("Метод final класса");
    }
}

// class SubClass extends FinalClass {} // ОШИБКА!

class Parent {
    // final метод - нельзя переопределить
    public final void finalMethod() {
        System.out.println("Final метод родителя");
    }
    
    public void normalMethod() {
        System.out.println("Обычный метод родителя");
    }
}

class Child extends Parent {
    // @Override public void finalMethod() {} // ОШИБКА!
    
    @Override
    public void normalMethod() {
        System.out.println("Переопределенный метод");
    }
}

public class FinalExamples {
    
    // final параметр метода
    public void methodWithFinalParam(final int x) {
        // x = 10; // ОШИБКА! нельзя изменить final параметр
        System.out.println("final параметр x = " + x);
    }
    
    public static void main(String[] args) {
        System.out.println("=== ДОПОЛНИТЕЛЬНЫЕ ПРИМЕРЫ FINAL ===\n");
        
        // final локальная переменная
        final int localConst = 100;
        // localConst = 200; // ОШИБКА!
        System.out.println("final локальная переменная: " + localConst);
        
        // final параметр метода
        FinalExamples obj = new FinalExamples();
        obj.methodWithFinalParam(42);
        
        // final класс
        FinalClass fc = new FinalClass();
        fc.method();
        System.out.println("FinalClass нельзя наследовать");
        
        // final метод
        Child child = new Child();
        child.finalMethod();    // унаследован, но не переопределен
        child.normalMethod();   // переопределен
        System.out.println("finalMethod нельзя переопределить");
        
        // final ссылка на объект
        System.out.println("\n--- final ссылка на объект ---");
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println("final StringBuilder sb = " + sb);
        // sb = new StringBuilder("World"); // ОШИБКА! нельзя изменить ссылку
        sb.append(" World!"); // можно изменить содержимое объекта
        System.out.println("sb.append(\" World!\") -> " + sb);
        System.out.println("final запрещает изменить ссылку, но не содержимое объекта");
    }
}
