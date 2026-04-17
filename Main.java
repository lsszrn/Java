/**
 * Главный класс для запуска примеров с varargs.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("    ПЕРЕГРУЗКА МЕТОДОВ С ПЕРЕМЕННЫМ ЧИСЛОМ ПАРАМЕТРОВ");
        System.out.println("=".repeat(60) + "\n");
        
        VarargsOverloadDemo.main(args);
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        VarargsAmbiguityDemo.main(args);
    }
}
