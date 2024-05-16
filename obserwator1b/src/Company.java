public class Company implements Observer {
    private String name;
    private double valuation;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public void update(String companyName, double newValuation) {
        if (this.name.equals(companyName)) {
            this.valuation = newValuation;
            System.out.println("Updated " + name + " valuation to " + newValuation);
        }
    }

    public String getName() {
        return name;
    }
}
