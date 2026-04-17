/**
 * Демонстрация поведения switch при отсутствии break (fall-through).
 *
 * @author lsszrn
 * @version 1.0
 */
public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: ОТСУТСТВИЕ BREAK В SWITCH ===\n");

        // Исходный пример из задания
        System.out.println("--- Исходный пример ---");
        System.out.println("switch(value) {");
        System.out.println("    case 1:");
        System.out.println("        i = 1;");
        System.out.println("        break;");
        System.out.println("    case 2:");
        System.out.println("        i = 2;");
        System.out.println("    case 3:");
        System.out.println("        i = 3;");
        System.out.println("        break;");
        System.out.println("}");

        // Демонстрация для value = 1
        System.out.println("\n--- Демонстрация для value = 1 ---");
        testSwitch(1);

        // Демонстрация для value = 2
        System.out.println("\n--- Демонстрация для value = 2 ---");
        testSwitch(2);

        // Демонстрация для value = 3
        System.out.println("\n--- Демонстрация для value = 3 ---");
        testSwitch(3);

        // Демонстрация для value = 99
        System.out.println("\n--- Демонстрация для value = 99 ---");
        testSwitch(99);

        // Объяснение проваливания
        System.out.println("\n--- ОБЪЯСНЕНИЕ ---");
        System.out.println("Если в case нет break, выполнение 'проваливается' в следующий case.");
        System.out.println("Это называется 'fall-through'.");
        System.out.println();
        System.out.println("Для value = 1:");
        System.out.println("  - совпадает case 1: i = 1");
        System.out.println("  - есть break, выход из switch");
        System.out.println("  - результат: i = 1");
        System.out.println();
        System.out.println("Для value = 2:");
        System.out.println("  - совпадает case 2: i = 2");
        System.out.println("  - НЕТ break, проваливаемся в case 3");
        System.out.println("  - выполняется case 3: i = 3");
        System.out.println("  - есть break, выход из switch");
        System.out.println("  - результат: i = 3 (!!!), хотя value = 2");
        System.out.println();
        System.out.println("Для value = 3:");
        System.out.println("  - совпадает case 3: i = 3");
        System.out.println("  - есть break, выход из switch");
        System.out.println("  - результат: i = 3");

        // Полезное использование fall-through
        System.out.println("\n--- ПОЛЕЗНОЕ ИСПОЛЬЗОВАНИЕ FALL-THROUGH ---");
        
        System.out.println("\nПример 1: Несколько значений для одного действия");
        int month = 2;
        int days;
        switch (month) {
            case 1:  // январь
            case 3:  // март
            case 5:  // май
            case 7:  // июль
            case 8:  // август
            case 10: // октябрь
            case 12: // декабрь
                days = 31;
                break;
            case 4:  // апрель
            case 6:  // июнь
            case 9:  // сентябрь
            case 11: // ноябрь
                days = 30;
                break;
            case 2:  // февраль
                days = 28;
                break;
            default:
                days = -1;
        }
        System.out.println("Месяц " + month + ": " + days + " дней");

        System.out.println("\nПример 2: Иерархия действий");
        int score = 85;
        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "Отлично (A)";
                break;
            case 8:
                grade = "Хорошо (B)";
                break;
            case 7:
                grade = "Удовлетворительно (C)";
                break;
            case 6:
                grade = "Посредственно (D)";
                break;
            default:
                grade = "Неудовлетворительно (F)";
        }
        System.out.println("Оценка " + score + " -> " + grade);

        System.out.println("\nПример 3: Дни недели (выходные vs будни)");
        String day = "суббота";
        String dayType;
        switch (day) {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                dayType = "будний день";
                break;
            case "суббота":
            case "воскресенье":
                dayType = "выходной!";
                break;
            default:
                dayType = "неизвестно";
        }
        System.out.println(day + " - это " + dayType);

        // Предупреждение
        System.out.println("\n--- ВАЖНО ---");
        System.out.println("! Отсутствие break - частая причина ошибок !");
        System.out.println("! Всегда проверяйте, нужен ли вам fall-through !");
        System.out.println("! Современные IDE предупреждают о возможном пропуске break !");
    }

    /**
     * Тестирует switch для заданного значения.
     * Демонстрирует поведение из задания.
     */
    static void testSwitch(int value) {
        int i = 0;
        System.out.println("До switch: i = " + i);

        switch (value) {
            case 1:
                System.out.println("  -> case 1: i = 1");
                i = 1;
                break;
            case 2:
                System.out.println("  -> case 2: i = 2 (нет break!)");
                i = 2;
            case 3:
                System.out.println("  -> case 3: i = 3");
                i = 3;
                break;
            default:
                System.out.println("  -> default: i = 99");
                i = 99;
                break;
        }

        System.out.println("После switch: i = " + i);
    }
}
