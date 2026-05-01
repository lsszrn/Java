import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
 * Демонстрация работы метода write(int) класса OutputStream.
 *
 * @author lsszrn
 * @version 1.0
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: OutputStream.write(int) ===\n");
        
        String fileName = "test_write.txt";
        
        // Запись байтов через FileOutputStream (подкласс OutputStream)
        try (OutputStream output = new FileOutputStream(fileName)) {
            
            // write(int) пишет один байт (младшие 8 бит значения)
            output.write(65);   // 'A'
            output.write(66);   // 'B'
            output.write(67);   // 'C'
            output.write(10);   // символ новой строки
            output.write(72);   // 'H'
            output.write(105);  // 'i'
            
            System.out.println("Данные записаны в файл: " + fileName);
            
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
        
        // Проверка чтением
        System.out.println("\nПроверка содержимого файла:");
        try (java.io.FileReader fr = new java.io.FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
