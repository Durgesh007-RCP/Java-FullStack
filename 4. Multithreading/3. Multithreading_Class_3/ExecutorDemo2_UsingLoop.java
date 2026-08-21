package Multithreading_Three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public interface ExecutorDemo2_UsingLoop {
    public static void main(String args[]) {


        ExecutorService executor = Executors.newFixedThreadPool(3);
        //ExecutorService extends Executer so it can be tycyat method aahe Runnable ani mg te Runnable class madhe run methode aahe
        // Executors class ahe tyacht ExecutorService che methods aahe static manun obj create karaychi garj nahi

        Runnable task1 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(" Task Excuted By : " + name);
        };


        for(int i=0; i<6; i++){
            executor.submit(task1);
        }



        executor.shutdown();
    }
}
