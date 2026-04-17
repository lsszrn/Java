/**
 * Демонстрация всех способов инициализации final-поля.
 *
 * @author lsszrn
 * @version 1.0
 */

class A1 {
    public final int a = 10; // вариант 1: при объявлении
}

class A2 {
    public final int a;
    
    // вариант 2: в конструкторе
    public A2() {
        a = 20;
    }
}

class A3 {
    public final int a;
    
    // вариант 3: в блоке инициализации
    {
        a = 30;
    }
}

class A4 {
    public final int a;
    
    // вариант 4: в разных конструкторах
    public A4() {
        a = 40;
    }
    
    public A4(int value) {
        a = value;
    }
}

class A5 {
    public static final int a; // static final поле
    
    // вариант 5: в статическом блоке инициализации
    static {
        a = 50;
    }
}

class A6 {
    public static final int a = 60; // вариант 6: static final при объявлении
}

public class FinalInitDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ИНИЦИАЛИЗАЦИЯ FINAL-ПОЛЯ ===\n");
        
        System.out.println("Вариант 1: при объявлении");
        System.out.println("public final int a = 10;");
        System.out.println("A1.a = " + new A1().a + "\n");
        
        System.out.println("Вариант 2: в конструкторе");
        System.out.println("public A2() { a = 20; }");
        System.out.println("A2.a = " + new A2().a + "\n");
        
        System.out.println("Вариант 3: в блоке инициализации");
        System.out.println("{ a = 30; }");
        System.out.println("A3.a = " + new A3().a + "\n");
        
        System.out.println("Вариант 4: в разных конструкторах");
        System.out.println("A4() { a = 40; }");
        System.out.println("A4(int value) { a = value; }");
        System.out.println("new A4().a = " + new A4().a);
        System.out.println("new A4(99).a = " + new A4(99).a + "\n");
        
        System.out.println("Вариант 5: static final в статическом блоке");
        System.out.println("static { a = 50; }");
        System.out.println("A5.a = " + A5.a + "\n");
        
        System.out.println("Вариант 6: static final при объявлении");
        System.out.println("public static final int a = 60;");
        System.out.println("A6.a = " + A6.a);
        
        System.out.println("\n--- ИТОГ ---");
        System.out.println("Для не-static final поля:");
        System.out.println("- при объявлении");
        System.out.println("- в конструкторе");
        System.out.println("- в блоке инициализации");
        System.out.println("\nДля static final поля:");
        System.out.println("- при объявлении");
        System.out.println("- в статическом блоке инициализации");
    }
}
