package cwiczenie2;

public interface Subject {
    void registerObserver(Observer o);

    void deleteObserver(Observer o);

    void refreshMarket();

    void notifyObservers(double price, String name);
}
