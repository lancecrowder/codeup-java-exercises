package Shapes;
abstract class Quadrilateral extends Shape implements Measurable {
    int length;
    int width;
    Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getLength() {
        return length;
    }
    int getWidth() {
        return width;
    }
}