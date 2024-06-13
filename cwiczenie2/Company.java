package cwiczenie2;

public class Company implements Observer {
    private double companyValue;
    private String name;
    private Subject market;

    public Company(Subject market, String name) {
        this.name = name;
        this.market = market;
        this.market.registerObserver(this);
        this.market.notifyObservers(Math.random() * 1000, this.name);
    }

    @Override
    public void update(double price, String name) {
        if(this.name == name) this.companyValue = price;
    }

    @Override
    public String getName(){
        return name;
    }

    public double getCompanyValue() {
        return companyValue;
    }
}
