package publisher;

import subscriber.Observer;
import java.util.*;

public class StockPrice implements Subject{
    private final String name;
    private double price;
    private final Set<Observer> observerList = new HashSet<>();

    public StockPrice(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

     private void notifyObservers() {
        for(Observer observer:observerList)
            observer.update(name,price);
    }
}
