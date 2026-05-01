/**
 * Демонстрация переопределенных методов и ковариантного возвращаемого типа.
 *
 * @author lsszrn
 * @version 1.0
 */

class Animal {
    public Animal makeCopy() {
        System.out.println("Animal.makeCopy()");
        return new Animal();
    }
    
    public Number getValue() {
        return 42;
    }
}

class Dog extends Animal {
    
    // Переопределение с тем же типом возвращаемого значения
    @Override
    public Dog makeCopy() {
        System.out.println("Dog.makeCopy()");
        return new Dog();
    }
    
    // Переопределение с подтипом (ковариантный возвращаемый тип)
    @Override
    public Integer getValue() {
        return 100;
    }
}

// class Cat extends Animal {
//     // ОШИБКА! Несовместимый тип возвращаемого значения
//     @Override
//     public String makeCopy() {
//         return "Cat";
//     }
// }

public class OverridingExample {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: ПЕРЕОПРЕДЕЛЕННЫЕ МЕТОДЫ ===\n");
        
        Dog dog = new Dog();
        
        System.out.println("--- Переопределение makeCopy() ---");
        dog.makeCopy();
        
        System.out.println("\n--- Переопределение getValue() ---");
        System.out.println("getValue() = " + dog.getValue());
        
        System.out.println("\n--- Правила возвращаемого типа ---");
        System.out.println("1. Тип должен совпадать (Animal -> Animal)");
        System.out.println("2. Или быть подтипом - ковариантный возвращаемый тип");
        System.out.println("   (Number -> Integer, Animal -> Dog)");
        System.out.println("3. Если типы несовместимы - ОШИБКА КОМПИЛЯЦИИ");
        System.out.println("   (Animal -> String нельзя)");
    }
}
