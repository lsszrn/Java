/**
 * Тест доступа к внутренним классам из того же пакета.
 *
 * @author lsszrn
 * @version 1.0
 */
public class SamePackageTest {
    public static void main(String[] args) {
        System.out.println("=== ПРАКТИКА #1: СПЕЦИФИКАТОРЫ ДОСТУПА ===\n");
        
        OuterClass outer = new OuterClass();
        
        System.out.println("--- Из того же пакета ---");
        
        OuterClass.PublicInner pub = outer.new PublicInner();
        pub.display();
        
        OuterClass.ProtectedInner prot = outer.new ProtectedInner();
        prot.display();
        
        OuterClass.DefaultInner def = outer.new DefaultInner();
        def.display();
        
        // OuterClass.PrivateInner priv; // ОШИБКА! private не доступен
        
        System.out.println("\nPrivateInner доступен только через метод внешнего класса:");
        outer.usePrivateInner();
        
        System.out.println("\n--- ИТОГ ---");
        System.out.println("public:    доступен всем");
        System.out.println("protected: доступен в пакете и подклассам");
        System.out.println("default:   доступен только в том же пакете");
        System.out.println("private:   доступен только внутри внешнего класса");
    }
}
