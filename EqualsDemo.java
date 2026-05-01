/**
 * Демонстрация работы переопределенного метода equals().
 *
 * @author lsszrn
 * @version 1.0
 */
public class EqualsDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕОПРЕДЕЛЕНИЕ equals() ===\n");
        
        Person p1 = new Person("Иван", "Иванов", 25);
        Person p2 = new Person("Иван", "Иванов", 25);
        Person p3 = new Person("Петр", "Петров", 30);
        Person p4 = p1;
        Person p5 = null;
        
        // 1. Рефлексивность: x.equals(x) = true
        System.out.println("--- Рефлексивность ---");
        System.out.println("p1.equals(p1) = " + p1.equals(p1) + " (должно быть true)");
        
        // 2. Симметричность: x.equals(y) = y.equals(x)
        System.out.println("\n--- Симметричность ---");
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p1) = " + p2.equals(p1));
        System.out.println("(должны быть одинаковыми)");
        
        // 3. Транзитивность
        System.out.println("\n--- Транзитивность ---");
        Person p6 = new Person("Иван", "Иванов", 25);
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p6) = " + p2.equals(p6));
        System.out.println("p1.equals(p6) = " + p1.equals(p6));
        System.out.println("(если первые два true, то и третье должно быть true)");
        
        // 4. Согласованность (несколько вызовов дают одинаковый результат)
        System.out.println("\n--- Согласованность ---");
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("(при многократном вызове результат не меняется)");
        
        // 5. Сравнение с null
        System.out.println("\n--- Сравнение с null ---");
        System.out.println("p1.equals(null) = " + p1.equals(p5) + " (должно быть false)");
        
        // 6. Разные объекты
        System.out.println("\n--- Разные объекты ---");
        System.out.println("p1.equals(p3) = " + p1.equals(p3) + " (должно быть false)");
        
        // 7. Одинаковые ссылки
        System.out.println("\n--- Одинаковые ссылки ---");
        System.out.println("p1.equals(p4) = " + p1.equals(p4) + " (должно быть true)");
        
        System.out.println("\n--- СОГЛАШЕНИЯ ДЛЯ equals() ---");
        System.out.println("1. Рефлексивность: x.equals(x) всегда true");
        System.out.println("2. Симметричность: x.equals(y) == y.equals(x)");
        System.out.println("3. Транзитивность: если x.equals(y) и y.equals(z), то x.equals(z)");
        System.out.println("4. Согласованность: результат не меняется при многократном вызове");
        System.out.println("5. x.equals(null) всегда false");
        System.out.println("\n! Всегда переопределяйте hashCode() вместе с equals()");
    }
}
