import java.util.Random;

public class StockMarketSimulator {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Company company1 = new Company("CompanyA");
        Company company2 = new Company("CompanyB");
        Company company3 = new Company("CompanyC");

        stockMarket.addCompany(company1.getName(), 100.0);
        stockMarket.addCompany(company2.getName(), 150.0);
        stockMarket.addCompany(company3.getName(), 200.0);

        stockMarket.attach(company1);
        stockMarket.attach(company2);
        stockMarket.attach(company3);

        Random rand = new Random();
        String[] companies = {company1.getName(), company2.getName(), company3.getName()};

        for (int i = 0; i < 10; i++) {
            String companyName = companies[rand.nextInt(companies.length)];
            double newValuation = 100.0 + (200.0 - 100.0) * rand.nextDouble();
            stockMarket.changeValuation(companyName, newValuation);

            try {
                Thread.sleep(1000); // Sleep for a second to simulate time passing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
