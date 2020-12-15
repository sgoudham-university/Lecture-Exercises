package htlanl.oop.abstraction.bill;

public class TescoBill extends Bill {
    String tescoHeader = "*************** TESCO BILL ***************";
    String tescoFooter = "*************** THANK YOU FOR SHOPPING AT TESCO ***************";

    TescoBill() { }

    TescoBill(double cost) {
        setCost(cost);
    }

    @Override
    String getPrettyBill() {
        return tescoHeader + "\n\nTotal Amount To Pay: " + getCost() + "\n\n" + tescoFooter;
    }
}
