package Shapes;

import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("Your circle's Area is " + circle.getArea());
        System.out.println("Your circle's Circumference is " +circle.getCircumference());
    }
}
