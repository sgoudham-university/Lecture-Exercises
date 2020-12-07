package htlanl.oop.inheritance;

public class Jedi extends Character {
    private String description;
    private int attitude;
    private int fearAndAnger;
    private int honour;
    private int greed;
    private int overallRating;

    public Jedi(String name, int age) {
        super(name, age);
    }

    public Jedi(String name, int age, int attitude, int fearAndAnger, int honour, int greed, int overallRating) {
        super(name, age);
        this.attitude = attitude;
        this.fearAndAnger = fearAndAnger;
        this.honour = honour;
        this.greed = greed;
        this.overallRating = overallRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAttitude() {
        return attitude;
    }

    public void setAttitude(int attitude) {
        this.attitude = attitude;
    }

    public int getFearAndAnger() {
        return fearAndAnger;
    }

    public void setFearAndAnger(int fearAndAnger) {
        this.fearAndAnger = fearAndAnger;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getGreed() {
        return greed;
    }

    public void setGreed(int greed) {
        this.greed = greed;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    @Override
    public String toString() {
        return "Jedi [attitude=" + attitude + ", fearAndAnger=" + fearAndAnger + ", greed=" + greed + ", honour="
                + honour + ", overallRating=" + overallRating + "]";
    }

}
