package Multithreading_One;

public class RunnalbleDemo {
    public static void main(String args[])
    {

        MyRunnable r=new MyRunnable();
     Thread t1=new Thread(r);     //  he lihal nhi tr run ka hot nahi karn Thread madech Start method aahe
t1.start();
    }
}
// Runnable only defines the task through the run() method.
// It does not create a new thread and does not have a start() method.
// To execute the task in a separate thread, we must create a Thread object by
// passing the Runnable object to its constructor.
// Calling start() on the Thread object creates a new thread and internally invokes the run() method of the Runnable object.