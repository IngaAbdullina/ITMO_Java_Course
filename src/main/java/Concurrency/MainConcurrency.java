package Concurrency;

import java.util.concurrent.CountDownLatch;

public class MainConcurrency {

    public static void main(String[] args) {
        // Напишите программу, в которой запускается 10 потоков и каждый из них выводит числа от 0 до 100
        writeNumbersInThreads(10);

        //  Выведете состояние потока перед его запуском, после запуска и во время выполнения
        writeThreadState();

        // Напишите программу, в которой запускается 100 потоков, каждый из которых вызывает метод increment() 1000 раз.
        // После того, как потоки завершат работу count должен быть равен 100 000 при каждом запуске программы
        incrementCustomCount(100);

        // Напишите программу, в которой создаются два потока,
        // каждый из которых выводит по очереди на консоль своё имя
        writeThreadName(2);
    }

    private static void writeThreadName(int threadsCount) {
        Object object = new Object();
        for (int i = 0; i < threadsCount; i++) {
            Thread thread = new ThreadName(object);
            thread.start();
        }
    }

    private static void incrementCustomCount(int threadsCount) {
        Counter counter = new Counter();
        CountDownLatch countDownLatch = new CountDownLatch(threadsCount);

        for (int i = 0; i < threadsCount; i++) {
            Thread thread = new MultipleThread(counter, countDownLatch);
            thread.start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
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
            Thread thread = new FirstThread();
            thread.start();
        }
    }
}
