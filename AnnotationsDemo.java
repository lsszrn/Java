/**
 * Демонстрация использования аннотаций @Override, @Deprecated, @SuppressWarnings.
 *
 * @author lsszrn
 * @version 1.0
 */

class Parent {
    public void doWork() {
        System.out.println("Работа родителя");
    }
    
    @Deprecated
    public void oldMethod() {
        System.out.println("Устаревший метод");
    }
    
    public void newMethod() {
        System.out.println("Новый метод");
    }
}

class Child extends Parent {
    
    // @Override - указывает, что метод переопределяет метод суперкласса
    @Override
    public void doWork() {
        System.out.println("Работа потомка");
    }
}

public class AnnotationsDemo {
    
    // @SuppressWarnings - подавляет предупреждения компилятора
    @SuppressWarnings("deprecation")
    public static void useDeprecated() {
        Parent p = new Parent();
        p.oldMethod();  // без @SuppressWarnings будет предупреждение
    }
    
    @SuppressWarnings("unused")
    public static void unusedVariable() {
        int unused = 42;  // без @SuppressWarnings будет предупреждение
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: АННОТАЦИИ ===\n");
        
        System.out.println("--- @Override ---");
        Child child = new Child();
        child.doWork();
        System.out.println("Гарантирует, что метод действительно переопределен.");
        System.out.println("Если допущена опечатка или несовпадение параметров,");
        System.out.println("компилятор выдаст ошибку.");
        
        System.out.println("\n--- @Deprecated ---");
        useDeprecated();
        System.out.println("Помечает метод/класс как устаревший.");
        System.out.println("Компилятор выдает предупреждение при использовании.");
        System.out.println("В документации javadoc помечается специальным тегом.");
        
        System.out.println("\n--- @SuppressWarnings ---");
        unusedVariable();
        System.out.println("Подавляет указанные предупреждения компилятора.");
        System.out.println("Параметры: \"deprecation\", \"unused\", \"unchecked\",");
        System.out.println("\"rawtypes\", \"serial\", \"all\" и другие.");
        
        System.out.println("\n--- ЗАЧЕМ НУЖНЫ ---");
        System.out.println("@Override:");
        System.out.println("  - Помогает избежать ошибок при переопределении");
        System.out.println("  - Делает код более читаемым");
        System.out.println("@Deprecated:");
        System.out.println("  - Предупреждает других разработчиков");
        System.out.println("  - Указывает на наличие более новой альтернативы");
        System.out.println("@SuppressWarnings:");
        System.out.println("  - Убирает ненужные предупреждения");
        System.out.println("  - Делает вывод компилятора чище");
    }
}
