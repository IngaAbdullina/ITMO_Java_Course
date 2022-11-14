package Concurrency;

public class ThreadName extends Thread {

    private final Object object;

    public ThreadName(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 100) {
            synchronized (object) {
                count++;
                System.out.println(this.getName() + " " + count);
                try {
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}
