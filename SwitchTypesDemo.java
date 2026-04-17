/**
 * Демонстрация всех допустимых типов переменных в конструкции switch.
 *
 * @author lsszrn
 * @version 1.0
 */
public class SwitchTypesDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ТИПЫ ПЕРЕМЕННЫХ В SWITCH ===\n");

        System.out.println("Допустимые типы для switch:\n");
        System.out.println("1. Целочисленные примитивы: byte, short, int, char");
        System.out.println("2. Классы-оболочки: Byte, Short, Integer, Character");
        System.out.println("3. Перечисления (enum)");
        System.out.println("4. String (начиная с Java 7)\n");

        // 1. Тип byte
        System.out.println("--- 1. Тип BYTE ---");
        byte byteValue = 2;
        switch (byteValue) {
            case 1:
                System.out.println("byte: один");
                break;
            case 2:
                System.out.println("byte: два");
                break;
            default:
                System.out.println("byte: другое");
        }

        // 2. Тип short
        System.out.println("\n--- 2. Тип SHORT ---");
        short shortValue = 100;
        switch (shortValue) {
            case 100:
                System.out.println("short: сто");
                break;
            case 200:
                System.out.println("short: двести");
                break;
            default:
                System.out.println("short: другое");
        }

        // 3. Тип int
        System.out.println("\n--- 3. Тип INT ---");
        int intValue = 42;
        switch (intValue) {
            case 42:
                System.out.println("int: ответ на главный вопрос");
                break;
            case 100:
                System.out.println("int: сто");
                break;
            default:
                System.out.println("int: другое");
        }

        // 4. Тип char
        System.out.println("\n--- 4. Тип CHAR ---");
        char charValue = 'B';
        switch (charValue) {
            case 'A':
                System.out.println("char: буква A");
                break;
            case 'B':
                System.out.println("char: буква B");
                break;
            case 'C':
                System.out.println("char: буква C");
                break;
            default:
                System.out.println("char: другая буква");
        }

        // 5. Класс-оболочка Byte
        System.out.println("\n--- 5. Тип BYTE (оболочка) ---");
        Byte byteObj = 3;
        switch (byteObj) {
            case 1:
                System.out.println("Byte: 1");
                break;
            case 3:
                System.out.println("Byte: 3 (автораспаковка)");
                break;
            default:
                System.out.println("Byte: другое");
        }

        // 6. Класс-оболочка Short
        System.out.println("\n--- 6. Тип SHORT (оболочка) ---");
        Short shortObj = 50;
        switch (shortObj) {
            case 25:
                System.out.println("Short: 25");
                break;
            case 50:
                System.out.println("Short: 50");
                break;
            default:
                System.out.println("Short: другое");
        }

        // 7. Класс-оболочка Integer
        System.out.println("\n--- 7. Тип INTEGER (оболочка) ---");
        Integer intObj = 7;
        switch (intObj) {
            case 5:
                System.out.println("Integer: 5");
                break;
            case 7:
                System.out.println("Integer: 7");
                break;
            default:
                System.out.println("Integer: другое");
        }

        // 8. Класс-оболочка Character
        System.out.println("\n--- 8. Тип CHARACTER (оболочка) ---");
        Character charObj = 'X';
        switch (charObj) {
            case 'Y':
                System.out.println("Character: Y");
                break;
            case 'X':
                System.out.println("Character: X");
                break;
            default:
                System.out.println("Character: другой");
        }

        // 9. Тип String (Java 7+)
        System.out.println("\n--- 9. Тип STRING ---");
        String stringValue = "вторник";
        switch (stringValue) {
            case "понедельник":
                System.out.println("String: начало недели");
                break;
            case "вторник":
                System.out.println("String: второй день");
                break;
            case "среда":
                System.out.println("String: середина");
                break;
            default:
                System.out.println("String: другой день");
        }

        // 10. Тип Enum
        System.out.println("\n--- 10. Тип ENUM ---");
        Day day = Day.FRIDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Enum: понедельник - тяжёлый день");
                break;
            case FRIDAY:
                System.out.println("Enum: пятница - скоро выходные!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Enum: выходной!");
                break;
            default:
                System.out.println("Enum: рабочий день");
        }

        // 11. Демонстрация НЕДОПУСТИМЫХ типов
        System.out.println("\n--- 11. НЕДОПУСТИМЫЕ типы ---");
        System.out.println("❌ long - нельзя");
        System.out.println("❌ float - нельзя");
        System.out.println("❌ double - нельзя");
        System.out.println("❌ boolean - нельзя");
        System.out.println("❌ Long, Float, Double, Boolean - нельзя");

        // 12. Важно: null в switch
        System.out.println("\n--- 12. NULL в switch ---");
        String nullString = null;
        try {
            switch (nullString) {
                case "test":
                    break;
                default:
                    break;
            }
        } catch (NullPointerException e) {
            System.out.println("! NullPointerException при switch с null");
            System.out.println("  switch(null) всегда выбрасывает NPE!");
        }

        // Сводная таблица
        System.out.println("\n--- СВОДНАЯ ТАБЛИЦА ДОПУСТИМЫХ ТИПОВ ---");
        System.out.println("Тип                | Пример");
        System.out.println("-------------------|------------------");
        System.out.println("byte               | switch((byte)1)");
        System.out.println("short              | switch((short)1)");
        System.out.println("int                | switch(1)");
        System.out.println("char               | switch('A')");
        System.out.println("Byte               | switch(Byte.valueOf(1))");
        System.out.println("Short              | switch(Short.valueOf(1))");
        System.out.println("Integer            | switch(Integer.valueOf(1))");
        System.out.println("Character          | switch(Character.valueOf('A'))");
        System.out.println("String (Java 7+)   | switch(\"text\")");
        System.out.println("Enum               | switch(Day.MONDAY)");
    }

    // Вспомогательный enum для демонстрации
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
