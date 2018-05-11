package Shapes;
public class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return (2*length)+(2*width);
    }
    @Override
    public double getArea() {
        return length*width;
    }
}