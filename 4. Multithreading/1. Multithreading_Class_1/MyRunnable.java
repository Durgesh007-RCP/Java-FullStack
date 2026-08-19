package Multithreading_One;

public class MyRunnable implements Runnable{

    public void run(){
        System.out.println("Task running :- "+ Thread.currentThread().getName());
    }
}

