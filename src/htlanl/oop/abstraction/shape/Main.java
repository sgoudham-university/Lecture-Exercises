package htlanl.oop.abstraction.shape;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle("Dean", "Red", 25, 10);
        System.out.println(rectangle);
        System.out.println(rectangle.getName() + " Area: "  + rectangle.getArea());

        System.out.println();

        Rectangle anotherRectangle = new Rectangle("Greg", "Green");
        anotherRectangle.setLength(20);
        anotherRectangle.setBreadth(50);
        System.out.println(anotherRectangle);
        System.out.println(anotherRectangle.getName() + " Area: " + anotherRectangle.getArea());

        System.out.println();

        Shape triangle = new Triangle("Simar", "Yellow", 50, 100);
        System.out.println(triangle);
        System.out.println(triangle.getName() + " Area: "  + triangle.getArea());

        System.out.println();

        Triangle anotherTriangle = new Triangle("Goudham", "Blue");
        anotherTriangle.setBase(15);
        anotherTriangle.setHeight(10);
        System.out.println(anotherTriangle);
        System.out.println(anotherTriangle.getName() + " Area: " + anotherTriangle.getArea());

    }
}
