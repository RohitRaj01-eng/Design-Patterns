import subscriber.*;
import publisher.*;

void main() {
    StockPrice stockPrice=new StockPrice("HDFC Bank");
    Observer emailAlert=new EmailAlert();
    Observer pushNotificationAlert=new PushNotificationAlert();
    stockPrice.addObserver(emailAlert);
    stockPrice.addObserver(pushNotificationAlert);
    stockPrice.setPrice(2000000);
    stockPrice.removeObserver(pushNotificationAlert);
    stockPrice.setPrice(8000000);
}
