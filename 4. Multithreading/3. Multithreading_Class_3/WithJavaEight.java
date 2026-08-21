package Multithreading_Three;

public class WithJavaEight {
    public static void main(String argsp[]) {


//        Runnable f = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Task");
//            }
//        };

        Thread s = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task");
            }
        });
        
        s.start();

        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main");
            }
        }
    }
}
//Runnable is a Functional Interface.
//It has only one abstract method, run().
//Therefore, the compiler automatically treats the lambda expression as the implementation of the run() method.
//You don't explicitly write run() because the compiler generates it behind the scenes.