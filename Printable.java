/**
 * Интерфейс с неабстрактным (default) и статическим (static) методами.
 *
 * @author lsszrn
 * @version 1.0
 */
public interface Printable {
    
    // Абстрактный метод (должен быть реализован)
    void print();
    
    // Неабстрактный метод (default) - имеет реализацию по умолчанию
    default void printDefault() {
        System.out.println("Default метод интерфейса Printable");
    }
    
    // Статический метод - вызывается через имя интерфейса
    static void printStatic() {
        System.out.println("Static метод интерфейса Printable");
    }
}
