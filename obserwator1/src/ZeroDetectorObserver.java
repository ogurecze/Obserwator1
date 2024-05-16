import java.util.Scanner;

public class ZeroDetectorObserver implements Observer {
    private boolean firstZeroDetected = false;
    private NumberSubject numberSubject;
    private Scanner scanner;

    public ZeroDetectorObserver(NumberSubject numberSubject, Scanner scanner) {
        this.numberSubject = numberSubject;
        this.scanner = scanner;
    }

    @Override
    public void update(int number) {
        if (number == 0) {
            if (!firstZeroDetected) {
                firstZeroDetected = true;
                System.out.println("Choose counting type: 1. >0  2. =3  3. Divisible by 2");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        numberSubject.setActiveObserver(new GreaterThanZeroObserver());
                        break;
                    case 2:
                        numberSubject.setActiveObserver(new EqualsThreeObserver());
                        break;
                    case 3:
                        numberSubject.setActiveObserver(new DivisibleByTwoObserver());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Program ended.");
                Observer activeObserver = numberSubject.getActiveObserver();
                if (activeObserver instanceof GreaterThanZeroObserver) {
                    System.out.println("Count of numbers > 0: " + ((GreaterThanZeroObserver) activeObserver).getCount());
                } else if (activeObserver instanceof EqualsThreeObserver) {
                    System.out.println("Count of numbers = 3: " + ((EqualsThreeObserver) activeObserver).getCount());
                } else if (activeObserver instanceof DivisibleByTwoObserver) {
                    System.out.println("Count of numbers divisible by 2: " + ((DivisibleByTwoObserver) activeObserver).getCount());
                }
                System.exit(0);
            }
        }
    }
}