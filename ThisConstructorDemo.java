/**
 * Переписанный класс A с использованием this().
 *
 * @author lsszrn
 * @version 1.0
 */
class A {
    int a;
    int b;
    int c;
    int z;
    
    public A() {
        this(0, 0, 0);
    }
    
    public A(int a) {
        this(a, 0, 0);
    }
    
    public A(int a, int b) {
        this(a, b, 0);
    }
    
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
    
    public void print() {
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", z=" + z);
    }
}

public class ThisConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: THIS() В КОНСТРУКТОРАХ ===\n");
        
        System.out.println("Исходный код (дублирование):");
        System.out.println("Каждый конструктор повторяет z = 1");
        
        System.out.println("\nПереписанный код (через this()):");
        System.out.println("A() -> A(0,0,0)");
        System.out.println("A(a) -> A(a,0,0)");
        System.out.println("A(a,b) -> A(a,b,0)");
        System.out.println("A(a,b,c) -> инициализирует всё, включая z=1");
        
        System.out.println("\n--- Демонстрация ---");
        new A().print();
        new A(1).print();
        new A(1, 2).print();
        new A(1, 2, 3).print();
        
        System.out.println("\nПреимущества this():");
        System.out.println("- Нет дублирования кода (z=1 в одном месте)");
        System.out.println("- При изменении логики правится только один конструктор");
    }
}
