package cwiczenie1;

public class Main {
    public static void main(String[] args) {
        NumberSubject keyboardDataEmiter = new NumberSubject();
        ObserverZero listeningConfig = new ObserverZero(keyboardDataEmiter);
        keyboardDataEmiter.readKey();
    }
}
