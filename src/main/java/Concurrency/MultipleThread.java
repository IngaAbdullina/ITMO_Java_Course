package Concurrency;

import java.util.concurrent.CountDownLatch;

public class MultipleThread extends Thread {

    private final Counter counter;
    private final CountDownLatch countDownLatch;

    public MultipleThread(Counter counter, CountDownLatch countDownLatch) {
        this.counter = counter;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (counter) {
                counter.increment();
            }
        }
        countDownLatch.countDown();
    }
}
