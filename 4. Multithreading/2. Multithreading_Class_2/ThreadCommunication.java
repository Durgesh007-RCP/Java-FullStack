package Multithreding_Two;


class Classroom{
    synchronized public void study() throws InterruptedException {

        System.out.println("Student : Sir Vicharaych Hot");

        wait();

        System.out.println("Student : Mala Math Madhe Problem aahe, please solve.");
    }
    synchronized void teach(){
        System.out.println("Teacher : Thod Tham Atta lecture aahe  ");


        notify();

        System.out.println("Teacher : Aata bol ky Bolaychy ");
    }

}

class Student extends Thread{
    Classroom c;
    Student(Classroom c){
        this.c=c;
    }

    public void run()
    {
        try {
            c.study();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Teacher extends Thread{
    Classroom c;

    Teacher(Classroom c){
        this.c=c;

    }

    public void run()
    {
     try{
         Thread.sleep(3000);
     }catch( InterruptedException  e){
         e.printStackTrace();
     }
        c.teach();
    }
}

public class ThreadCommunication {
    public static void main(String args[]){

        Classroom c =new Classroom();
        Student s=new Student(c);
        Teacher t=new Teacher(c);

        s.start();
        t.start();
    }
}
