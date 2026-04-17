/**
 * Демонстрация инициализации элементов перечисления.
 *
 * @author lsszrn
 * @version 1.0
 */

// Перечисление с конструктором и полями
enum Season {
    WINTER("Зима", -10, "Холодно и снежно"),
    SPRING("Весна", 10, "Всё цветёт"),
    SUMMER("Лето", 25, "Жарко и солнечно"),
    AUTUMN("Осень", 8, "Листопад");
    
    private String russianName;
    private int avgTemperature;
    private String description;
    
    // Конструктор перечисления (всегда private)
    Season(String russianName, int avgTemperature, String description) {
        this.russianName = russianName;
        this.avgTemperature = avgTemperature;
        this.description = description;
    }
    
    public String getRussianName() { return russianName; }
    public int getAvgTemperature() { return avgTemperature; }
    public String getDescription() { return description; }
}

// Перечисление с разными способами инициализации
enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);
    
    private int red;
    private int green;
    private int blue;
    
    Color(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    
    public String getRgb() {
        return "RGB(" + red + ", " + green + ", " + blue + ")";
    }
    
    public String getHex() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}

// Перечисление с разной инициализацией для разных элементов
enum Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    MULTIPLY("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { 
            if (y == 0) throw new ArithmeticException("Деление на ноль");
            return x / y; 
        }
    };
    
    private String symbol;
    
    Operation(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() { return symbol; }
    public abstract double apply(double x, double y);
}

public class EnumInitDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ИНИЦИАЛИЗАЦИЯ ЭЛЕМЕНТОВ ENUM ===\n");
        
        System.out.println("--- Season с полями и конструктором ---");
        for (Season s : Season.values()) {
            System.out.println(s + ": " + s.getRussianName() + 
                             ", t=" + s.getAvgTemperature() + "°C, " + 
                             s.getDescription());
        }
        
        System.out.println("\n--- Color с RGB и HEX ---");
        for (Color c : Color.values()) {
            System.out.println(c + ": " + c.getRgb() + " -> " + c.getHex());
        }
        
        System.out.println("\n--- Operation с абстрактным методом ---");
        double a = 10, b = 5;
        for (Operation op : Operation.values()) {
            System.out.println(a + " " + op.getSymbol() + " " + b + " = " + op.apply(a, b));
        }
    }
}
