package publisher;

import subscriber.*;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
