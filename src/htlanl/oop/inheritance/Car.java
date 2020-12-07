package htlanl.oop.inheritance;

public class Car {

    // Variables
    private int gear;
    private int speed;

    // Methods
    public Car(int startSpeed, int startGear) {
        // This is the constructor method
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }
    public int getGear() {
        return gear;
    }
    public int getSpeed() {
        return speed;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void applyAccelerator(int increment) {
        speed += increment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
