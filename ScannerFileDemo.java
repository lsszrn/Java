import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Демонстрация чтения данных из текстового файла с помощью Scanner.
 *
 * @author lsszrn
 * @version 1.0
 */
public class ScannerFileDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ЧТЕНИЕ ИЗ ФАЙЛА ЧЕРЕЗ Scanner ===\n");
        
        String fileName = "data.txt";
        
        // Создание тестового файла
        try (java.io.FileWriter fw = new java.io.FileWriter(fileName)) {
            fw.write("Иван 25\n");
            fw.write("Мария 30\n");
            fw.write("Петр 22\n");
        } catch (Exception e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
            return;
        }
        
        // Чтение файла через Scanner
        try (Scanner scanner = new Scanner(new File(fileName))) {
            
            System.out.println("--- Построчное чтение ---");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        
        // Чтение с разбором по токенам
        System.out.println("\n--- Чтение по словам и числам ---");
        try (Scanner scanner = new Scanner(new File(fileName))) {
            
            while (scanner.hasNext()) {
                String name = scanner.next();
                int age = scanner.nextInt();
                System.out.println("Имя: " + name + ", Возраст: " + age);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
