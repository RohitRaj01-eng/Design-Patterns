import strategy.*;

void main() {
    PaymentProcessor paymentProcessor=new PaymentProcessor(new UPIPayment());
    paymentProcessor.pay(200);
    paymentProcessor.setPaymentStrategy(new CardPayment());
    paymentProcessor.pay(300);
    paymentProcessor.setPaymentStrategy(new WalletPayment());
    paymentProcessor.pay(500);
}
