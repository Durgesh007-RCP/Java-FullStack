package Multi_three_ReturnDemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class SalaryServiceByList {
    public static void main(String args[]) throws ExecutionException, InterruptedException {



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

        List<Callable<String>> tasks= Arrays.asList(Salary,email);
        List<Future<String>> result=Exe.invokeAll(tasks);

   // Same  data type pahijel karan Futere madhe Future pahile sangav lagat


        //String sal=future.get();
        System.out.println("---------------Final Results ---------------");

        for(Future<String> future : result){
            System.out.println(future.get());

        }
//        System.out.println("Final Salary :-  " + sal);
//        String emai=output.get();
//        System.out.println(emai);

        Exe.shutdown();





    }

}
