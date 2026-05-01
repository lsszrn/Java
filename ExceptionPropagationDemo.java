/**
 * Демонстрация перехваченного и неперехваченного исключений.
 *
 * @author lsszrn
 * @version 1.0
 */
public class ExceptionPropagationDemo {
    
    // Метод генерирует исключение, которое НЕ перехватывается
    public static void methodWithUncaughtException() {
        System.out.println("   Вход в methodWithUncaughtException");
        throw new RuntimeException("Неперехваченное исключение!");
    }
    
    // Метод генерирует исключение, которое перехватывается
    public static void methodWithCaughtException() {
        System.out.println("   Вход в methodWithCaughtException");
        throw new ArithmeticException("Деление на ноль!");
    }
    
    // Метод, который вызывает оба метода
    public static void intermediateMethod() {
        System.out.println("Вход в intermediateMethod");
        
        // Первое исключение - перехватывается
        try {
            methodWithCaughtException();
        } catch (ArithmeticException e) {
            System.out.println("   Перехвачено в intermediateMethod: " + e.getMessage());
        }
        
        // Второе исключение - не перехватывается, уходит выше
        methodWithUncaughtException();
        
        System.out.println("Эта строка не выполнится");
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕХВАЧЕННОЕ И НЕПЕРЕХВАЧЕННОЕ ИСКЛЮЧЕНИЯ ===\n");
        
        System.out.println("Начало программы\n");
        
        try {
            intermediateMethod();
        } catch (RuntimeException e) {
            System.out.println("\nПерехвачено в main: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("\nПрограмма завершилась корректно, несмотря на исключение!");
        }
        
        System.out.println("\n--- ОБЪЯСНЕНИЕ ---");
        System.out.println("1. ArithmeticException перехвачено в intermediateMethod");
        System.out.println("2. RuntimeException не перехвачено в intermediateMethod,");
        System.out.println("   передалось в main и там было перехвачено");
        System.out.println("3. Если бы и в main не было catch, программа бы аварийно завершилась");
    }
}
