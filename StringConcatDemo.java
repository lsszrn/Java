public class StringConcatDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #4: Оператор + со строками ===");
        String s1 = "Hello";
        String s2 = "World";
        String result1 = s1 + " " + s2;
        System.out.println("Строка + Строка: " + result1);
        int age = 25;
        String message = "Мне " + age + " лет";
        System.out.println("Строка + int: " + message);
        Object obj = new Object();
        String withObject = "Объект: " + obj;
        System.out.println("Строка + Object: " + withObject);
        double pi = 3.14159;
        System.out.println("Число Пи ≈ " + pi);
        boolean isJavaFun = true;
        System.out.println("Java это весело? " + isJavaFun);
        char letter = 'A';
        System.out.println("Буква: " + letter);
        System.out.println("\n--- Важно: порядок операций ---");
        System.out.println("1 + 2 = " + 1 + 2);  
        System.out.println("1 + 2 = " + (1 + 2));  
        System.out.println("Сумма: " + (10 + 20));  
        Person person = new Person("Иван", 30);
        System.out.println("Пользователь: " + person);
    }
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " (" + age + " лет)";
    }
}
