/**
 * Главный класс для запуска примеров вызова статических методов.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("    ВАРИАНТЫ ВЫЗОВА СТАТИЧЕСКОГО МЕТОДА");
        System.out.println("=".repeat(50) + "\n");
        
        StaticCallDemo.main(args);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        StaticImportDemo.main(args);
    }
}
