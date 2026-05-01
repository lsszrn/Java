/**
 * Демонстрация аннотаций @Override, @Deprecated, @SuppressWarnings.
 *
 * @author lsszrn
 * @version 1.0
 */

class Parent {
    public void doWork() {
        System.out.println("Работа родителя");
    }
    
    @Deprecated
    public void oldMethod() {
        System.out.println("Устаревший метод");
    }
}

class Child extends Parent {
    
    @Override
    public void doWork() {
        System.out.println("Работа потомка");
    }
}

public class AnnotationsDemo {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("=== АННОТАЦИИ ===\n");
        
        Child child = new Child();
        child.doWork();
        
        Parent p = new Parent();
        p.oldMethod();  // @Deprecated, но @SuppressWarnings убирает предупреждение
    }
}
