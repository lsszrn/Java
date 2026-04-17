/**
 * Демонстрация ситуаций, когда автоупаковка/распаковка
 * приводит к NullPointerException.
 *
 * @author lsszrn
 * @version 1.0
 */
public class NullPointerBoxingDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: NPE ПРИ АВТОУПАКОВКЕ/РАСПАКОВКЕ ===\n");
        
        System.out.println("NullPointerException возникает при ПОПЫТКЕ РАСПАКОВКИ null.\n");
        
        // Случай 1: Присваивание null объектной переменной и попытка распаковки
        System.out.println("--- Случай 1: Прямая распаковка null ---");
        try {
            Integer nullInt = null;
            int x = nullInt;  // unboxing null -> NPE!
            System.out.println("Это не напечатается");
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException: int x = nullInt;");
            System.out.println("  (распаковка null в примитивный int)");
        }
        
        // Случай 2: Арифметические операции с null
        System.out.println("\n--- Случай 2: Арифметика с null ---");
        try {
            Integer a = null;
            Integer b = 5;
            int sum = a + b;  // распаковка a -> NPE
            System.out.println("Это не напечатается");
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException: a + b (где a = null)");
            System.out.println("  (распаковка null для сложения)");
        }
        
        // Случай 3: Сравнение с примитивом
        System.out.println("\n--- Случай 3: Сравнение с примитивом ---");
        try {
            Integer nullInt = null;
            if (nullInt > 5) {  // распаковка null -> NPE
                System.out.println("Это не напечатается");
            }
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException: nullInt > 5");
            System.out.println("  (распаковка null для сравнения)");
        }
        
        // Случай 4: Параметры метода
        System.out.println("\n--- Случай 4: Передача в метод с примитивом ---");
        try {
            Integer nullInt = null;
            printDouble(nullInt);  // распаковка при передаче -> NPE
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException: printDouble(nullInt)");
            System.out.println("  (распаковка при передаче в int)");
        }
        
        // Случай 5: switch с enum или примитивами
        System.out.println("\n--- Случай 5: switch с Integer ---");
        try {
            Integer value = null;
            switch (value) {  // распаковка null -> NPE
                case 1: break;
                default: break;
            }
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException: switch(null)");
            System.out.println("  (распаковка для switch)");
        }
        
        // БЕЗОПАСНЫЕ операции с null
        System.out.println("\n--- БЕЗОПАСНЫЕ операции с null ---");
        Integer safeNull = null;
        
        // Сравнение с другим объектом (не вызывает распаковку)
        System.out.println("safeNull == null: " + (safeNull == null));
        System.out.println("safeNull != null: " + (safeNull != null));
        
        // equals (можно вызвать, но вернёт false или NPE?)
        try {
            System.out.println("safeNull.equals(5): ");
            System.out.println(safeNull.equals(5));  // NPE при вызове метода у null!
        } catch (NullPointerException e) {
            System.out.println("! NPE при safeNull.equals(5) - вызов метода у null");
        }
        
        // Безопасное сравнение через Objects.equals()
        System.out.println("Objects.equals(safeNull, 5): " + java.util.Objects.equals(safeNull, 5));
        
        // Строковое представление
        System.out.println("String.valueOf(safeNull): " + String.valueOf(safeNull));
        System.out.println("safeNull + \"\": " + safeNull + "");  // конкатенация со строкой безопасна
        
        // ИТОГ
        System.out.println("\n--- ИТОГ ---");
        System.out.println("! NPE происходит при АВТОРАСПАКОВКЕ null в примитив !");
        System.out.println("Автоупаковка (примитив -> объект) НЕ вызывает NPE.");
        System.out.println("Всегда проверяйте Integer на null перед использованием в вычислениях!");
    }
    
    static void printDouble(int x) {
        System.out.println("2 * " + x + " = " + (2 * x));
    }
}
