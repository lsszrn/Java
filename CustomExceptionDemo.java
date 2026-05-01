/**
 * Демонстрация использования собственного исключения.
 *
 * @author lsszrn
 * @version 1.0
 */
public class CustomExceptionDemo {
    
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным: " + age);
        }
        if (age > 150) {
            throw new InvalidAgeException("Слишком большой возраст: " + age);
        }
        System.out.println("Возраст " + age + " допустим");
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: СОБСТВЕННОЕ ИСКЛЮЧЕНИЕ ===\n");
        
        int[] ages = {25, -5, 200};
        
        for (int age : ages) {
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
