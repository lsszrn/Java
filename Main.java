/**
 * Главный класс для запуска примеров перегрузки и переопределения.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("    ПЕРЕГРУЗКА МЕТОДОВ (OVERLOADING)");
        System.out.println("=".repeat(50));
        OverloadingDemo.main(args);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("    ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ (OVERRIDING)");
        System.out.println("=".repeat(50));
        OverridingDemo.main(args);
    }
}
