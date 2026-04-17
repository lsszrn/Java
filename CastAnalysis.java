public class CastAnalysis {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #7: Анализ кода ===");
        int a = 120;
        byte c = (byte)(a + 10);  
        System.out.println("int a = 120;");
        System.out.println("// byte b = a + 10;   
        System.out.println("byte c = (byte)(a + 10); // " + ((byte)(a + 10)));
        System.out.println("// byte d = a + 1;     
        System.out.println("\n--- Объяснение ---");
        System.out.println("1. Любые арифметические операции с byte/short/int дают int");
        System.out.println("2. int нельзя присвоить byte без явного приведения");
        System.out.println("3. (byte)(a + 10) = (byte)130 = -126 (переполнение)");
        System.out.println("4. Правильно: int sum = a + 10; или byte b = (byte)(a + 10);");
    }
}
