package cwiczenie1;

public interface Subject {
    void registerObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObservers();
}
