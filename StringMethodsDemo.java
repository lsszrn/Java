/**
 * Демонстрация десяти методов класса String.
 *
 * @author lsszrn
 * @version 1.0
 */
public class StringMethodsDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: МЕТОДЫ КЛАССА String ===\n");
        
        String str = "  Hello Java World!  ";
        String str2 = "hello java world!";
        
        // 1. length() - возвращает длину строки
        int length = str.length();
        System.out.println("1. length(): длина строки \"" + str + "\" = " + length);
        
        // 2. trim() - удаляет пробелы в начале и конце
        String trimmed = str.trim();
        System.out.println("2. trim(): \"" + str + "\" -> \"" + trimmed + "\"");
        
        // 3. toUpperCase() - преобразует в верхний регистр
        String upper = str.toUpperCase();
        System.out.println("3. toUpperCase(): \"" + str + "\" -> \"" + upper + "\"");
        
        // 4. toLowerCase() - преобразует в нижний регистр
        String lower = str.toLowerCase();
        System.out.println("4. toLowerCase(): \"" + str + "\" -> \"" + lower + "\"");
        
        // 5. substring() - извлекает подстроку
        String sub = str.substring(2, 7);
        System.out.println("5. substring(2,7): \"" + str + "\" -> \"" + sub + "\"");
        
        // 6. replace() - заменяет символы
        String replaced = str.replace('l', 'L');
        System.out.println("6. replace('l','L'): \"" + str + "\" -> \"" + replaced + "\"");
        
        // 7. contains() - проверяет, содержит ли строку
        boolean hasJava = str.contains("Java");
        System.out.println("7. contains(\"Java\"): " + hasJava);
        
        // 8. equalsIgnoreCase() - сравнивает без учета регистра
        boolean equal = str.trim().equalsIgnoreCase(str2);
        System.out.println("8. equalsIgnoreCase(): \"" + trimmed + "\" == \"" + str2 + "\" -> " + equal);
        
        // 9. indexOf() - находит индекс первого вхождения
        int index = str.indexOf("Java");
        System.out.println("9. indexOf(\"Java\"): " + index);
        
        // 10. split() - разделяет строку на массив
        String[] words = str.trim().split(" ");
        System.out.print("10. split(\" \"): ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
    }
}
