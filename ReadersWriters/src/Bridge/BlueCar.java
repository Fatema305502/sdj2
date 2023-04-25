package Bridge;

public class BlueCar implements Runnable {

    private Bridge bridge;

    public BlueCar(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void run() {
        while (true) {
            bridge.enterFromTheRight();
            System.out.println("Blue car on bridge");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bridge.exitToTheLeft();
            System.out.println("Blue car left bridge");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
