import java.io.IOException;
import java.util.Scanner;

public class HelloConsole {
    public static void main(String[] args) {
        System.out.println("Привет! Это программа приветствия.");
        Scanner scan = new Scanner(System.in);        
        System.out.print("Введите ваше имя: ");
        String name = scan.next();        
        System.out.println("Привет, " + name + "!");
        System.out.print("Нажмите любую клавишу для завершения... ");        
        try {
            int x = System.in.read();
            System.out.println("Вы нажали клавишу с кодом: " + x);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении с консоли: " + e.getMessage());
        }
        scan.close();
        System.out.println("Программа завершена.");
    }
}
