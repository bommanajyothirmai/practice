package finance;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
    }

    public void withdraw(double amount) {

        if(amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawn Amount: " + amount);
        }
        else {

            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {

        System.out.println("Current Balance: " + balance);
    }

    public void calculateInterest() {

        System.out.println("Interest Calculation");
    }
}
