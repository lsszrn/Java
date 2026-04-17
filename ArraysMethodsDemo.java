/**
 * Демонстрация методов класса java.util.Arrays.
 *
 * @author lsszrn
 * @version 1.0
 */
import java.util.Arrays;

public class ArraysMethodsDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: МЕТОДЫ java.util.Arrays ===\n");
        
        // 1. toString() - преобразование массива в строку
        System.out.println("--- 1. Arrays.toString() ---");
        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.println("Массив: " + Arrays.toString(numbers));
        
        // 2. sort() - сортировка массива
        System.out.println("\n--- 2. Arrays.sort() ---");
        System.out.println("До сортировки: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("После сортировки: " + Arrays.toString(numbers));
        
        // 3. binarySearch() - бинарный поиск
        System.out.println("\n--- 3. Arrays.binarySearch() ---");
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("Массив: " + Arrays.toString(sortedArray));
        
        int key = 7;
        int index = Arrays.binarySearch(sortedArray, key);
        System.out.println("Индекс числа " + key + ": " + index);
        
        key = 8;
        index = Arrays.binarySearch(sortedArray, key);
        System.out.println("Индекс числа " + key + " (отсутствует): " + index);
        System.out.println("(отрицательное значение означает, что элемент не найден)");
        
        // 4. equals() - сравнение массивов
        System.out.println("\n--- 4. Arrays.equals() ---");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 6};
        
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr1.equals(arr2): " + Arrays.equals(arr1, arr2));
        System.out.println("arr1.equals(arr3): " + Arrays.equals(arr1, arr3));
        
        // 5. compare() - лексикографическое сравнение
        System.out.println("\n--- 5. Arrays.compare() ---");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        int[] d = {1, 2};
        
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));
        System.out.println("d: " + Arrays.toString(d));
        System.out.println("Arrays.compare(a, b): " + Arrays.compare(a, b) + " (равны)");
        System.out.println("Arrays.compare(a, c): " + Arrays.compare(a, c) + " (a < c)");
        System.out.println("Arrays.compare(c, a): " + Arrays.compare(c, a) + " (c > a)");
        System.out.println("Arrays.compare(a, d): " + Arrays.compare(a, d) + " (a > d, длиннее)");
    }
}
