package Multithreding_Two;

class Computer extends Thread{

    public Computer(String name){
        super(name);
    }


    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(getName()+ " Using Computer "+ i);

            Thread.yield();
//            Thread.yield() means the current thread says,
//            'You can give another thread a chance to run if you want.'
//            It is only a request, not a guarantee."
        }
    }
}
public class YiledDemo {
    public static void main(String args[]){

        Computer c1= new Computer("F-1");
        Computer c2 =new Computer("F-2");
         c1.start();
         c2.start();


    }



}
