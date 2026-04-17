public class UnicodeName {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: Имя в Unicode ===");
        
        // Имя "Анна" в формате Unicode escape-последовательностей
        // А = \u0410, н = \u043D, н = \u043D, а = \u0430
        System.out.println("Моё имя: \u0410\u043D\u043D\u0430");
        
        // Для примера, другие способы написания
        System.out.println("\nДемонстрация Unicode:");
        System.out.println("А (кириллица): \\u0410 = " + '\u0410');
        System.out.println("A (латиница): \\u0041 = " + '\u0041');
        System.out.println("Привет: \\u041F\\u0440\\u0438\\u0432\\u0435\\u0442 = " 
                          + "\u041F\u0440\u0438\u0432\u0435\u0442");
        
        // Таблица для справки
        System.out.println("\n--- Коды некоторых русских букв ---");
        System.out.println("А: \\u0410, Б: \\u0411, В: \\u0412, Г: \\u0413");
        System.out.println("а: \\u0430, б: \\u0431, в: \\u0432, г: \\u0433");
        System.out.println("н: \\u043D, о: \\u043E, п: \\u043F, р: \\u0440");
    }
}
