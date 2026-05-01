/**
 * Демонстрация использования AutoCloseable и try-with-resources.
 *
 * @author lsszrn
 * @version 1.0
 */

// Класс, реализующий AutoCloseable
class MyResource implements AutoCloseable {
    private String name;
    
    public MyResource(String name) {
        this.name = name;
        System.out.println("Ресурс '" + name + "' открыт");
    }
    
    public void doWork() {
        System.out.println("Работа с ресурсом '" + name + "'");
    }
    
    @Override
    public void close() {
        System.out.println("Ресурс '" + name + "' закрыт автоматически");
    }
}

public class AutoCloseableDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #4: AutoCloseable ===\n");
        
        // Автоматическое закрытие ресурса
        System.out.println("--- try-with-resources ---");
        try (MyResource resource = new MyResource("MyRes")) {
            resource.doWork();
        }
        // resource.close() вызван автоматически
        
        // Без AutoCloseable пришлось бы писать так:
        System.out.println("\n--- Без AutoCloseable (ручное закрытие) ---");
        MyResource resource2 = new MyResource("ManualRes");
        try {
            resource2.doWork();
        } finally {
            resource2.close();  // нужно явно закрыть
        }
    }
}
