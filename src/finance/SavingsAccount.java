package finance;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {

        super(balance);
    }

    @Override
    public void calculateInterest() {

        double interest = balance * 0.05;

        System.out.println("Savings Interest: " + interest);
    }
}
