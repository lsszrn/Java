public class NarrowingCast {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #6: Сужающее преобразование ===");
        int i = 130;
        byte b = (byte) i;
        System.out.println("int 130 -> byte: " + b);
        System.out.println("Объяснение: byte от -128 до 127.");
        System.out.println("130 выходит за пределы, происходит переполнение.");
        System.out.println("130 - 256 = " + (130 - 256));
        double d = 3.99;
        int i2 = (int) d;
        System.out.println("\ndouble 3.99 -> int: " + i2);
        System.out.println("Дробная часть отбрасывается, НЕ округляется!");
        long l = 3_000_000_000L;
        int i3 = (int) l;
        System.out.println("\nlong 3_000_000_000 -> int: " + i3);
        System.out.println("Произошло переполнение!");
        float f = 123.456f;
        long l2 = (long) f;
        System.out.println("\nfloat 123.456 -> long: " + l2);
        System.out.println("Дробная часть отброшена");
        double precise = 1.123456789012345;
        float lessPrecise = (float) precise;
        System.out.println("\ndouble -> float (потеря точности):");
        System.out.println("double: " + precise);
        System.out.println("float:  " + lessPrecise);
        char c = 'A';  // код 65
        byte b2 = (byte) c;
        System.out.println("\nchar 'A' (65) -> byte: " + b2);
        char c2 = 500;  // больше 255
        byte b3 = (byte) c2;
        System.out.println("char 500 -> byte: " + b3 + " (переполнение)");
        System.out.println("\n--- Безопасное сужение с проверкой ---");
        int bigNumber = 1000;
        if (bigNumber >= Byte.MIN_VALUE && bigNumber <= Byte.MAX_VALUE) {
            byte safe = (byte) bigNumber;
            System.out.println("Безопасно: " + safe);
        } else {
            System.out.println("Нельзя преобразовать " + bigNumber + " в byte без потерь!");
        }
    }
}
