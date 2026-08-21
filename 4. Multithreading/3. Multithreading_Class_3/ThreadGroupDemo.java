package Multithreading_Three;


class MyThread extends Thread{

    public MyThread(ThreadGroup Group, String Name){
       super(Group,Name);
    }
    public void run(){
        System.out.println("Thread Name : "+Thread.currentThread().getName()+"|  Group Name : "+
                Thread.currentThread().getThreadGroup().getName());

    }
}
public class ThreadGroupDemo {
    public static void main(String args[]){

        ThreadGroup api=new ThreadGroup("AmrishBhai Group");
        MyThread t1=new MyThread(api,"API-Group - 1");
        MyThread t2=new MyThread(api,"API-Group - 2");
        t1.start();
        t2.start();



    }

}
