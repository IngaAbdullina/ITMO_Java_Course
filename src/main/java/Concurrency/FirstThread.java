package Concurrency;

public class FirstThread extends Thread {

    private final int threadNum;

    public FirstThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(this.threadNum + ": " + i);
        }
    }
}
