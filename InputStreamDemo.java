import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

/**
 * Демонстрация работы метода read() класса InputStream.
 *
 * @author lsszrn
 * @version 1.0
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: InputStream.read() ===\n");
        
        // Файл создается автоматически для примера
        String fileName = "test_read.txt";
        
        // Запись тестовых данных в файл
        try (java.io.FileWriter fw = new java.io.FileWriter(fileName)) {
            fw.write("ABC");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
            return;
        }
        
        // Чтение файла через FileInputStream (подкласс InputStream)
        try (InputStream input = new FileInputStream(fileName)) {
            
            // read() читает один байт и возвращает его как int (0-255)
            // Возвращает -1, если достигнут конец файла
            System.out.println("Побайтовое чтение файла:");
            int byteValue;
            while ((byteValue = input.read()) != -1) {
                System.out.println("  Байт: " + byteValue + " (символ: '" + (char) byteValue + "')");
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
