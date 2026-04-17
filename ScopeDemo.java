public class ScopeDemo {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #3: Область видимости ===");
        int a = 1;
        {
            int b = 2;
            System.out.println("Внутри блока: a = " + a + ", b = " + b);
        }
        System.out.println("\nОбъяснение:");
        System.out.println("Переменная 'b' объявлена внутри блока {}.");
        System.out.println("Её область видимости ограничена этим блоком.");
        System.out.println("После закрывающей скобки '}' переменная 'b' уничтожается.");
        System.out.println("Поэтому строка 'int c = a + b;' вызовет ошибку компиляции:");
        System.out.println("'cannot find symbol b'");
    }
}
