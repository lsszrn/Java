/**
 * Демонстрация использования ключевых слов this и super.
 *
 * @author lsszrn
 * @version 1.0
 */

class Parent {
    protected String name;
    protected int age;
    
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Parent: name=" + name + ", age=" + age);
    }
    
    public void printInfo() {
        System.out.println("Метод родителя");
    }
}

class Child extends Parent {
    private String school;
    private int grade;
    
    public Child(String name, int age, String school, int grade) {
        super(name, age);  // вызов конструктора родителя
        this.school = school;
        this.grade = grade;
    }
    
    @Override
    public void display() {
        super.display();  // вызов метода родителя
        System.out.println("Child: school=" + this.school + ", grade=" + this.grade);
    }
    
    @Override
    public void printInfo() {
        System.out.println("--- Демонстрация this и super ---");
        System.out.println("this.name = " + this.name);    // поле, унаследованное от Parent
        System.out.println("super.name = " + super.name);   // то же поле через super
        System.out.println("this.school = " + this.school); // собственное поле Child
        System.out.println("this.age = " + this.age);       // унаследованное поле
    }
    
    public void testMethods() {
        System.out.println("\n--- Вызов методов ---");
        this.display();     // вызов своего переопределенного метода
        super.display();    // вызов метода родителя напрямую
        this.printInfo();   // вызов своего метода
        super.printInfo();  // вызов родительского метода
    }
    
    public void testConstructor() {
        System.out.println("\n--- Использование this() в конструкторе ---");
    }
    
    public Child(String name, int age, String school) {
        this(name, age, school, 1); // вызов другого конструктора этого же класса
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: THIS И SUPER ===\n");
        
        Child child = new Child("Иван", 15, "Школа №1", 9);
        
        System.out.println("--- Метод display() ---");
        child.display();
        
        child.printInfo();
        child.testMethods();
        
        System.out.println("\n--- ПРАВИЛА ИСПОЛЬЗОВАНИЯ ---");
        System.out.println("this:");
        System.out.println("- this.поле - обращение к полю текущего класса");
        System.out.println("- this.метод() - вызов метода текущего класса");
        System.out.println("- this() - вызов другого конструктора ЭТОГО класса");
        
        System.out.println("\nsuper:");
        System.out.println("- super.поле - обращение к полю родительского класса");
        System.out.println("- super.метод() - вызов метода родительского класса");
        System.out.println("- super() - вызов конструктора родительского класса");
        
        System.out.println("\n! super() или this() должны быть ПЕРВОЙ строкой в конструкторе");
        System.out.println("! super() и this() НЕЛЬЗЯ использовать вместе в одном конструкторе");
    }
}
