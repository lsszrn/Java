/**
 * Демонстрация переопределения методов (overriding).
 *
 * @author lsszrn
 * @version 1.0
 */

// Суперкласс
class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void makeSound() {
        System.out.println(name + " издает звук");
    }
    
    public void move() {
        System.out.println(name + " двигается");
    }
    
    public void eat() {
        System.out.println(name + " ест");
    }
}

// Подкласс 1
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " бегает на четырех лапах");
    }
}

// Подкласс 2
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " мяукает: Мяу!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " крадется");
    }
}

// Подкласс 3
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " чирикает: Чик-чирик!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " летает");
    }
    
    // eat() не переопределен, используется из суперкласса
}

public class OverridingDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ ===\n");
        
        Animal dog = new Dog("Бобик");
        Animal cat = new Cat("Мурка");
        Animal bird = new Bird("Кеша");
        
        System.out.println("--- Полиморфный вызов методов ---");
        dog.makeSound();
        dog.move();
        dog.eat();
        
        System.out.println();
        cat.makeSound();
        cat.move();
        cat.eat();
        
        System.out.println();
        bird.makeSound();
        bird.move();
        bird.eat();
        
        System.out.println("\n--- Массив животных (полиморфизм) ---");
        Animal[] animals = {new Dog("Шарик"), new Cat("Барсик"), new Bird("Чижик")};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
