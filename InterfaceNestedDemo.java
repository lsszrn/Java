/**
 * Демонстрация вложенного класса в интерфейсе и способов его вызова.
 *
 * @author lsszrn
 * @version 1.0
 */

interface Vehicle {
    void drive();
    
    // Вложенный класс в интерфейсе (автоматически public static)
    class Engine {
        private String type;
        private int power;
        
        public Engine(String type, int power) {
            this.type = type;
            this.power = power;
        }
        
        public void start() {
            System.out.println("Двигатель " + type + " (" + power + " л.с.) запущен");
        }
        
        public void stop() {
            System.out.println("Двигатель " + type + " остановлен");
        }
        
        public String getInfo() {
            return "Engine: " + type + ", " + power + " л.с.";
        }
    }
    
    // Еще один вложенный класс в интерфейсе
    class Wheel {
        private int size;
        
        public Wheel(int size) {
            this.size = size;
        }
        
        public void rotate() {
            System.out.println("Колесо R" + size + " вращается");
        }
    }
}

class Car implements Vehicle {
    private Vehicle.Engine engine;
    private Vehicle.Wheel[] wheels;
    
    public Car(String engineType, int power, int wheelSize) {
        // Создание вложенного класса через интерфейс
        engine = new Vehicle.Engine(engineType, power);
        
        // Создание нестатического вложенного класса
        wheels = new Vehicle.Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Vehicle.Wheel(wheelSize);
        }
    }
    
    @Override
    public void drive() {
        engine.start();
        for (Vehicle.Wheel wheel : wheels) {
            wheel.rotate();
        }
    }
    
    public void stop() {
        engine.stop();
    }
}

public class InterfaceNestedDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: ВЛОЖЕННЫЙ КЛАСС В ИНТЕРФЕЙСЕ ===\n");
        
        // Способ 1: Прямое создание без реализации интерфейса
        System.out.println("--- Прямое создание Engine ---");
        Vehicle.Engine engine = new Vehicle.Engine("V8", 400);
        engine.start();
        System.out.println(engine.getInfo());
        engine.stop();
        
        // Способ 2: Через класс, реализующий интерфейс
        System.out.println("\n--- Создание через Car ---");
        Car car = new Car("V6", 250, 17);
        car.drive();
        car.stop();
        
        // Способ 3: Нестатический вложенный класс через экземпляр интерфейса
        System.out.println("\n--- Нестатический Wheel через экземпляр ---");
        Vehicle vehicle = new Car("I4", 150, 15);
        Vehicle.Wheel wheel = vehicle.new Wheel(18);
        wheel.rotate();
        
        System.out.println("\n--- ОСОБЕННОСТИ ---");
        System.out.println("1. Класс в интерфейсе автоматически public static");
        System.out.println("2. Не нужен экземпляр интерфейса для static класса");
        System.out.println("3. Для не-static класса нужен экземпляр интерфейса");
        System.out.println("4. Вызов: Vehicle.Engine или vehicle.new Wheel()");
    }
}
