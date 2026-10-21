abstract class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    final double MIN_BALANCE = 1000.0;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract void calculateInterest();

    final void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance: " + MIN_BALANCE);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Interest (5%): " + interest);
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest (2%): " + interest);
    }
}

final class BankPolicy {
    void displayPolicy() {
        System.out.println("Bank Policy: Maintain a minimum balance.");
    }
}

public class task5 {
    public static void main(String[] args) {
        BankAccount account;

        account = new SavingsAccount(101, "Kishan", 20000);
        System.out.println("--- Savings Account ---");
        account.displayDetails();
        account.calculateInterest();
        account.deposit(2000);

        System.out.println();

        account = new CurrentAccount(102, "Rahul", 30000);
        System.out.println("--- Current Account ---");
        account.displayDetails();
        account.calculateInterest();
        account.deposit(5000);

        System.out.println();

        BankPolicy policy = new BankPolicy();
        policy.displayPolicy();
    }
}
