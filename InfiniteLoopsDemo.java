/**
 * Демонстрация бесконечных циклов while и do-while.
 *
 * @author lsszrn
 * @version 1.0
 */
public class InfiniteLoopsDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: БЕСКОНЕЧНЫЕ ЦИКЛЫ ===\n");
        
        // Пример 1: while с условием true
        System.out.println("--- while(true) ---");
        System.out.println("while (true) {");
        System.out.println("    // код выполняется бесконечно");
        System.out.println("}");
        
        // Пример 2: while с не изменяющимся условием
        System.out.println("\n--- while с неизменным условием ---");
        System.out.println("int x = 5;");
        System.out.println("while (x > 0) {");
        System.out.println("    // x не меняется, условие всегда true");
        System.out.println("}");
        
        // Пример 3: do-while с true
        System.out.println("\n--- do-while(true) ---");
        System.out.println("do {");
        System.out.println("    // выполнится хотя бы один раз, потом бесконечно");
        System.out.println("} while (true);");
        
        // Демонстрация с выходом через break
        System.out.println("\n--- Демонстрация с выходом через break ---");
        int count = 0;
        while (true) {
            count++;
            System.out.println("Итерация: " + count);
            if (count >= 3) {
                System.out.println("Выход через break!");
                break;
            }
        }
    }
}
