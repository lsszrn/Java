/**
 * Класс, реализующий интерфейс Printable.
 *
 * @author lsszrn
 * @version 1.0
 */
public class Document implements Printable {
    private String text;
    
    public Document(String text) {
        this.text = text;
    }
    
    @Override
    public void print() {
        System.out.println("Документ: " + text);
    }
    
    @Override
    public void printDefault() {
        System.out.println("Переопределенный default метод в Document: " + text);
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: DEFAULT И STATIC МЕТОДЫ ===\n");
        
        Document doc = new Document("Hello World");
        
        // Способ 1: Вызов реализованного абстрактного метода
        System.out.println("--- Вызов абстрактного метода ---");
        doc.print();
        
        // Способ 2: Вызов переопределенного default метода через объект
        System.out.println("\n--- Вызов default метода через объект ---");
        doc.printDefault();
        
        // Способ 3: Вызов default метода как у интерфейса (через ссылку Printable)
        System.out.println("\n--- Вызов default метода через ссылку интерфейса ---");
        Printable printable = doc;
        printable.printDefault();
        
        // Способ 4: Вызов статического метода через имя интерфейса
        System.out.println("\n--- Вызов static метода ---");
        Printable.printStatic();
        
        // НЕВОЗМОЖНО:
        // doc.printStatic();           // ОШИБКА! static метод не наследуется
        // Document.printStatic();      // ОШИБКА! только через имя интерфейса
        
        System.out.println("\n--- ИТОГО: Способы вызова ---");
        System.out.println("1. Абстрактный метод: объект.метод()");
        System.out.println("2. Default метод: объект.метод()");
        System.out.println("3. Default метод: ссылка_интерфейса.метод()");
        System.out.println("4. Static метод: ИмяИнтерфейса.метод()");
    }
}
