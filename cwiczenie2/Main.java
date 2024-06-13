package cwiczenie2;

public class Main {
    public static void main(String[] args) {
        Market market1 = new Market();
        Company FunnyCompany = new Company(market1, "FunnyCompany");
        Company SeriousCompany = new Company(market1, "SeriousCompany");
        Company SuperCompany = new Company(market1, "SuperCompany");

        for (int i = 0; i<10; i++) {
            System.out.format("facebook: %.2f\n", FunnyCompany.getCompanyValue());
            System.out.format("amazon: %.2f\n", SeriousCompany.getCompanyValue());
            System.out.format("superCompany: %.2f\n", SuperCompany.getCompanyValue());
            market1.refreshMarket();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted!");
            }
        }



    }
}
