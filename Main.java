/**
 * Демонстрация перегрузки методов и статического связывания.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕГРУЗКА И СВЯЗЫВАНИЕ ===\n");
        
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        
        System.out.println("--- Цикл for (1) ---");
        for (Number n : num) {
            System.out.print("n имеет тип Number, вызов printNum(n): ");
            a.printNum(n);
        }
        
        System.out.println("\n--- Прямые вызовы (2) ---");
        System.out.print("a.printNum(new Integer(1)): ");
        a.printNum(new Integer(1));
        
        System.out.print("a.printNum(11): ");
        a.printNum(11);
        
        System.out.print("a.printNum(1.11f): ");
        a.printNum(1.11f);
        
        System.out.print("a.printNum(11.11): ");
        a.printNum(11.11);
        
        System.out.println("\n--- ОБЪЯСНЕНИЕ ---");
        System.out.println("Перегрузка методов разрешается на ЭТАПЕ КОМПИЛЯЦИИ.");
        System.out.println("Компилятор выбирает метод на основе ОБЪЯВЛЕННОГО типа аргумента.");
        System.out.println();
        System.out.println("В цикле for (1):");
        System.out.println("- Переменная n объявлена как Number");
        System.out.println("- Компилятор всегда вызывает printNum(Number n)");
        System.out.println("- Несмотря на то, что реальные объекты имеют типы");
        System.out.println("  Integer, Float и т.д., вызывается метод с параметром Number");
        System.out.println();
        System.out.println("В прямых вызовах (2):");
        System.out.println("- new Integer(1) -> printNum(Integer i)");
        System.out.println("- 11 (int) -> printNum(int i)");
        System.out.println("- 1.11f (float) -> printNum(Float f)");
        System.out.println("- 11.11 (double) -> printNum(Number n)");
        System.out.println("  (double упаковывается в Double, который является Number)");
        
        System.out.println("\n--- ДЕМОНСТРАЦИЯ ТИПОВ ---");
        for (Object obj : num) {
            System.out.println("Объект: " + obj + ", реальный тип: " + obj.getClass().getSimpleName());
        }
    }
}
