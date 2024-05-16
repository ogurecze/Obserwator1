import java.util.*;

public class StockMarket implements Subject {
    private List<Observer> observers;
    private Map<String, Double> companyValuations;

    public StockMarket() {
        observers = new ArrayList<>();
        companyValuations = new HashMap<>();
    }

    public void addCompany(String name, double valuation) {
        companyValuations.put(name, valuation);
    }

    public void changeValuation(String companyName, double newValuation) {
        companyValuations.put(companyName, newValuation);
        notifyObservers(companyName, newValuation);
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String companyName, double newValuation) {
        for (Observer o : observers) {
            o.update(companyName, newValuation);
        }
    }
}