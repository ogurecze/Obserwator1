package cwiczenie2;

import java.util.ArrayList;

public class Market implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void refreshMarket() {
        this.notifyObservers(Math.random() * 1000, this.observers.get((int) ((Math.random() * (this.observers.size() - 0)) + 0)).getName());
    }

    @Override
    public void notifyObservers(double price, String companyName) {
        for (Observer observer : observers) {
          if(observer.getName() == companyName) observer.update(price, companyName);
        }
    }
}
