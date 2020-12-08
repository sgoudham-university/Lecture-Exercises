package htlanl.oop.interfaces.bank;

public class BankAccount implements Account {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds to Process Withdrawal!");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            return true;
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Your Current Bank Balance is: " + balance);
    }

//    Not sure if this would work
//    public int compareTo(BankAccount bankAccount) {
//        return (int) (this.balance - bankAccount.balance);
//    }
}
