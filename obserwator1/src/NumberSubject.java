import java.util.ArrayList;
import java.util.List;

public class NumberSubject {
    private List<Observer> observers = new ArrayList<>();
    private Observer activeObserver = null;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setActiveObserver(Observer observer) {
        activeObserver = observer;
    }

    public Observer getActiveObserver() {
        return activeObserver;
    }

    public void notifyObservers(int number) {
        for (Observer observer : observers) {
            observer.update(number);
        }
        if (activeObserver != null) {
            activeObserver.update(number);
        }
    }
}
