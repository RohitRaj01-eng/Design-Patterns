package subscriber;

public class EmailAlert implements Observer{
    @Override
    public void update(String stock, double price) {
        System.out.println("Email alert: " + stock + ": " + price);
    }
}
