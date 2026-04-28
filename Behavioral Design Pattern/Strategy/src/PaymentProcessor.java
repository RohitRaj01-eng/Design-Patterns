import strategy.*;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;


    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void pay(double amount){
        paymentStrategy.pay(amount);
    }

}
