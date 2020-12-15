package htlanl.oop.abstraction.shape;

abstract class Shape {
    private String name;
    private String colour;

    Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
