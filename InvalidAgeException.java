/**
 * Собственное исключение для неверного возраста.
 *
 * @author lsszrn
 * @version 1.0
 */
public class InvalidAgeException extends Exception {
    
    // 1. Конструктор по умолчанию
    public InvalidAgeException() {
        super("Неверный возраст");
    }
    
    // 2. Конструктор с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // 3. Конструктор с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
