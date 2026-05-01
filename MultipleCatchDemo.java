/**
 * Демонстрация обработки нескольких исключений.
 *
 * @author lsszrn
 * @version 1.0
 */

// Иерархия исключений: Ex1 <- Ex2 <- Ex3
class Ex1 extends Exception {
    public Ex1(String msg) { super(msg); }
}

class Ex2 extends Ex1 {
    public Ex2(String msg) { super(msg); }
}

class Ex3 extends Ex2 {
    public Ex3(String msg) { super(msg); }
}

public class MultipleCatchDemo {
    
    // Метод для демонстрации идентичной обработки
    public static void demonstrateMultiCatch(int value) {
        System.out.println("--- Идентичная обработка нескольких исключений ---");
        try {
            if (value == 0) {
                throw new ArithmeticException("Деление на ноль");
            } else if (value == 1) {
                throw new NullPointerException("null ссылка");
            } else {
                int[] arr = new int[3];
                arr[10] = 5;
            }
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
    
    // Метод для демонстрации иерархии исключений
    public static void demonstrateHierarchy(int level) {
        System.out.println("\n--- Иерархия catch: Ex1 <- Ex2 <- Ex3 ---");
        try {
            if (level == 1) {
                throw new Ex1("Исключение Ex1");
            } else if (level == 2) {
                throw new Ex2("Исключение Ex2");
            } else {
                throw new Ex3("Исключение Ex3");
            }
        } catch (Ex3 e) {
            System.out.println("Пойман Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Пойман Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Пойман Ex1: " + e.getMessage());
        }
        System.out.println("(catch должны идти от подклассов к суперклассам)");
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: МНОЖЕСТВЕННЫЙ CATCH ===\n");
        
        // Идентичная обработка через |
        demonstrateMultiCatch(0);
        demonstrateMultiCatch(1);
        demonstrateMultiCatch(2);
        
        // Иерархия исключений
        demonstrateHierarchy(1);
        demonstrateHierarchy(2);
        demonstrateHierarchy(3);
        
        // НЕПРАВИЛЬНЫЙ порядок (вызовет ошибку компиляции)
        System.out.println("\n--- НЕПРАВИЛЬНЫЙ порядок catch ---");
        System.out.println("catch (Ex1 e) {} catch (Ex2 e) {} // ОШИБКА!");
        System.out.println("Ex2 уже пойман как Ex1, порядок должен быть от подкласса к суперклассу");
        
        // НЕПРАВИЛЬНОЕ объединение через |
        System.out.println("\n--- НЕПРАВИЛЬНОЕ объединение через | ---");
        System.out.println("catch (Ex1 | Ex2 e) {} // ОШИБКА!");
        System.out.println("Нельзя объединять исключения из одной иерархической цепочки");
    }
}
