/**
 * Демонстрация собственного перечисления с дополнительными методами.
 *
 * @author lsszrn
 * @version 1.0
 */

// Перечисление с дополнительными методами
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);
    
    private final double mass;   // в кг
    private final double radius; // в м
    private static final double G = 6.67300E-11;
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() { return mass; }
    public double getRadius() { return radius; }
    
    // Дополнительный метод: вычисление гравитации
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    
    // Дополнительный метод: вес объекта на планете
    public double surfaceWeight(double earthWeight) {
        return earthWeight * surfaceGravity() / EARTH.surfaceGravity();
    }
    
    // Статический метод для поиска планеты по названию
    public static Planet findByName(String name) {
        for (Planet p : values()) {
            if (p.name().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}

// Перечисление с методами для работы с днями недели
enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    // Метод: является ли день выходным
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
    
    // Метод: следующий день
    public DayOfWeek next() {
        int ordinal = this.ordinal();
        int nextOrdinal = (ordinal + 1) % values().length;
        return values()[nextOrdinal];
    }
    
    // Метод: предыдущий день
    public DayOfWeek previous() {
        int ordinal = this.ordinal();
        int prevOrdinal = (ordinal - 1 + values().length) % values().length;
        return values()[prevOrdinal];
    }
    
    // Метод: русское название
    public String getRussianName() {
        switch (this) {
            case MONDAY:    return "Понедельник";
            case TUESDAY:   return "Вторник";
            case WEDNESDAY: return "Среда";
            case THURSDAY:  return "Четверг";
            case FRIDAY:    return "Пятница";
            case SATURDAY:  return "Суббота";
            case SUNDAY:    return "Воскресенье";
            default:        return "";
        }
    }
}

// Перечисление с утилитарными методами
enum MathOperation {
    ADD {
        public double calculate(double a, double b) { return a + b; }
    },
    SUBTRACT {
        public double calculate(double a, double b) { return a - b; }
    },
    MULTIPLY {
        public double calculate(double a, double b) { return a * b; }
    },
    DIVIDE {
        public double calculate(double a, double b) { return a / b; }
    },
    POWER {
        public double calculate(double a, double b) { return Math.pow(a, b); }
    };
    
    public abstract double calculate(double a, double b);
    
    // Статический метод для выполнения операции по символу
    public static MathOperation fromSymbol(String symbol) {
        switch (symbol) {
            case "+": return ADD;
            case "-": return SUBTRACT;
            case "*": return MULTIPLY;
            case "/": return DIVIDE;
            case "^": return POWER;
            default: throw new IllegalArgumentException("Неизвестная операция: " + symbol);
        }
    }
}

public class CustomEnumDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: СОБСТВЕННОЕ ПЕРЕЧИСЛЕНИЕ С МЕТОДАМИ ===\n");
        
        System.out.println("--- Planet: вычисление веса ---");
        double earthWeight = 70.0;
        System.out.println("Вес человека на Земле: " + earthWeight + " кг");
        System.out.println("Вес на других планетах:");
        for (Planet p : Planet.values()) {
            System.out.printf("  %s: %.2f кг (гравитация: %.2f м/с²)%n", 
                             p, p.surfaceWeight(earthWeight), p.surfaceGravity());
        }
        
        System.out.println("\n--- Planet: поиск по имени ---");
        Planet mars = Planet.findByName("MARS");
        System.out.println("Найдена планета: " + mars + ", масса: " + mars.getMass() + " кг");
        
        System.out.println("\n--- DayOfWeek: работа с днями ---");
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Сегодня: " + today.getRussianName());
        System.out.println("Выходной? " + today.isWeekend());
        System.out.println("Завтра: " + today.next().getRussianName());
        System.out.println("Вчера: " + today.previous().getRussianName());
        
        System.out.println("\nВсе дни недели:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("  " + day.getRussianName() + 
                             (day.isWeekend() ? " (выходной)" : " (рабочий)"));
        }
        
        System.out.println("\n--- MathOperation: вычисления ---");
        double x = 10, y = 3;
        for (MathOperation op : MathOperation.values()) {
            System.out.println(x + " " + op + " " + y + " = " + op.calculate(x, y));
        }
        
        System.out.println("\n--- MathOperation: поиск по символу ---");
        MathOperation op = MathOperation.fromSymbol("^");
        System.out.println("Операция '^': 2 ^ 3 = " + op.calculate(2, 3));
    }
}
