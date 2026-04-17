/**
 * Демонстрация замены конструкции if-else-if на тернарный оператор ?:
 *
 * @author lsszrn
 * @version 1.0
 */
public class TernaryDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ЗАМЕНА if-else НА ?: ===\n");
        
        // Исходный код с if-else-if
        System.out.println("--- Исходный код ---");
        System.out.println("int i = 0;");
        System.out.println("if (a == 1) {");
        System.out.println("    i = 1;");
        System.out.println("} else if (a == 2) {");
        System.out.println("    i = 2;");
        System.out.println("} else {");
        System.out.println("    i = 3;");
        System.out.println("}");
        
        // Эквивалентный код через тернарный оператор
        System.out.println("\n--- Эквивалент через ?: ---");
        System.out.println("int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;");
        
        // Демонстрация работы
        System.out.println("\n--- Демонстрация работы ---");
        
        testTernary(1);  // a = 1
        testTernary(2);  // a = 2
        testTernary(5);  // a = 5 (любое другое)
        testTernary(0);  // a = 0
        
        // Разбор синтаксиса
        System.out.println("\n--- Разбор синтаксиса ---");
        System.out.println("int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;");
        System.out.println("         \\_____/   |    \\_____/   |   |");
        System.out.println("         условие1   |    условие2   |   |");
        System.out.println("                    |               |   |");
        System.out.println("         если true -+               |   |");
        System.out.println("                                    |   |");
        System.out.println("                     если true -----+   |");
        System.out.println("                                        |");
        System.out.println("                         если false ----+");
        
        // Вложенное объяснение
        System.out.println("\n--- Вложенное объяснение ---");
        System.out.println("i = (a == 1) ? 1 : ( (a == 2) ? 2 : 3 )");
        System.out.println("    \\_____/     |      \\________________/");
        System.out.println("    если a==1    |          иначе (вложенный тернарный)");
        System.out.println("                 |");
        System.out.println("         вернуть 1");
    }
    
    /**
     * Тестирует тернарный оператор для заданного значения a.
     *
     * @param a значение переменной a
     */
    static void testTernary(int a) {
        // Исходный способ с if-else-if
        int i_if;
        if (a == 1) {
            i_if = 1;
        } else if (a == 2) {
            i_if = 2;
        } else {
            i_if = 3;
        }
        
        // Через тернарный оператор
        int i_ternary = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        
        System.out.println("a = " + a);
        System.out.println("  if-else-if: i = " + i_if);
        System.out.println("  ?:        : i = " + i_ternary);
        
        // Проверка равенства результатов
        if (i_if == i_ternary) {
            System.out.println("  Результаты совпадают ✓");
        }
    }
}
