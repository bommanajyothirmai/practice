package finance;

public class CurrentAccount extends Account {

    public CurrentAccount(double balance) {

        super(balance);
    }

    @Override
    public void calculateInterest() {

        System.out.println("No Interest For Current Account");
    }
}
