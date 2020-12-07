package htlanl.oop.overriding;

public class Main {
    public static void main(String[] args) {
        Shape basicShape = new Shape();
        basicShape.getArea();

        Rectangle newRectangle = new Rectangle(5.0, 2.0);
        newRectangle.getArea();

        Triangle newTriangle = new Triangle(2, 5);
        newTriangle.getArea();
    }
}
