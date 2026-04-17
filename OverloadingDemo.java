/**
 * Дополнительная демонстрация статического связывания при перегрузке.
 *
 * @author lsszrn
 * @version 1.0
 */
public class OverloadingDemo {
    
    public void test(Object o) {
        System.out.println("Object: " + o);
    }
    
    public void test(String s) {
        System.out.println("String: " + s);
    }
    
    public void test(Integer i) {
        System.out.println("Integer: " + i);
    }
    
    public static void main(String[] args) {
        System.out.println("=== СТАТИЧЕСКОЕ СВЯЗЫВАНИЕ ПРИ ПЕРЕГРУЗКЕ ===\n");
        
        OverloadingDemo demo = new OverloadingDemo();
        
        Object obj1 = "Hello";
        Object obj2 = 42;
        String str = "World";
        Integer num = 100;
        
        System.out.println("--- Переменные объявленного типа Object ---");
        System.out.print("obj1 = \"Hello\" (тип Object): ");
        demo.test(obj1);
        
        System.out.print("obj2 = 42 (тип Object): ");
        demo.test(obj2);
        
        System.out.println("\n--- Переменные конкретных типов ---");
        System.out.print("str = \"World\" (тип String): ");
        demo.test(str);
        
        System.out.print("num = 100 (тип Integer): ");
        demo.test(num);
        
        System.out.println("\n--- ВЫВОД ---");
        System.out.println("Перегрузка зависит от ОБЪЯВЛЕННОГО типа переменной,");
        System.out.println("а не от ФАКТИЧЕСКОГО типа объекта!");
        System.out.println("Это называется 'статическое связывание' (compile-time).");
    }
}
