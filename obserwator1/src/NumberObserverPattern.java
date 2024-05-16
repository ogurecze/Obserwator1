import java.util.Scanner;

public class NumberObserverPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberSubject numberSubject = new NumberSubject();

        ZeroDetectorObserver zeroDetectorObserver = new ZeroDetectorObserver(numberSubject, scanner);
        numberSubject.addObserver(zeroDetectorObserver);

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            numberSubject.notifyObservers(number);
        }
    }
}
