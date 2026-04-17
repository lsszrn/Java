/**
 * Демонстрация всех способов создания экземпляра класса Boolean.
 * Включает статические методы, поля-константы и автоупаковку.
 *
 * @author lsszrn
 * @version 1.0
 */
public class BooleanCreationDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: СПОСОБЫ СОЗДАНИЯ BOOLEAN ===\n");
        
        // Способ 1: Статический метод valueOf(boolean)
        System.out.println("--- 1. Boolean.valueOf(boolean) ---");
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);
        System.out.println("Boolean.valueOf(true)  = " + b1);
        System.out.println("Boolean.valueOf(false) = " + b2);
        
        // Способ 2: Статический метод valueOf(String)
        System.out.println("\n--- 2. Boolean.valueOf(String) ---");
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("TRUE");
        Boolean b5 = Boolean.valueOf("True");
        Boolean b6 = Boolean.valueOf("false");
        Boolean b7 = Boolean.valueOf("anything");  // любая строка кроме "true" -> false
        Boolean b8 = Boolean.valueOf(null);        // null -> false (не выбрасывает NPE!)
        
        System.out.println("Boolean.valueOf(\"true\")     = " + b3);
        System.out.println("Boolean.valueOf(\"TRUE\")     = " + b4);
        System.out.println("Boolean.valueOf(\"True\")     = " + b5);
        System.out.println("Boolean.valueOf(\"false\")    = " + b6);
        System.out.println("Boolean.valueOf(\"anything\") = " + b7 + " (любая строка != \"true\" -> false)");
        System.out.println("Boolean.valueOf(null)         = " + b8 + " (null -> false, без исключения!)");
        
        // Способ 3: parseBoolean(String)
        System.out.println("\n--- 3. Boolean.parseBoolean(String) ---");
        boolean prim1 = Boolean.parseBoolean("true");
        boolean prim2 = Boolean.parseBoolean("false");
        boolean prim3 = Boolean.parseBoolean("hello");
        
        System.out.println("Boolean.parseBoolean(\"true\")  = " + prim1);
        System.out.println("Boolean.parseBoolean(\"false\") = " + prim2);
        System.out.println("Boolean.parseBoolean(\"hello\") = " + prim3);
        System.out.println("! parseBoolean возвращает примитив boolean, не объект !");
        
        // Способ 4: Константы Boolean.TRUE и Boolean.FALSE
        System.out.println("\n--- 4. Константы Boolean.TRUE / Boolean.FALSE ---");
        Boolean b9 = Boolean.TRUE;
        Boolean b10 = Boolean.FALSE;
        System.out.println("Boolean.TRUE  = " + b9);
        System.out.println("Boolean.FALSE = " + b10);
        System.out.println("(это единственные два экземпляра Boolean в памяти!)");
        System.out.println("Boolean.TRUE == Boolean.valueOf(true): " + (Boolean.TRUE == Boolean.valueOf(true)));
        
        // Способ 5: Автоупаковка (boxing)
        System.out.println("\n--- 5. Автоупаковка (boxing) ---");
        Boolean b11 = true;   // автоматически Boolean.valueOf(true)
        Boolean b12 = false;  // автоматически Boolean.valueOf(false)
        System.out.println("Boolean b11 = true;   // -> " + b11);
        System.out.println("Boolean b12 = false;  // -> " + b12);
        System.out.println("b11 == Boolean.TRUE: " + (b11 == Boolean.TRUE));
        
        // Способ 6: Конструктор (УСТАРЕВШИЙ, не рекомендуется!)
        System.out.println("\n--- 6. Конструктор (УСТАРЕВШИЙ @Deprecated) ---");
        @SuppressWarnings("deprecation")
        Boolean b13 = new Boolean(true);
        @SuppressWarnings("deprecation")
        Boolean b14 = new Boolean("true");
        System.out.println("new Boolean(true)       = " + b13 + " (НЕ ИСПОЛЬЗУЙТЕ!)");
        System.out.println("new Boolean(\"true\")     = " + b14 + " (НЕ ИСПОЛЬЗУЙТЕ!)");
        System.out.println("! Конструктор создаёт новый объект вместо использования кэша !");
        System.out.println("new Boolean(true) == Boolean.TRUE: " + (b13 == Boolean.TRUE));
        
        // Сводка
        System.out.println("\n--- СВОДКА: РЕКОМЕНДУЕМЫЕ СПОСОБЫ ---");
        System.out.println("1. Boolean.TRUE / Boolean.FALSE     (константы)");
        System.out.println("2. Boolean.valueOf(boolean)          (статический метод)");
        System.out.println("3. Автоупаковка: Boolean b = true;   (компактно)");
        System.out.println("4. Boolean.valueOf(String)           (из строки)");
        System.out.println("5. Boolean.parseBoolean(String)      (возвращает boolean)");
        System.out.println("\n! НЕ ИСПОЛЬЗУЙТЕ: new Boolean(...)   (устаревший)");
    }
}
