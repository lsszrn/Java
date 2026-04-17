public class DataTypesDemo {
    
    // Переменные базовых типов как члены класса
    // Они автоматически инициализируются нулевыми значениями
    byte classByte;
    short classShort;
    int classInt;
    long classLong;
    float classFloat;
    double classDouble;
    char classChar;
    boolean classBoolean;
    
    // Классы-оболочки (объекты) по умолчанию = null
    Byte wrapperByte;
    Short wrapperShort;
    Integer wrapperInt;
    Long wrapperLong;
    Float wrapperFloat;
    Double wrapperDouble;
    Character wrapperChar;
    Boolean wrapperBoolean;
    
    public static void main(String[] args) {
        DataTypesDemo demo = new DataTypesDemo();
        
        System.out.println("=== ПРАКТИКА #1: Все типы данных ===");
        
        // 1. Целочисленные типы
        System.out.println("\n--- Целочисленные типы ---");
        byte b = 127;                    // 8 бит, от -128 до 127
        short s = 32767;                 // 16 бит, от -32768 до 32767
        int i = 2147483647;              // 32 бита
        long l = 9223372036854775807L;   // 64 бита, нужен суффикс L
        
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        
        // 2. Типы с плавающей точкой
        System.out.println("\n--- Типы с плавающей точкой ---");
        float f = 3.1415926535f;          // 32 бита, суффикс f
        double d = 3.14159265358979323846; // 64 бита
        
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        
        // 3. Символьный тип
        System.out.println("\n--- Символьный тип ---");
        char c = 'A';                     // 16 бит, Unicode
        char c2 = 65;                     // Можно и через код
        char c3 = '\u0041';               // Unicode формат
        
        System.out.println("char 'A': " + c);
        System.out.println("char 65: " + c2);
        System.out.println("char \\u0041: " + c3);
        
        // 4. Булевский тип
        System.out.println("\n--- Булевский тип ---");
        boolean boolTrue = true;
        boolean boolFalse = false;
        
        System.out.println("boolean true: " + boolTrue);
        System.out.println("boolean false: " + boolFalse);
        
        // 5. Нулевые значения членов класса
        System.out.println("\n--- Нулевые значения членов класса ---");
        System.out.println("byte (по умолчанию): " + demo.classByte);      // 0
        System.out.println("short (по умолчанию): " + demo.classShort);    // 0
        System.out.println("int (по умолчанию): " + demo.classInt);        // 0
        System.out.println("long (по умолчанию): " + demo.classLong);      // 0
        System.out.println("float (по умолчанию): " + demo.classFloat);    // 0.0
        System.out.println("double (по умолчанию): " + demo.classDouble);  // 0.0
        System.out.println("char (по умолчанию): [" + demo.classChar + "]"); // '\u0000'
        System.out.println("char (код): " + (int)demo.classChar);          // 0
        System.out.println("boolean (по умолчанию): " + demo.classBoolean); // false
        
        // 6. Классы-оболочки (объекты)
        System.out.println("\n--- Классы-оболочки (по умолчанию null) ---");
        System.out.println("Byte wrapper: " + demo.wrapperByte);           // null
        System.out.println("Integer wrapper: " + demo.wrapperInt);         // null
        System.out.println("Double wrapper: " + demo.wrapperDouble);       // null
        System.out.println("Boolean wrapper: " + demo.wrapperBoolean);     // null
        
        // 7. Локальная переменная должна быть инициализирована
        System.out.println("\n--- Локальная переменная ---");
        int localVar;           // объявлена, но не инициализирована
        // System.out.println(localVar); // ОШИБКА КОМПИЛЯЦИИ!
        localVar = 42;          // теперь можно использовать
        System.out.println("localVar после инициализации: " + localVar);
        
        // 8. Автоупаковка и распаковка (между примитивами и обертками)
        System.out.println("\n--- Автоупаковка/распаковка ---");
        Integer wrapped = 100;       // автоупаковка: int -> Integer
        int unwrapped = wrapped;     // распаковка: Integer -> int
        System.out.println("wrapped Integer: " + wrapped);
        System.out.println("unwrapped int: " + unwrapped);
    }
}
