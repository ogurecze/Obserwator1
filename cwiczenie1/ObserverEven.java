package cwiczenie1;

public class ObserverEven implements Observer {
    NumberSubject keyboardDataEmiter;
    private int number;

    public ObserverEven(NumberSubject keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number % 2 == 0) {
            this.number = number;
            System.out.println("Liczba podzielna przez 2: " + this.number);
        }
    }
}
