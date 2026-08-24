package Multi_three_ReturnDemo;

import java.util.concurrent.*;

public class CallebleDemo  {
    public static void main(String args[])throws InterruptedException, ExecutionException {


        ExecutorService Exe=Executors.newFixedThreadPool(2);

        Callable<Integer>c=()->{
            System.out.println("Sending Email..... |:-  ");  // purn block Task
            Thread.sleep(10000);
            return 200;


        };


       Future<Integer> future= Exe.submit(c);  // Main methode Executor service la task assing karto aani Future Object madhe Store karto

//        Why don't we write new Future()?
//
//        Answer:
//
//        Future is an interface, so we cannot create its object directly. The ExecutorService internally
//        creates an implementation (such as FutureTask) and returns it as a Future reference.


        Integer res=future.get(); // Future madhun to stored result gheto. / waits until it is available
       System.out.println("Doing The Work......|:-  ");
       Thread.sleep(4000);

        System.out.println("Result ......|:-  "+res);

        Exe.shutdown();


    }
}
