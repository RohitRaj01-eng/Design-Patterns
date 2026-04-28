package strategy;

public class WalletPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Wallet se $" + amount + " pay ho gya ji");
    }
}
