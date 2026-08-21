package Multithreading_Three;


class Run implements Runnable{
   public void run(){

       for(int i=0; i<5; i++){
           System.out.println("Task");
       }
    }
}
public class WithoutJavaEight {
    public static void main(String args[]){

        Run r =new Run();
        Thread t=new Thread(r);
        t.start();
        for(int i=0; i<5; i++){
            System.out.println("Main");
        }

    }
}
