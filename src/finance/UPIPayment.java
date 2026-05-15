package finance;

public class UPIPayment extends Payment {

    @Override
    public void makePayment(double amount) {

        System.out.println("UPI Payment Successful: " + amount);
    }
}

