package htlanl.oop.abstraction.shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(String name, String colour) {
        super(name, colour);
    }

    Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "} " + super.toString();
    }
}
