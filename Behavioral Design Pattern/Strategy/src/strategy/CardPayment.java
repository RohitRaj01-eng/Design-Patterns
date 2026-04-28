package strategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card se $" + amount + " payment ho gya ji");
    }
}
