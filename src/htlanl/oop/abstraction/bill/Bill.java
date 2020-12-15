package htlanl.oop.abstraction.bill;

abstract class Bill {
    private final double VAT = 25.00;
    private double cost = 0.0;
    String header = "************ START OF BILL ************";
    String footer =  "************ END OF BILL ************";

    Bill() { }

    Bill(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private void costPlusVAT() {
        cost += VAT;
    }

    void calculateBill() {
        costPlusVAT();
    }

    String getPrettyBill() {
        return header + "\n\nAmount To Pay: " + cost + "\n\n" + footer;
    }
}
