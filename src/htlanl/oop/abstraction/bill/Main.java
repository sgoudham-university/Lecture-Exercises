package htlanl.oop.abstraction.bill;

public class Main {
    public static void main(String[] args) {

        Bill tescoBill = new TescoBill();
        tescoBill.setCost(150.00);
        tescoBill.calculateBill();
        System.out.println(tescoBill.getPrettyBill());

        System.out.println();

        Bill anotherTescoBill = new TescoBill();
        anotherTescoBill.calculateBill();
        System.out.println(anotherTescoBill.getPrettyBill());

    }
}
