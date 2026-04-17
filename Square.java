public class Square extends Rectangle {
    @Override
    public void setWidth(int w) {
        this.width = w;
        this.height = w;  // у квадрата стороны равны
    }
    @Override
    public void setHeight(int h) {
        this.width = h;   // у квадрата стороны равны
        this.height = h;
    }
}
