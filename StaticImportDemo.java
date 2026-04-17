/**
 * Демонстрация вызова статического метода через static import.
 *
 * @author lsszrn
 * @version 1.0
 */

import static A.printVars;
import static A.a;
import static A.b;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("=== ВЫЗОВ ЧЕРЕЗ STATIC IMPORT ===\n");
        
        System.out.println("Импортированы: printVars, a, b");
        System.out.println("Прямой доступ к полям:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("\nПрямой вызов метода:");
        printVars();
        
        System.out.println("\nИзменение статического поля:");
        a = 100;
        b = 200;
        printVars();
    }
}
