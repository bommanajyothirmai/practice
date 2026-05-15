package finance;

public class FinancialSystem {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(10000);

        s.deposit(2000);

        s.withdraw(1500);

        s.displayBalance();

        s.calculateInterest();

        System.out.println("----------------------");

        CurrentAccount c = new CurrentAccount(20000);

        c.deposit(5000);

        c.withdraw(3000);

        c.displayBalance();

        c.calculateInterest();

        System.out.println("----------------------");

        Payment p1 = new UPIPayment();

        Payment p2 = new CardPayment();

        Payment p3 = new CashPayment();

        p1.makePayment(1000);

        p2.makePayment(2000);

        p3.makePayment(500);
    }
}

