package Shapes;

public class Square extends Rectangle {
    private int side;
    Square(int side) {
        super(side, side);
        this.side = side;
    }
//        @Overrides
        public int getArea() {
        return ((int)Math.pow(side, 2));
        }
        public int getPerimeter(){
        return 4*side;
        }
}
