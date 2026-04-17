/**
 * Главный класс для демонстрации порядка выполнения блоков.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПОРЯДОК ВЫПОЛНЕНИЯ БЛОКОВ ===\n");
        
        System.out.println("Создание объекта new A(100):\n");
        new A(100);
        
        System.out.println("\n--- Объяснение порядка выполнения ---");
        System.out.println("1. static блок - при загрузке класса (один раз)");
        System.out.println("2. Поле id инициализируется значением 1");
        System.out.println("3. logic (1) - выполняется до конструктора");
        System.out.println("4. logic (2) - выполняется до конструктора");
        System.out.println("5. Конструктор - выполняется последним");
        
        System.out.println("\n--- Почему в logic (1) id=0? ---");
        System.out.println("Поле id еще не инициализировано значением 1,");
        System.out.println("поэтому имеет значение по умолчанию для int - 0.");
        System.out.println("Инициализация private int id = 1 происходит");
        System.out.println("ПОСЛЕ выполнения logic (1), но ДО logic (2).");
    }
}
