/**
 * Главный класс для запуска всех тестов спецификаторов доступа.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("    ДЕМОНСТРАЦИЯ СПЕЦИФИКАТОРОВ ДОСТУПА");
        System.out.println("=".repeat(60));
        
        System.out.println("\n>>> Тест внутри класса");
        package1.AccessDemo demo = new package1.AccessDemo();
        demo.testInsideClass();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("\n>>> Тест из того же пакета");
        package1.SamePackageTest.main(args);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("\n>>> Тест из другого пакета");
        package2.OtherPackageTest.main(args);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("\n>>> Тест из подкласса в другом пакете");
        package2.SubClassTest.main(args);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("    ИТОГОВАЯ ТАБЛИЦА");
        System.out.println("=".repeat(60));
        System.out.println("Спецификатор | Класс | Пакет | Подкласс | Все");
        System.out.println("-------------|-------|-------|----------|-----");
        System.out.println("private      |   ✓   |   ✗   |    ✗     |  ✗");
        System.out.println("default      |   ✓   |   ✓   |    ✗     |  ✗");
        System.out.println("protected    |   ✓   |   ✓   |    ✓     |  ✗");
        System.out.println("public       |   ✓   |   ✓   |    ✓     |  ✓");
        System.out.println("=".repeat(60));
    }
}
