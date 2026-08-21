package Multithreading_Three;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public interface ExecutorDemo {
    public static void main(String args[]) {


        ExecutorService executor = Executors.newFixedThreadPool(3);
        //ExecutorService extends Executer so it can be tycyat method aahe Runnable ani mg te Runnable class madhe run methode aahe
        // Executors class ahe tyacht ExecutorService che methods aahe static manun obj create karaychi garj nahi

        Runnable task1 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(" Task Excuted By : " + name);
        };

        Runnable task2 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(" Task Excuted By : " + name);
        };

        Runnable task3 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(" Task Excuted By : " + name);
        };

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        executor.shutdown();

    }
}
