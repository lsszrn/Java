/**
 * Демонстрация присваивания массивов.
 *
 * @author lsszrn
 * @version 1.0
 */
public class ArrayAssignmentDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПРИСВАИВАНИЕ МАССИВОВ ===\n");
        
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        
        System.out.println("До присваивания a1 = a2:");
        System.out.print("a1: ");
        for (int num : a1) System.out.print(num + " ");
        System.out.print("\na2: ");
        for (int num : a2) System.out.print(num + " ");
        
        a1 = a2;
        
        System.out.println("\n\nПосле присваивания a1 = a2:");
        System.out.print("a1: ");
        for (int num : a1) System.out.print(num + " ");
        System.out.print("\na2: ");
        for (int num : a2) System.out.print(num + " ");
        
        System.out.println("\n\nОбъяснение:");
        System.out.println("- a1 и a2 теперь ссылаются на ОДИН массив {6,7,8,9,10}");
        System.out.println("- Исходный массив {1,2,3,4,5} потерян (сборщик мусора)");
        System.out.println("- Изменение a1[0] изменит и a2[0]");
        
        a1[0] = 99;
        System.out.println("\nПосле a1[0] = 99:");
        System.out.println("a1[0] = " + a1[0]);
        System.out.println("a2[0] = " + a2[0]);
    }
}
