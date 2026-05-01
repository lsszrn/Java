/**
 * Демонстрация доступа внешнего класса к полям и методам внутреннего.
 *
 * @author lsszrn
 * @version 1.0
 */
public class OuterAccessInnerDemo {
    
    private InnerClass inner;
    
    public OuterAccessInnerDemo() {
        inner = new InnerClass();
    }
    
    public void accessInnerMembers() {
        System.out.println("--- Внешний класс имеет доступ КО ВСЕМ полям внутреннего ---");
        System.out.println("privateField = " + inner.privateField);
        System.out.println("defaultField = " + inner.defaultField);
        System.out.println("protectedField = " + inner.protectedField);
        System.out.println("publicField = " + inner.publicField);
        
        System.out.println("\n--- И ко ВСЕМ методам внутреннего ---");
        inner.privateMethod();
        inner.defaultMethod();
        inner.protectedMethod();
        inner.publicMethod();
        
        System.out.println("\n--- Изменение private поля внутреннего класса ---");
        inner.privateField = 999;
        System.out.println("privateField изменен на " + inner.privateField);
    }
    
    public class InnerClass {
        private int privateField = 10;
        int defaultField = 20;
        protected int protectedField = 30;
        public int publicField = 40;
        
        private void privateMethod() {
            System.out.println("private метод внутреннего класса");
        }
        
        void defaultMethod() {
            System.out.println("default метод внутреннего класса");
        }
        
        protected void protectedMethod() {
            System.out.println("protected метод внутреннего класса");
        }
        
        public void publicMethod() {
            System.out.println("public метод внутреннего класса");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: ДОСТУП ВНЕШНЕГО КЛАССА К ВНУТРЕННЕМУ ===\n");
        
        OuterAccessInnerDemo outer = new OuterAccessInnerDemo();
        outer.accessInnerMembers();
        
        System.out.println("\n--- ВЫВОД ---");
        System.out.println("Внешний класс имеет доступ ко ВСЕМ полям и методам");
        System.out.println("внутреннего класса независимо от спецификаторов доступа!");
        System.out.println("\nНо из другого класса доступ будет ограничен спецификаторами.");
    }
}
