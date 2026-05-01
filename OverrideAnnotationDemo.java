/**
 * Демонстрация пользы аннотации @Override.
 *
 * @author lsszrn
 * @version 1.0
 */

class ParentClass {
    public void doSomething(String text) {
        System.out.println("Parent: " + text);
    }
    
    public void processData(int number) {
        System.out.println("Parent process: " + number);
    }
    
    public int calculate(int x, int y) {
        return x + y;
    }
}

class ChildClass extends ParentClass {
    
    // Правильное переопределение с @Override
    @Override
    public void doSomething(String text) {
        System.out.println("Child: " + text);
    }
    
    // ОШИБКА! @Override обнаружит, что такого метода нет в родителе
    // @Override
    // public void doSomething(Integer text) {  // ОШИБКА! другой тип параметра
    //     System.out.println("Child Integer: " + text);
    // }
    
    // @Override
    // public void doSomthing(String text) {  // ОШИБКА! опечатка в названии
    //     System.out.println("Опечатка");
    // }
    
    // @Override
    // public int calculate(int x) {  // ОШИБКА! другое количество параметров
    //     return x;
    // }
    
    // Без @Override - молча создается новый метод, а не переопределяется
    // Это перегрузка, а не переопределение!
    public void processData(Integer number) {
        System.out.println("НЕ переопределение! Это новый метод с Integer");
    }
}

public class OverrideAnnotationDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: @Override ДЛЯ ПОИСКА ОШИБОК ===\n");
        
        ChildClass child = new ChildClass();
        
        System.out.println("--- Правильное переопределение ---");
        child.doSomething("Hello");
        
        System.out.println("\n--- Без @Override можно случайно создать новый метод ---");
        ParentClass ref = new ChildClass();
        ref.processData(42);         // вызовет родительский метод
        child.processData(42);       // НЕ вызовет Child.processData(Integer)!
        child.processData(Integer.valueOf(42)); // вызовет новый метод
        
        System.out.println("\n--- Ситуации, когда @Override спасает ---");
        System.out.println("1. Опечатка в имени метода: doSomthing vs doSomething");
        System.out.println("2. Несовпадение типов параметров: String vs Integer");
        System.out.println("3. Разное количество параметров: calculate(int,int) vs calculate(int)");
        System.out.println("4. Несовместимый возвращаемый тип: int vs String");
        
        System.out.println("\n--- ВЫВОД ---");
        System.out.println("ВСЕГДА используйте @Override при переопределении методов!");
        System.out.println("Это помогает обнаружить ошибки на этапе компиляции.");
    }
}
