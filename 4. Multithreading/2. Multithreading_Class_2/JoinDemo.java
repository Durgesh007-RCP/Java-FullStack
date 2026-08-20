package Multithreding_Two;

class WashingMachine extends Thread{

    public void run(){
        try{
            System.out.println("Washing Stared  - ");
            Thread.sleep(10000);
            System.out.println("Washing Done    - ");
        }catch (InterruptedException e){
             throw new RuntimeException(e);
        }
    }
}
public class JoinDemo {
    public static void main(String argss[]) throws InterruptedException {

        WashingMachine Wash=new WashingMachine();
        Wash.start();
        Wash.join();
        System.out.println("Drying Started  :- ");
}
}
//join call kah ahoga
// jise rukan ha vaha uske area me join use karenge