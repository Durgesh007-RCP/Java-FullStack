package Multithreading_One;

class Mythread extends Thread{

    public void run(){

        for(int i=0; i<=5000; i++){
            System.out.println("Thread Running "+ Thread.currentThread().getName());
        }
    }
}

public class FirstProgramm{
    public static void main(String args[]){

        System.out.println("Hariya");

        Mythread t=new Mythread();
//t.run();// it's provide o/p Sequtally
        t.start();// it's provide o/p unsequence

        Mythread t1=new Mythread();
        t1.start();
        for(int i=0; i<=5000; i++){
            System.out.println("Main Thread"+ Thread.currentThread().getName());
        }

    }

}

