package cwiczenie1;


import java.util.ArrayList;
import java.util.Scanner;

public class NumberSubject implements Subject {
    private ArrayList<Observer> observers;
    private int number;

    public NumberSubject() {
        System.out.println("Wprowadź liczbę, aby wyjść z programu nacisnij q:");

        this.observers = new ArrayList<>();
    }

    void readKey() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                this.number = getIntValue(input);
            } catch (IllegalArgumentException error) {
                this.notifyObservers();
                continue;
            }
            this.notifyObservers();
        }
        scanner.close();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        this.observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        ArrayList<Observer> observerArrayList = new ArrayList<>(observers);
        for (Observer observer : observerArrayList) {
            observer.update(this.number);
        }
    }

    private int getIntValue(String input) throws IllegalArgumentException {
        int inputNumber = 0;
        try {
            inputNumber = Integer.parseInt(input);
        } catch (Exception error) {
            System.err.println("to nie jest liczba " + error);
            throw new IllegalArgumentException();
        }
        return inputNumber;
    }
}
