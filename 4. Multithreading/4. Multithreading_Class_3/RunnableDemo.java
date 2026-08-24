package Multi_three_ReturnDemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String args[]){

        ExecutorService Executorservice= Executors.newFixedThreadPool(2);

        Runnable r=()->{
            System.out.println("Email Sends..... "+Thread.currentThread().getName());
        };

        Executorservice.submit(r);
        Executorservice.shutdown();

    }
}
