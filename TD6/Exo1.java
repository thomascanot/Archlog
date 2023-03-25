package TD6;

public class Exo1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thread" + " : " + i);
            i++;
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Exo1());
        t.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();
    }
}
