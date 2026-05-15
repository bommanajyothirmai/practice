package finance;

public class CashPayment extends Payment {

    @Override
    public void makePayment(double amount) {

        System.out.println("Cash Payment Successful: " + amount);
    }
}
