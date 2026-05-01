/**
 * Демонстрация десяти методов классов StringBuilder и StringBuffer.
 *
 * @author lsszrn
 * @version 1.0
 */
public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: МЕТОДЫ StringBuilder И StringBuffer ===\n");
        
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append(\" World\"): " + sb);
        
        // 2. insert() - вставляет строку по индексу
        sb.insert(5, " Java");
        System.out.println("2. insert(5, \" Java\"): " + sb);
        
        // 3. delete() - удаляет символы по диапазону
        sb.delete(5, 10);
        System.out.println("3. delete(5, 10): " + sb);
        
        // 4. deleteCharAt() - удаляет один символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(5): " + sb);
        
        // 5. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("5. reverse(): " + sb);
        sb.reverse(); // возвращаем обратно
        
        // 6. replace() - заменяет подстроку в диапазоне
        sb.replace(0, 5, "Hi");
        System.out.println("6. replace(0, 5, \"Hi\"): " + sb);
        
        // 7. charAt() - возвращает символ по индексу
        char ch = sb.charAt(3);
        System.out.println("7. charAt(3): " + ch);
        
        // 8. length() - возвращает длину
        int len = sb.length();
        System.out.println("8. length(): " + len);
        
        // 9. setCharAt() - изменяет символ по индексу
        sb.setCharAt(3, '!');
        System.out.println("9. setCharAt(3, '!'): " + sb);
        
        // 10. substring() - извлекает подстроку
        String sub = sb.substring(0, 2);
        System.out.println("10. substring(0, 2): " + sub);
        
        // StringBuffer имеет те же методы
        System.out.println("\n--- StringBuffer (те же методы) ---");
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" is cool");
        sbf.insert(0, "Yes, ");
        System.out.println("StringBuffer: " + sbf);
    }
}
