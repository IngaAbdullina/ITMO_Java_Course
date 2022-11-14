package Concurrency;

public class Counter {

    private volatile int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
