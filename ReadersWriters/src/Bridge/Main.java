package Bridge;

public class Main {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        for (int i = 0; i < 10; i++) {
            new Thread(new BlueCar(bridge)).start();
        }
        for (int i = 0; i < 10 ; i++) {
            new Thread(new RedCar(bridge)).start();
        }
    }
}
