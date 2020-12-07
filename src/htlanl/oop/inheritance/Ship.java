package htlanl.oop.inheritance;

public class Ship {
    private String name;
    private String model;
    private int maxSpeed;
    private String currentOwner;

    public Ship() {

    }

    public Ship(String name) {
        this.name = name;
    }

    public Ship(String name, String model, int maxSpeed, String currentOwner) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.currentOwner = currentOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentOwner='" + currentOwner + '\'' +
                '}';
    }
}
