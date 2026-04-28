package subscriber;

public class PushNotificationAlert implements Observer{
    @Override
    public void update(String stock, double price) {
        System.out.println("Push notification alert: " + stock + ": " + price);
    }
}
