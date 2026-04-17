/**
 * Демонстрация ограничения типов через extends и super в объявлении класса.
 *
 * @author lsszrn
 * @version 1.0
 */

// Ограничение сверху: T должен быть Number или его подклассом
class NumberWrapper<T extends Number> {
    private T number;
    
    public NumberWrapper(T number) {
        this.number = number;
    }
    
    public double getDoubleValue() {
        return number.doubleValue();
    }
    
    public T getNumber() {
        return number;
    }
}

// Ограничение: T должен реализовывать Comparable
class ComparableWrapper<T extends Comparable<T>> {
    private T item;
    
    public ComparableWrapper(T item) {
        this.item = item;
    }
    
    public boolean isGreaterThan(T other) {
        return item.compareTo(other) > 0;
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {
        System.out.println("=== ОГРАНИЧЕНИЕ ТИПОВ В GENERIC-КЛАССАХ ===\n");
        
        // extends Number - можно использовать только Number и подклассы
        NumberWrapper<Integer> intWrap = new NumberWrapper<>(42);
        NumberWrapper<Double> doubleWrap = new NumberWrapper<>(3.14);
        // NumberWrapper<String> strWrap; // ОШИБКА! String не extends Number
        
        System.out.println("--- NumberWrapper<T extends Number> ---");
        System.out.println("Integer: " + intWrap.getDoubleValue());
        System.out.println("Double: " + doubleWrap.getDoubleValue());
        System.out.println("Можно использовать методы Number (doubleValue, intValue и т.д.)");
        
        // extends Comparable - можно сравнивать
        System.out.println("\n--- ComparableWrapper<T extends Comparable<T>> ---");
        ComparableWrapper<Integer> compWrap = new ComparableWrapper<>(10);
        System.out.println("10 > 5? " + compWrap.isGreaterThan(5));
        System.out.println("10 > 15? " + compWrap.isGreaterThan(15));
        System.out.println("Можно использовать метод compareTo()");
    }
}
