public class ArithmeticTypes {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #5: Арифметика с разными типами ===");
        byte b1 = 10;
        byte b2 = 20;
        int sumByte = b1 + b2;
        System.out.println("byte + byte = int: " + b1 + " + " + b2 + " = " + sumByte);
        int i = 100;
        long l = 200L;
        long sumLong = i + l;
        System.out.println("int + long = long: " + i + " + " + l + " = " + sumLong);
        int i2 = 5;
        float f = 2.5f;
        float sumFloat = i2 + f;
        System.out.println("int + float = float: " + i2 + " + " + f + " = " + sumFloat);
        float f2 = 3.14f;
        double d = 2.718;
        double sumDouble = f2 + d;
        System.out.println("float + double = double: " + f2 + " + " + d + " = " + sumDouble);
        char c = 'A';  // код 65
        int i3 = 1;
        int charPlusInt = c + i3;
        System.out.println("char + int = int: 'A' + 1 = " + charPlusInt + " (это код 'B')");
        System.out.println("Символ с кодом 66: " + (char)charPlusInt);
        System.out.println("\n--- Цепочка расширения типов ---");
        byte b = 10;
        short s = b;        
        int i4 = s;       
        long l2 = i4;     
        float f3 = l2;     
        double d2 = f3;    
        System.out.println("byte " + b + " -> short -> int -> long -> float -> double " + d2);
        System.out.println("\n--- Деление целых чисел ---");
        int x = 5;
        int y = 2;
        System.out.println("5 / 2 = " + (x / y) + " (целочисленное деление, дробная часть отбрасывается)");
        System.out.println("5.0 / 2 = " + (5.0 / 2) + " (один операнд double, результат double)");
        System.out.println("5 / 2.0 = " + (5 / 2.0) + " (то же самое)");
    }
}
