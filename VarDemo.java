import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #8: Type Inference (var) ===");
        System.out.println("var доступен с Java 10+\n");
        var number = 42;                    
        var pi = 3.14159;               
        var flag = true;                 
        var letter = 'A';                 
        var text = "Hello";                 
        System.out.println("var number = 42;          
        System.out.println("var pi = 3.14159;         
        System.out.println("var flag = true;       
        System.out.println("var letter = 'A';        
        System.out.println("var text = \"Hello\";    
        var list = new ArrayList<String>(); 
        list.add("Один");
        list.add("Два");
        System.out.println("\nvar list = new ArrayList<String>();");
        System.out.println("list: " + list);
        System.out.println("Тип: ArrayList<String>")
        System.out.println("\n--- var в цикле ---");
        var numbers = new int[]{1, 2, 3, 4, 5};
        for (var n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        var map = new HashMap<String, Integer>();
        map.put("Иван", 25);
        map.put("Мария", 30);
        System.out.println("\nvar map = new HashMap<String, Integer>();");
        System.out.println("map: " + map);
        System.out.println("\n--- Сравнение с var и без ---");
        Map<String, List<String>> complexMap = new HashMap<String, List<String>>();
        var simpleMap = new HashMap<String, List<String>>();
        System.out.println("Без var: Map<String, List<String>> map = new HashMap<String, List<String>>();");
        System.out.println("С var:   var map = new HashMap<String, List<String>>();");
        System.out.println("\n--- Демонстрация вывода типа ---");
        var str = "Java";      
        var num = 100;           
        System.out.println("var str = \"Java\";  // String");
        System.out.println("var num = 100;      // int");
        System.out.println("str + num = " + (str + num) + "  // String");
    }
}
