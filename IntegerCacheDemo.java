/**
 * Демонстрация работы IntegerCache и особенностей сравнения Integer.
 * Integer кэширует значения от -128 до 127.
 *
 * @author lsszrn
 * @version 1.0
 */
public class IntegerCacheDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #4: INTEGER CACHE ===\n");
        
        System.out.println("IntegerCache кэширует значения от -128 до 127.");
        System.out.println("Значения из кэша возвращают ОДИН И ТОТ ЖЕ объект.\n");
        
        // Часть 1: значение 128 (вне кэша)
        System.out.println("--- ЧАСТЬ 1: ЗНАЧЕНИЕ 128 (вне кэша) ---");
        int i1 = 128;
        Integer a1 = i1;   // boxing через Integer.valueOf(128)
        Integer b1 = i1;   // boxing через Integer.valueOf(128)
        
        System.out.println("int i1 = 128;");
        System.out.println("Integer a1 = i1;");
        System.out.println("Integer b1 = i1;");
        System.out.println();
        System.out.println("a1 == i1   -> " + (a1 == i1));
        System.out.println("b1 == i1   -> " + (b1 == i1));
        System.out.println("a1 == b1   -> " + (a1 == b1));
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));
        
        System.out.println("\nОбъяснение для 128:");
        System.out.println("- a1 == i1: true (распаковка a1, сравниваются примитивы 128 == 128)");
        System.out.println("- a1 == b1: FALSE (разные объекты, т.к. 128 вне кэша)");
        System.out.println("- equals(): true (сравнивает значения, а не ссылки)");
        
        // Часть 2: значение 127 (внутри кэша)
        System.out.println("\n--- ЧАСТЬ 2: ЗНАЧЕНИЕ 127 (внутри кэша) ---");
        int i2 = 127;
        Integer a2 = i2;   // boxing через Integer.valueOf(127)
        Integer b2 = i2;   // boxing через Integer.valueOf(127)
        
        System.out.println("int i2 = 127;");
        System.out.println("Integer a2 = i2;");
        System.out.println("Integer b2 = i2;");
        System.out.println();
        System.out.println("a2 == i2   -> " + (a2 == i2));
        System.out.println("b2 == i2   -> " + (b2 == i2));
        System.out.println("a2 == b2   -> " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
        
        System.out.println("\nОбъяснение для 127:");
        System.out.println("- a2 == i2: true (распаковка, сравниваются примитивы)");
        System.out.println("- a2 == b2: TRUE (ОДИН объект из кэша IntegerCache!)");
        System.out.println("- equals(): true (значения равны)");
        
        // Дополнительная демонстрация IntegerCache
        System.out.println("\n--- ДЕМОНСТРАЦИЯ INTEGER CACHE ---");
        Integer c1 = 100;
        Integer c2 = 100;
        Integer c3 = 200;
        Integer c4 = 200;
        
        System.out.println("100 == 100: " + (c1 == c2) + " (из кэша)");
        System.out.println("200 == 200: " + (c3 == c4) + " (новые объекты)");
        
        // Создание через valueOf явно
        System.out.println("\n--- valueOf() тоже использует кэш ---");
        Integer v1 = Integer.valueOf(127);
        Integer v2 = Integer.valueOf(127);
        Integer v3 = Integer.valueOf(128);
        Integer v4 = Integer.valueOf(128);
        
        System.out.println("valueOf(127) == valueOf(127): " + (v1 == v2));
        System.out.println("valueOf(128) == valueOf(128): " + (v3 == v4));
        
        // Создание через new (всегда новый объект)
        System.out.println("\n--- new Integer() НЕ использует кэш ---");
        @SuppressWarnings("deprecation")
        Integer n1 = new Integer(127);
        @SuppressWarnings("deprecation")
        Integer n2 = new Integer(127);
        System.out.println("new Integer(127) == new Integer(127): " + (n1 == n2));
        System.out.println("new Integer(127) == valueOf(127): " + (n1 == v1));
        
        // Как изменить размер кэша (JVM параметр)
        System.out.println("\n--- НАСТРОЙКА INTEGER CACHE ---");
        System.out.println("Размер кэша можно изменить через JVM параметр:");
        System.out.println("-XX:AutoBoxCacheMax=<size>");
        System.out.println("Например: -XX:AutoBoxCacheMax=500 (кэширует до 500)");
        
        // ИТОГ
        System.out.println("\n--- ВАЖНОЕ ПРАВИЛО ---");
        System.out.println("! ВСЕГДА используйте .equals() для сравнения объектов Integer !");
        System.out.println("  (кроме случаев, когда точно знаете про кэш)");
    }
}
