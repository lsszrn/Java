/**
 * Демонстрация пяти спецификаторов форматирования.
 *
 * @author lsszrn
 * @version 1.0
 */
public class FormatterDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: СПЕЦИФИКАТОРЫ ФОРМАТИРОВАНИЯ ===\n");
        
        // %s - строковое представление
        String name = "Иван";
        System.out.printf("1. %%s: Привет, %s!%n", name);
        
        // %d - десятичное целое значение
        int age = 25;
        System.out.printf("2. %%d: Возраст: %d лет%n", age);
        
        // %f - значение с плавающей точкой
        double pi = 3.1415926535;
        System.out.printf("3. %%f: Число Пи = %f%n", pi);
        System.out.printf("   %%.2f (2 знака): %.2f%n", pi);
        
        // %b - логическое значение
        boolean isJavaFun = true;
        System.out.printf("4. %%b: Java это весело? %b%n", isJavaFun);
        
        // %e - экспоненциальное представление
        double bigNumber = 1234567.89;
        System.out.printf("5. %%e: Большое число = %e%n", bigNumber);
        
        // %n - новая строка (вместо \n)
        System.out.printf("Строка 1%nСтрока 2%nСтрока 3%n");
    }
}
