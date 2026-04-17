/**
 * Класс для демонстрации порядка выполнения блоков инициализации.
 *
 * @author lsszrn
 * @version 1.0
 */
public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}
