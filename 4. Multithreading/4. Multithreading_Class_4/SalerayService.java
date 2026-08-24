package Multi_three_ReturnDemo;

import java.util.concurrent.*;

public class SalerayService {
    public static void main(String args[]) throws ExecutionException , InterruptedException {



        ExecutorService Exe= Executors.newFixedThreadPool(1);

        Callable<String> email=()->{
          System.out.println("Sending Eamil buy...."+Thread.currentThread().getName());
        Thread.sleep(1000);
          return "Done";
        };

        Callable<String> Salary=()->{
            System.out.println("Calculating Salary...."+Thread.currentThread().getName());
      Thread.sleep(1000);
            return "45000";
        };


        Future<String> future= Exe.submit(Salary);
        Future<String> output= Exe.submit(email);
        System.out.println("Hr Doing Work ....");


         String sal=future.get();
        System.out.println("Final Salary :-  " + sal);
        String emai=output.get();
        System.out.println(emai);





    }

}
