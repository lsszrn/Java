/**
 * Подробная демонстрация порядка инициализации.
 *
 * @author lsszrn
 * @version 1.0
 */
public class InitializationOrderDemo {
    
    private int field1 = initField1();
    private int field2 = 2;
    
    {
        System.out.println("Блок 1: field1=" + field1 + ", field2=" + field2);
        field1 = 10;
    }
    
    private int field3 = 3;
    
    static {
        System.out.println("Статический блок 1");
    }
    
    private static int staticField = initStaticField();
    
    {
        System.out.println("Блок 2: field1=" + field1 + ", field3=" + field3);
    }
    
    static {
        System.out.println("Статический блок 2: staticField=" + staticField);
    }
    
    public InitializationOrderDemo() {
        System.out.println("Конструктор: field1=" + field1 + ", field2=" + field2 + ", field3=" + field3);
    }
    
    private int initField1() {
        System.out.println("Инициализация field1");
        return 1;
    }
    
    private static int initStaticField() {
        System.out.println("Инициализация staticField");
        return 100;
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПОРЯДОК ИНИЦИАЛИЗАЦИИ ===\n");
        
        System.out.println("--- Создание первого объекта ---");
        new InitializationOrderDemo();
        
        System.out.println("\n--- Создание второго объекта ---");
        new InitializationOrderDemo();
        
        System.out.println("\n--- ИТОГОВЫЙ ПОРЯДОК ---");
        System.out.println("1. Статические поля (при загрузке класса)");
        System.out.println("2. Статические блоки (в порядке размещения)");
        System.out.println("3. Нестатические поля (в порядке размещения)");
        System.out.println("4. Нестатические блоки (в порядке размещения)");
        System.out.println("5. Конструктор");
        System.out.println("\nСтатические элементы выполняются ТОЛЬКО ОДИН РАЗ.");
    }
}
