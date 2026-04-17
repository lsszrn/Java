/**
 * Демонстрация работы метода decode() классов-оболочек.
 * Метод decode() преобразует строковое представление числа
 * в объект соответствующего класса-оболочки.
 * Поддерживает десятичные, восьмеричные и шестнадцатеричные форматы.
 *
 * @author lsszrn
 * @version 1.0
 */
public class DecodeDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: МЕТОД decode() ===\n");
        
        // 1. Integer.decode() - разные системы счисления
        System.out.println("--- Integer.decode() ---");
        
        // Десятичное число (обычное)
        Integer dec1 = Integer.decode("42");
        System.out.println("Integer.decode(\"42\")     = " + dec1);
        
        // Десятичное с явным знаком +
        Integer dec2 = Integer.decode("+42");
        System.out.println("Integer.decode(\"+42\")    = " + dec2);
        
        // Отрицательное число
        Integer dec3 = Integer.decode("-42");
        System.out.println("Integer.decode(\"-42\")    = " + dec3);
        
        // Восьмеричное число (начинается с 0)
        Integer oct = Integer.decode("052");
        System.out.println("Integer.decode(\"052\")    = " + oct + " (восьмеричное 52 = 5*8 + 2 = 42)");
        
        // Шестнадцатеричное число (начинается с 0x или 0X)
        Integer hex1 = Integer.decode("0x2A");
        System.out.println("Integer.decode(\"0x2A\")   = " + hex1 + " (шестнадцатеричное 2A = 2*16 + 10 = 42)");
        
        Integer hex2 = Integer.decode("0X2A");
        System.out.println("Integer.decode(\"0X2A\")   = " + hex2);
        
        Integer hex3 = Integer.decode("#2A");
        System.out.println("Integer.decode(\"#2A\")    = " + hex3 + " (альтернативный формат)");
        
        // 2. Long.decode()
        System.out.println("\n--- Long.decode() ---");
        Long longVal = Long.decode("0xFFFFFFFF");
        System.out.println("Long.decode(\"0xFFFFFFFF\") = " + longVal);
        System.out.println("(это максимальное беззнаковое 32-битное число)");
        
        // 3. Byte.decode()
        System.out.println("\n--- Byte.decode() ---");
        Byte byteVal = Byte.decode("0x7F");
        System.out.println("Byte.decode(\"0x7F\")       = " + byteVal + " (максимальное byte)");
        
        // 4. Short.decode()
        System.out.println("\n--- Short.decode() ---");
        Short shortVal = Short.decode("0x7FFF");
        System.out.println("Short.decode(\"0x7FFF\")    = " + shortVal + " (максимальное short)");
        
        // 5. Сводная таблица форматов
        System.out.println("\n--- Сводка форматов для decode() ---");
        System.out.println("Формат          | Пример     | Результат");
        System.out.println("----------------|------------|----------");
        System.out.println("Десятичное      | \"42\"       | " + Integer.decode("42"));
        System.out.println("Восьмеричное    | \"052\"      | " + Integer.decode("052"));
        System.out.println("Шестнадцатеричное| \"0x2A\"    | " + Integer.decode("0x2A"));
        System.out.println("С решёткой      | \"#2A\"      | " + Integer.decode("#2A"));
        System.out.println("Отрицательное   | \"-0x2A\"    | " + Integer.decode("-0x2A"));
        
        // 6. Обработка ошибок
        System.out.println("\n--- Обработка ошибок ---");
        try {
            Integer.decode("не число");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: NumberFormatException при decode(\"не число\")");
        }
        
        try {
            Integer.decode("0xGHIJ");  // G и H не являются шестнадцатеричными цифрами
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: NumberFormatException при decode(\"0xGHIJ\")");
        }
    }
}
