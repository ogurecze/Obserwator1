public class EqualsThreeObserver implements Observer {
    private int count = 0;

    @Override
    public void update(int number) {
        if (number == 3) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}