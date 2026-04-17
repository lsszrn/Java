/**
 * Демонстрация оператора instanceof.
 * Проверяет, является ли объект экземпляром указанного типа или его подкласса.
 *
 * @author lsszrn
 * @version 1.0
 */
public class InstanceofDemo {
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: ОПЕРАТОР instanceof ===\n");
        
        // 1. Базовое использование
        System.out.println("--- 1. Базовое использование ---");
        String str = "Hello";
        Object obj = str;
        
        System.out.println("String str = \"Hello\";");
        System.out.println("Object obj = str;");
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("str instanceof Object: " + (str instanceof Object));
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
        
        // 2. С иерархией классов
        System.out.println("\n--- 2. С иерархией классов ---");
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animalDog = new Dog();  // полиморфизм
        
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));  // true!
        System.out.println("animalDog instanceof Dog: " + (animalDog instanceof Dog));
        System.out.println("animalDog instanceof Animal: " + (animalDog instanceof Animal));
        System.out.println("cat instanceof Dog: " + (cat instanceof Dog));  // false
        
        // 3. С интерфейсами
        System.out.println("\n--- 3. С интерфейсами ---");
        Dog dog2 = new Dog();
        System.out.println("dog instanceof CanBark: " + (dog2 instanceof CanBark));
        System.out.println("cat instanceof CanBark: " + (cat instanceof CanBark));
        
        // 4. null и instanceof (ВАЖНО!)
        System.out.println("\n--- 4. null и instanceof ---");
        String nullStr = null;
        
        System.out.println("String nullStr = null;");
        System.out.println("nullStr instanceof String: " + (nullStr instanceof String));
        System.out.println("null instanceof Object: " + (null instanceof Object));
        System.out.println("null instanceof String: " + (null instanceof String));
        System.out.println("\n! ВАЖНО: null instanceof ЛЮБОЙ_ТИП всегда возвращает false !");
        
        // 5. Практическое применение
        System.out.println("\n--- 5. Практическое применение ---");
        Object[] objects = {
            new String("Текст"),
            new Integer(42),
            new Dog(),
            new Cat(),
            null
        };
        
        for (Object o : objects) {
            if (o instanceof String) {
                System.out.println("Найдена строка: " + o);
            } else if (o instanceof Integer) {
                System.out.println("Найдено число: " + o);
            } else if (o instanceof Dog) {
                System.out.println("Найдена собака!");
                ((Dog) o).bark();  // безопасное приведение
            } else if (o instanceof Cat) {
                System.out.println("Найден кот!");
            } else if (o == null) {
                System.out.println("Найден null");
            }
        }
        
        // 6. Pattern Matching (Java 16+)
        System.out.println("\n--- 6. Pattern Matching (Java 16+) ---");
        Object obj2 = "Hello, Pattern!";
        
        // Старый способ
        if (obj2 instanceof String) {
            String s = (String) obj2;
            System.out.println("Старый способ: длина = " + s.length());
        }
        
        // Новый способ с pattern matching
        if (obj2 instanceof String s) {
            System.out.println("Новый способ: длина = " + s.length());
            System.out.println("Можно сразу использовать s: " + s.toUpperCase());
        }
    }
}

// Вспомогательные классы для демонстрации instanceof

/** Базовый класс Животное */
class Animal {
    protected String name = "Животное";
}

/** Интерфейс "умеет лаять" */
interface CanBark {
    void bark();
}

/** Класс Собака - наследник Animal, реализует CanBark */
class Dog extends Animal implements CanBark {
    Dog() {
        name = "Собака";
    }
    
    @Override
    public void bark() {
        System.out.println("Гав-гав!");
    }
}

/** Класс Кот - наследник Animal */
class Cat extends Animal {
    Cat() {
        name = "Кот";
    }
    
    public void meow() {
        System.out.println("Мяу!");
    }
}
