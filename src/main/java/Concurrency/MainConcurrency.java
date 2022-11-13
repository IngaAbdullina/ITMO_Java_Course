package Concurrency;

public class MainConcurrency {

    public static void main(String[] args) {
        // Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100
        writeNumbersInThreads(10);

        //  Выведете состояние потока перед его запуском, после запуска и во время выполнения
        writeThreadState();

        // Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
        // После того, как потоки завершат работу count должен быть равен 100 000 при каждом запуске программы
        incrementCustomCount(100);
    }

    private static void incrementCustomCount(int threadsCount) {
        Counter counter = new Counter();

        for (int i = 0; i < threadsCount; i++) {
            Thread thread = new MultipleThread(counter);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println(counter.getCount());
    }

    private static void writeThreadState() {
        Thread thread = new StateThread();
        System.out.println(thread.getState());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }

    private static void writeNumbersInThreads(int numberOfThreads) {
        for (int i = 1; i <= numberOfThreads; i++) {
            Thread thread = new FirstThread(i);
            thread.start();
        }
    }
}
