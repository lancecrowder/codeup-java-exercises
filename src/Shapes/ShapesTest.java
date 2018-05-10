package Shapes;
public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(6);
        System.out.println("box1 length = " + box1.getLength());
        System.out.println("box1 width = " + box1.getWidth());
        System.out.println("box1 perimeter = " + box1.getPerimeter());
        System.out.println("box1 area = " + box1.getArea());
        System.out.println();
        System.out.println("box2 length = " + box2.getLength());
        System.out.println("box2 width = " + box2.getWidth());
        System.out.println("box2 perimeter = " + box2.getPerimeter());
        System.out.println("box2 area = " + box2.getArea());
        System.out.println();
        Measurable myShape = new Rectangle(7,8);
        Measurable myNewShape = new Square(9);
        System.out.println("Rectangle Stuff:");
        System.out.println("Width: "+((Rectangle) myShape).getWidth());
        System.out.println("Length: "+((Rectangle) myShape).getLength());
        System.out.println("Area: " + myShape.getArea());
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println();
        System.out.println("Box Stuff");
        System.out.println("Width: "+((Square) myNewShape).getWidth());
        System.out.println("Length: "+((Square) myNewShape).getLength());
        System.out.println("Area: " + myNewShape.getArea());
        System.out.println("Perimeter: " + myNewShape.getPerimeter());
    }
}