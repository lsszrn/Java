/**
 * Демонстрация доступа внутреннего класса к полям и методам внешнего.
 *
 * @author lsszrn
 * @version 1.0
 */
public class InnerAccessOuterDemo {
    
    private int privateField = 1;
    int defaultField = 2;
    protected int protectedField = 3;
    public int publicField = 4;
    
    private void privateMethod() {
        System.out.println("private метод внешнего класса");
    }
    
    void defaultMethod() {
        System.out.println("default метод внешнего класса");
    }
    
    protected void protectedMethod() {
        System.out.println("protected метод внешнего класса");
    }
    
    public void publicMethod() {
        System.out.println("public метод внешнего класса");
    }
    
    public class InnerClass {
        
        public void accessOuterMembers() {
            System.out.println("--- Внутренний класс имеет доступ КО ВСЕМ полям внешнего ---");
            System.out.println("privateField = " + privateField);
            System.out.println("defaultField = " + defaultField);
            System.out.println("protectedField = " + protectedField);
            System.out.println("publicField = " + publicField);
            
            System.out.println("\n--- И ко ВСЕМ методам внешнего класса ---");
            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
            
            System.out.println("\n--- Изменение полей внешнего класса ---");
            privateField = 100;
            System.out.println("privateField изменен на " + privateField);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: ДОСТУП ВНУТРЕННЕГО КЛАССА К ВНЕШНЕМУ ===\n");
        
        InnerAccessOuterDemo outer = new InnerAccessOuterDemo();
        InnerClass inner = outer.new InnerClass();
        inner.accessOuterMembers();
        
        System.out.println("\n--- ВЫВОД ---");
        System.out.println("Внутренний класс имеет доступ ко ВСЕМ полям и методам");
        System.out.println("внешнего класса независимо от спецификаторов доступа!");
    }
}
