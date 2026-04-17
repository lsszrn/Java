/**
 * Демонстрация операторов break и continue в циклах.
 *
 * @author lsszrn
 * @version 1.0
 */
public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: BREAK И CONTINUE ===\n");
        
        // Пример с break
        System.out.println("--- break в цикле for ---");
        System.out.println("Поиск первого числа больше 5:");
        int[] numbers = {1, 3, 5, 7, 9, 11};
        for (int num : numbers) {
            System.out.print(num + " ");
            if (num > 5) {
                System.out.println("\nНайдено число > 5: " + num + ", выход из цикла!");
                break;
            }
        }
        
        // Пример с continue
        System.out.println("\n--- continue в цикле for ---");
        System.out.println("Вывод только нечётных чисел:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // пропускаем чётные
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Пример с while и continue
        System.out.println("\n--- continue в while ---");
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 3 == 0) {
                continue; // пропускаем числа, кратные 3
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
