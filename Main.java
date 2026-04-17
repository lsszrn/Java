/**
 * Главный класс для запуска примеров с перечислениями.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("    ПЕРЕЧИСЛЕНИЯ (ENUM)");
        System.out.println("=".repeat(60) + "\n");
        
        System.out.println(">>> ПРАКТИКА #1: Инициализация элементов enum");
        EnumInitDemo.main(args);
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        System.out.println(">>> ПРАКТИКА #2: Собственное перечисление с методами");
        CustomEnumDemo.main(args);
    }
}
