package htlanl.oop.interfaces.bank;

public class Main {
    public static void main(String[] args) {

        // Instantiating a new object of BankAccount
        BankAccount myBankAccount = new BankAccount();

        // Depositing money into the bank account and then displaying the balance
        myBankAccount.deposit(100);
        myBankAccount.displayBalance();

        // Withdrawing money from the bank account (Should be fine since we deposited 100 earlier on line 10)
        myBankAccount.withdraw(50);
        myBankAccount.displayBalance();

        // Withdrawing 50 again from the bank account (Should be fine still but our balance will now be 0)
        myBankAccount.withdraw(50);
        myBankAccount.displayBalance();

        // Will return false and print out "Insufficient Funds"
        // This is because our balance is now 0 and we're trying to take away 100 which obviously won't work
        myBankAccount.withdraw(100);
        myBankAccount.displayBalance();

    }
}
