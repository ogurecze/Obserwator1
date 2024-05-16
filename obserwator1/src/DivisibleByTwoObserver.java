public class DivisibleByTwoObserver implements Observer {
    private int count = 0;

    @Override
    public void update(int number) {
        if (number % 2 == 0) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}