/**
 * Демонстрация преобразования между String, StringBuilder и StringBuffer.
 *
 * @author lsszrn
 * @version 1.0
 */
public class StringConversionDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: ПРЕОБРАЗОВАНИЕ МЕЖДУ ТИПАМИ ===\n");
        
        // 1. String -> StringBuilder (через конструктор)
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: new StringBuilder(str)");
        System.out.println("  " + str + " -> " + sb);
        
        // 2. String -> StringBuffer (через конструктор)
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("\nString -> StringBuffer: new StringBuffer(str)");
        System.out.println("  " + str + " -> " + sbf);
        
        // 3. StringBuilder -> String (через toString())
        StringBuilder sb2 = new StringBuilder("World");
        String str2 = sb2.toString();
        System.out.println("\nStringBuilder -> String: sb.toString()");
        System.out.println("  " + sb2 + " -> " + str2);
        
        // 4. StringBuffer -> String (через toString())
        StringBuffer sbf2 = new StringBuffer("Java");
        String str3 = sbf2.toString();
        System.out.println("\nStringBuffer -> String: sbf.toString()");
        System.out.println("  " + sbf2 + " -> " + str3);
        
        // 5. StringBuilder -> StringBuffer (через String)
        StringBuilder sb3 = new StringBuilder("Convert");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        System.out.println("\nStringBuilder -> StringBuffer: new StringBuffer(sb.toString())");
        System.out.println("  " + sb3 + " -> " + sbf3);
        
        // 6. StringBuffer -> StringBuilder (через String)
        StringBuffer sbf4 = new StringBuffer("Change");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        System.out.println("\nStringBuffer -> StringBuilder: new StringBuilder(sbf.toString())");
        System.out.println("  " + sbf4 + " -> " + sb4);
        
        // 7. String -> StringBuilder (через append)
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Append");
        System.out.println("\nString -> StringBuilder: new StringBuilder().append(str)");
        System.out.println("  -> " + sb5);
        
        System.out.println("\n--- СВОДКА ---");
        System.out.println("String -> StringBuilder: new StringBuilder(str)");
        System.out.println("String -> StringBuffer:  new StringBuffer(str)");
        System.out.println("StringBuilder -> String: sb.toString()");
        System.out.println("StringBuffer -> String:  sbf.toString()");
        System.out.println("StringBuilder -> StringBuffer: new StringBuffer(sb.toString())");
        System.out.println("StringBuffer -> StringBuilder: new StringBuilder(sbf.toString())");
    }
}
