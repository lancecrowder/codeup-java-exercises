package Shapes;
public class Rectangle {
    private int length;
    private int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getLength() {
        return length;
    }
    int getWidth() {
        return width;
    }
    public int getPerimeter(){
        return (2*length)+(2*width);
    }
    public int getArea(){
        return length*width;
    }
}