package Concurrency;

public class MultipleThread extends Thread {

    private final Counter counter;

    public MultipleThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
