/**
 * Демонстрация генерации и обработки пяти видов исключений.
 *
 * @author lsszrn
 * @version 1.0
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        
        // 1. ArithmeticException - деление на ноль
        System.out.println("1. ArithmeticException:");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("   Поймано: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        System.out.println("\n2. ArrayIndexOutOfBoundsException:");
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   Поймано: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 3. IllegalArgumentException - неверный аргумент
        System.out.println("\n3. IllegalArgumentException:");
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("   Поймано: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типа
        System.out.println("\n4. ClassCastException:");
        try {
            Object obj = "Строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("   Поймано: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 5. NullPointerException - обращение к null
        System.out.println("\n5. NullPointerException:");
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("   Поймано: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
    }
    
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
    }
}
