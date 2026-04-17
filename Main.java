public class Main {
    static void testRectangle(Rectangle r) {
        r.setWidth(5);
        r.setHeight(10);
        System.out.println("Площадь: " + r.getArea());
    }    
    public static void main(String[] args) {
        System.out.println("=== Проверяем прямоугольник ===");
        Rectangle rect = new Rectangle();
        testRectangle(rect);  // 5 * 10 = 50 (все ок)       
        System.out.println("=== Проверяем квадрат ===");
        Square square = new Square();
        testRectangle(square);
    }
}
