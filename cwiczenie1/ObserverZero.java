package cwiczenie1;

public class ObserverZero implements Observer {

    NumberSubject keyboardDataEmiter;
    ObserverEven listenEven;
    ObserverBiggerThanZero listenLargerThanZero;
    ObserverEqualsThree listenThrees;
    private int number;
    private boolean configMode = false;

    public ObserverZero(NumberSubject keyboardDataEmiter) {
        this.keyboardDataEmiter = keyboardDataEmiter;
        this.keyboardDataEmiter.registerObserver(this);
        this.keyboardDataEmiter.notifyObservers();
    }

    @Override
    public void update(int number) {
        if (configMode) {
            if (number == 1) {
                this.keyboardDataEmiter.deleteObserver(listenLargerThanZero);
                listenLargerThanZero = new ObserverBiggerThanZero(this.keyboardDataEmiter);
            }
            if (number == 2) {
                this.keyboardDataEmiter.deleteObserver(listenEven);
                listenEven = new ObserverEven(this.keyboardDataEmiter);
            }
            if (number == 3) {
                this.keyboardDataEmiter.deleteObserver(listenThrees);
                listenThrees = new ObserverEqualsThree(this.keyboardDataEmiter);
            }
            this.configMode = false;
        }

        if (number == 0) {
            this.configMode = true;
            System.out.println("Wprowadz 1 by wychwytywać liczby wiekszye od 0");
            System.out.println("Wprowadz 2 by wychwytywać liczby parzyste");
            System.out.println("Wprowadz 3 by wychwytywać liczby rowne 3");
            System.out.println("Wprowadz 0 by ponownie wywolac ustawienia configuracji wychwytywania");
        }
        this.number = number;
    }
}
