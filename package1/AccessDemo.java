package package1;

/**
 * Класс для демонстрации всех спецификаторов доступа.
 *
 * @author lsszrn
 * @version 1.0
 */
public class AccessDemo {
    
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;
    
    private void privateMethod() {
        System.out.println("private метод: доступен только внутри класса");
    }
    
    void defaultMethod() {
        System.out.println("default метод: доступен в том же пакете");
    }
    
    protected void protectedMethod() {
        System.out.println("protected метод: доступен в том же пакете и подклассам");
    }
    
    public void publicMethod() {
        System.out.println("public метод: доступен всем");
    }
    
    public void testInsideClass() {
        System.out.println("--- Внутри самого класса AccessDemo ---");
        System.out.println("privateVar = " + privateVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("publicVar = " + publicVar);
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
        System.out.println("Все члены доступны!");
    }
}
