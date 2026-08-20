package Multithreding_Two;


class MyThread implements Runnable {

    public void run(){
        System.out.println("Thread is Running");
    }
}

public class ThreadName {

    public static void main(String args[]){
        Thread t1= new Thread(new MyThread(),"Therad 1"); // ithun pn nav deta yet Thread la

        String name=t1.getName();
        System.out.println("Default Name  Of Thread :- "+ name);
        System.out.println("line Executed by thread :- "+ Thread.currentThread().getName());


        t1.setName("MyThread - 0 ");
        String updateName=t1.getName();
        System.out.println("Update Thread Name : -" +updateName);
    }


}
