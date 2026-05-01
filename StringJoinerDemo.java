/**
 * Демонстрация использования класса StringJoiner.
 *
 * @author lsszrn
 * @version 1.0
 */
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: StringJoiner ===\n");
        
        // Пример 1: Простой разделитель
        System.out.println("--- Простой разделитель ---");
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("A");
        joiner1.add("B");
        joiner1.add("C");
        System.out.println("joiner1: " + joiner1);
        
        // Пример 2: Разделитель с префиксом и суффиксом
        System.out.println("\n--- С префиксом и суффиксом ---");
        StringJoiner joiner2 = new StringJoiner(" | ", "[", "]");
        joiner2.add("X");
        joiner2.add("Y");
        joiner2.add("Z");
        System.out.println("joiner2: " + joiner2);
        
        // Пример 3: Объединение двух StringJoiner
        System.out.println("\n--- Слияние ---");
        StringJoiner joiner3 = new StringJoiner("-");
        joiner3.add("1");
        joiner3.add("2");
        System.out.println("joiner3: " + joiner3);
        System.out.println("joiner2 + joiner3: " + joiner2.merge(joiner3));
        
        // Пример 4: Практическое применение - SQL запрос
        System.out.println("\n--- SQL запрос ---");
        String[] columns = {"id", "name", "age"};
        StringJoiner sj = new StringJoiner(", ", "SELECT ", " FROM users");
        for (String col : columns) {
            sj.add(col);
        }
        System.out.println(sj);
    }
}
