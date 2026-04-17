/**
 * Демонстрация использования wildcards: <? extends T> и <? super T>.
 *
 * @author lsszrn
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public String getName() { return name; }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
}

class Puppy extends Dog {
    public Puppy(String name) { super(name); }
}

public class WildcardDemo {
    
    // <? extends T> - можно ЧИТАТЬ, нельзя ДОБАВЛЯТЬ
    public static void printAnimals(List<? extends Animal> animals) {
        System.out.println("--- <? extends Animal> ---");
        for (Animal a : animals) {
            System.out.println(a.getName());
        }
        // animals.add(new Dog("Шарик")); // ОШИБКА! Нельзя добавлять
        // animals.add(new Animal("Зверь")); // ОШИБКА!
        System.out.println("Можно только ЧИТАТЬ элементы.");
    }
    
    // <? super T> - можно ДОБАВЛЯТЬ, читать только как Object
    public static void addDogs(List<? super Dog> dogs) {
        System.out.println("--- <? super Dog> ---");
        dogs.add(new Dog("Шарик"));
        dogs.add(new Dog("Бобик"));
        dogs.add(new Puppy("Щенок")); // можно добавлять подклассы
        // dogs.add(new Animal("Зверь")); // ОШИБКА! Animal не Dog
        // dogs.add(new Cat("Мурка")); // ОШИБКА! Cat не Dog
        
        System.out.println("Добавлены собаки в список.");
        System.out.println("Читать можно только как Object:");
        for (Object obj : dogs) {
            System.out.println("  " + obj);
        }
        System.out.println("Можно ДОБАВЛЯТЬ элементы типа Dog и его подклассы.");
    }
    
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #2: WILDCARDS ===\n");
        
        // <? extends T> - верхняя граница (Upper Bounded)
        System.out.println("--- <? extends T> - ВЕРХНЯЯ ГРАНИЦА ---");
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Рекс"));
        dogs.add(new Dog("Мухтар"));
        
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Мурка"));
        cats.add(new Cat("Барсик"));
        
        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy("Тузик"));
        puppies.add(new Puppy("Дружок"));
        
        System.out.println("Список собак:");
        printAnimals(dogs);
        
        System.out.println("\nСписок кошек:");
        printAnimals(cats);
        
        System.out.println("\nСписок щенков:");
        printAnimals(puppies);
        
        // <? super T> - нижняя граница (Lower Bounded)
        System.out.println("\n--- <? super T> - НИЖНЯЯ ГРАНИЦА ---");
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Зверь"));
        System.out.println("До добавления собак в List<Animal>:");
        printAnimals(animals);
        
        addDogs(animals);
        System.out.println("\nПосле добавления собак в List<Animal>:");
        printAnimals(animals);
        
        List<Dog> dogs2 = new ArrayList<>();
        dogs2.add(new Dog("Старый пёс"));
        addDogs(dogs2);
        System.out.println("\nПосле добавления в List<Dog>:");
        printAnimals(dogs2);
        
        List<Object> objects = new ArrayList<>();
        objects.add("строка");
        addDogs(objects);
        System.out.println("\nВ List<Object> можно добавить собак:");
        System.out.println(objects);
        
        // List<Puppy> puppies2 = new ArrayList<>();
        // addDogs(puppies2); // ОШИБКА! Puppy не super Dog
        
        System.out.println("\n--- ЗАЧЕМ НУЖНЫ WILDCARDS ---");
        System.out.println("1. <? extends T> - когда нужно только ЧИТАТЬ данные.");
        System.out.println("   Пример: метод printAnimals(List<? extends Animal>)");
        System.out.println("   может принимать List<Dog>, List<Cat>, List<Puppy>.");
        System.out.println();
        System.out.println("2. <? super T> - когда нужно ДОБАВЛЯТЬ данные.");
        System.out.println("   Пример: метод addDogs(List<? super Dog>)");
        System.out.println("   может принимать List<Animal>, List<Dog>, List<Object>.");
        System.out.println();
        System.out.println("Мнемоническое правило PECS:");
        System.out.println("Producer Extends, Consumer Super");
        System.out.println("- Если читаете (producer) -> ? extends T");
        System.out.println("- Если добавляете (consumer) -> ? super T");
    }
}
