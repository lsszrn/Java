/**
 * Демонстрация спецификаторов форматирования времени и даты.
 *
 * @author lsszrn
 * @version 1.0
 */
import java.util.Date;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: СПЕЦИФИКАТОРЫ ВРЕМЕНИ И ДАТЫ ===\n");
        
        Date now = new Date();
        
        // %tH - Час (00–23)
        System.out.printf("1. %%tH: Час (00-23): %tH%n", now);
        
        // %tM - Минуты (00–59)
        System.out.printf("2. %%tM: Минуты (00-59): %tM%n", now);
        
        // %tS - Секунды (00–59)
        System.out.printf("3. %%tS: Секунды (00-59): %tS%n", now);
        
        // %tY - Год в четырехзначном формате
        System.out.printf("4. %%tY: Год: %tY%n", now);
        
        // %tB - Полное название месяца
        System.out.printf("5. %%tB: Месяц: %tB%n", now);
        
        // Комбинированный пример
        System.out.printf("%n--- Полная дата и время ---%n");
        System.out.printf("%tH:%tM:%tS %td.%tm.%tY%n", now, now, now, now, now, now);
        
        // Упрощенная запись (один аргумент)
        System.out.printf("%n--- Упрощенная запись ---%n");
        System.out.printf("Время: %1$tH:%1$tM:%1$tS%n", now);
        System.out.printf("Дата: %1$td %1$tB %1$tY года%n", now);
    }
}
