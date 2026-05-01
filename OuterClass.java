/**
 * Демонстрация спецификаторов доступа для внутренних классов.
 *
 * @author lsszrn
 * @version 1.0
 */
public class OuterClass {
    
    // public внутренний класс - доступен всем
    public class PublicInner {
        public void display() {
            System.out.println("PublicInner: доступен всем");
        }
    }
    
    // protected внутренний класс - доступен в том же пакете и подклассам
    protected class ProtectedInner {
        public void display() {
            System.out.println("ProtectedInner: доступен в пакете и подклассам");
        }
    }
    
    // default внутренний класс - доступен только в том же пакете
    class DefaultInner {
        public void display() {
            System.out.println("DefaultInner: доступен только в том же пакете");
        }
    }
    
    // private внутренний класс - доступен только внутри внешнего класса
    private class PrivateInner {
        public void display() {
            System.out.println("PrivateInner: доступен только внутри OuterClass");
        }
    }
    
    public void usePrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.display();
    }
}
