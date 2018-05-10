package Shapes;
public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(5);

        System.out.println("box1 length = " + box1.getLength());
        System.out.println("box1 width = " + box1.getWidth());
        System.out.println("box1 perimeter = " + box1.getPerimeter());
        System.out.println("box1 area = " + box1.getArea());
        System.out.println();
        System.out.println("box2 length = " + box2.getLength());
        System.out.println("box2 width = " + box2.getWidth());
        System.out.println("box2 perimeter = " + box2.getPerimeter());
        System.out.println("box2 area = " + box2.getArea());
    }
}