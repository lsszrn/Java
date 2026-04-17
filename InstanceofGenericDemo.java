/**
 * Демонстрация использования instanceof с параметризованными классами.
 *
 * @author lsszrn
 * @version 1.0
 */

class Wrapper<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}

public class InstanceofGenericDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: INSTANCEOF С GENERIC-КЛАССАМИ ===\n");
        
        Wrapper<Integer> intWrapper = new Wrapper<>();
        intWrapper.setItem(42);
        
        Wrapper<String> strWrapper = new Wrapper<>();
        strWrapper.setItem("Hello");
        
        Wrapper<Double> doubleWrapper = new Wrapper<>();
        doubleWrapper.setItem(3.14);
        
        // 1. instanceof с сырым типом (raw type)
        System.out.println("--- instanceof с сырым типом ---");
        System.out.println("intWrapper instanceof Wrapper: " + (intWrapper instanceof Wrapper));
        System.out.println("strWrapper instanceof Wrapper: " + (strWrapper instanceof Wrapper));
        
        // 2. instanceof с параметризованным типом
        System.out.println("\n--- instanceof с параметризованным типом ---");
        // ОШИБКА КОМПИЛЯЦИИ:
        // System.out.println(intWrapper instanceof Wrapper<Integer>);
        System.out.println("intWrapper instanceof Wrapper<Integer> - ОШИБКА КОМПИЛЯЦИИ!");
        System.out.println("Из-за стирания типов (type erasure) информация о generic-типе");
        System.out.println("недоступна во время выполнения.");
        
        // 3. Проверка содержимого через getItem()
        System.out.println("\n--- Проверка типа содержимого ---");
        Object obj = intWrapper.getItem();
        System.out.println("intWrapper.getItem() instanceof Integer: " + (obj instanceof Integer));
        obj = strWrapper.getItem();
        System.out.println("strWrapper.getItem() instanceof String: " + (obj instanceof String));
        
        // 4. Практический пример
        System.out.println("\n--- Практический пример ---");
        Wrapper[] wrappers = {intWrapper, strWrapper, doubleWrapper};
        
        for (Wrapper w : wrappers) {
            if (w.getItem() instanceof Integer) {
                Integer value = (Integer) w.getItem();
                System.out.println("Найден Integer: " + value);
            } else if (w.getItem() instanceof String) {
                String value = (String) w.getItem();
                System.out.println("Найдена String: " + value);
            } else if (w.getItem() instanceof Double) {
                Double value = (Double) w.getItem();
                System.out.println("Найден Double: " + value);
            }
        }
        
        System.out.println("\n--- ВЫВОД ---");
        System.out.println("Из-за стирания типов (type erasure) нельзя использовать");
        System.out.println("instanceof с параметризованным типом, например Wrapper<Integer>.");
        System.out.println("Можно проверять только сырой тип (Wrapper) или содержимое.");
    }
}
