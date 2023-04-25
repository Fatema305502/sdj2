package Bridge;

public class Bridge {

    private int activeRightToLeft;
    private int activeLeftToRight;

    public synchronized void enterFromTheLeft() {
        while (activeRightToLeft > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Driving left to right " + activeLeftToRight);
        activeLeftToRight++;
    }

    public synchronized void exitToTheRight() {
        activeLeftToRight--;
        notifyAll();
    }

    public synchronized void enterFromTheRight() {
        while (activeLeftToRight > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Driving right to left " + activeRightToLeft);
        activeRightToLeft++;
    }

    public synchronized void exitToTheLeft() {
        activeRightToLeft--;
        notifyAll();
    }
}
