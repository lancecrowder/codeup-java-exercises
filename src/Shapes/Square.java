package Shapes;
public class Square extends Rectangle {
    private int side;
    Square(int side) {
        super(side, side);
        this.side = side;
    }
    public double getArea() {
        return (Math.pow(side, 2));
    }
    public double getPerimeter(){
        return 4*side;
    }
}