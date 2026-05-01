/**
 * Главный класс для запуска примеров с final.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("    FINAL: МЕТОДЫ И КЛАССЫ");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println(">>> ПРАКТИКА #1: final метод");
        FinalMethodDemo.main(args);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println(">>> ПРАКТИКА #2: final класс");
        FinalClassDemo.main(args);
    }
}
