package Multithreding_Two;

class MyThread1 implements Runnable {

    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("Thread is Running" + Thread.currentThread().getName());
        }
    }
}

public class ThreadPriority {
    public static void main(String args[]){

        Thread t1=new Thread (new MyThread1(),"Thread-1");
        Thread t2=new Thread (new MyThread1(),"Thread-2");

        t1.setPriority(Thread.MIN_PRIORITY);// 1
        t2.setPriority(Thread.MAX_PRIORITY);// 10

        t1.start();
        t2.start();

    }
//    Priority is only a hint (suggestion) to the Thread Scheduler.
//
//    It does not guarantee execution order.
//
//    Depending on the Operating System and JVM:
//
//    Windows may behave differently.
//    Linux may behave differently.
//    macOS may behave differently.
//
//    The scheduler is free to ignore priorities.




//    Q. Why is the output mixed even though Thread-2 has MAX_PRIORITY?
//
//    Because thread priority is only a hint to the OS Thread Scheduler.
//    The scheduler decides which thread gets CPU time.
//    On a single-core system, context switching causes the mixed output.
//    On a multi-core system, the threads may run in parallel,
//    but the order of console output is still not guaranteed.
//
//    Easy Memory Trick
//    Single Core → Concurrency + Context Switching
//    Multi Core → Parallelism (possible)
//    Mixed Output → Scheduling order is not guaranteed
}


//How many threads are running in your program?"

//There are 3 application threads: Main Thread, Thread-1, and Thread-2."
//
//If they ask:
//
//        Q) "Does the JVM create other threads when it starts?"
//
//Answer:
//
//        "Yes. Along with the Main Thread, the JVM creates several background daemon threads
//        for internal tasks like garbage collection, reference handling, and signal handling."