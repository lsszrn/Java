/**
 * Демонстрация текстовых блоков (тройные кавычки) в Java 15+.
 *
 * @author lsszrn
 * @version 1.0
 */
public class TextBlocksDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: ТРОЙНЫЕ КАВЫЧКИ (TEXT BLOCKS) ===\n");
        
        // Без тройных кавычек (старый способ)
        String oldJson = "{\n" +
                        "    \"name\": \"Иван\",\n" +
                        "    \"age\": 25,\n" +
                        "    \"city\": \"Москва\"\n" +
                        "}";
        System.out.println("Старый способ:");
        System.out.println(oldJson);
        
        // С тройными кавычками (новый способ, Java 15+)
        String newJson = """
                        {
                            "name": "Иван",
                            "age": 25,
                            "city": "Москва"
                        }
                        """;
        System.out.println("\nНовый способ (Text Block):");
        System.out.println(newJson);
        
        // Пример с SQL
        String sql = """
                    SELECT id, name, age
                    FROM users
                    WHERE age > 18
                    ORDER BY name
                    """;
        System.out.println("SQL запрос:");
        System.out.println(sql);
        
        // Пример с HTML
        String html = """
                    <html>
                        <body>
                            <h1>Привет!</h1>
                        </body>
                    </html>
                    """;
        System.out.println("HTML:");
        System.out.println(html);
        
        System.out.println("\n--- ЗАЧЕМ НУЖНЫ ---");
        System.out.println("1. Удобная запись многострочного текста");
        System.out.println("2. Не нужно экранировать кавычки внутри");
        System.out.println("3. Автоматически удаляются отступы");
        System.out.println("4. Код становится читаемее");
        System.out.println("5. Доступно с Java 15 (preview с Java 13)");
    }
}
