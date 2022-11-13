package Concurrency;

public class StateThread extends Thread {
    private Thread thread;

    public StateThread() {
        this.thread = new Thread(this);
        System.out.println(thread.getState());
    }

    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println(thread.getState());
    }
}
