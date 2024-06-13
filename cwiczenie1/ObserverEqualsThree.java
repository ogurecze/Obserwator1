package cwiczenie1;

public class ObserverEqualsThree implements Observer {
    NumberSubject keyboardDataEmiter;
    private int number;

    public ObserverEqualsThree(NumberSubject keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
    }

    @Override
    public void update(int number) {
        if (number == 3) {
            this.number = number;
            System.out.println("Liczba rowna " + this.number);
        }
    }
}
