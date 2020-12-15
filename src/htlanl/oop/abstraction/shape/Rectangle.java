package htlanl.oop.abstraction.shape;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(String name, String colour) {
        super(name, colour);
    }

    Rectangle(String name, String colour, double length, double breadth) {
        super(name, colour);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                "} " + super.toString();
    }

}
