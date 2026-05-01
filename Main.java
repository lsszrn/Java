/**
 * Главный класс для запуска примеров по наследованию.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("    НАСЛЕДОВАНИЕ: THIS, SUPER И СПЕЦИФИКАТОРЫ ДОСТУПА");
        System.out.println("=".repeat(60) + "\n");
        
        System.out.println(">>> ПРАКТИКА #1: this и super");
        ThisSuperDemo.main(args);
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        System.out.println(">>> ПРАКТИКА #2: Спецификаторы доступа при наследовании");
        AccessInheritanceDemo.main(args);
    }
}
