public class Rectangle {
    protected int width;
    protected int height;
    public void setWidth(int w) {
        this.width = w;
    }    
    public void setHeight(int h) {
        this.height = h;
    }
    public int getArea() {
        return width * height;
    }
}
