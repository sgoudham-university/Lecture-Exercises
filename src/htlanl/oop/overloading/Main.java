package htlanl.oop.overloading;

public class Main {
    public static void main(String[] args) {
        Shape basicShape = new Shape();
        basicShape.getArea();

        // Examples of Method Overloading
        Rectangle basicRectangle = new Rectangle();
        basicRectangle.setBreadth(10.0);
        basicRectangle.setLength(20.0);
        basicRectangle.getArea();

        Triangle basicTriangle = new Triangle();
        basicTriangle.setBase(50.0);
        basicTriangle.setHeight(2.0);
        basicTriangle.getArea();

        // Normal Instantiation
        Rectangle newRectangle = new Rectangle(5.0, 2.0);
        newRectangle.getArea();

        Triangle newTriangle = new Triangle(2, 5);
        newTriangle.getArea();
    }
}
