package Constructer;

// Default Constructer
class Classroom{

    String name;
    int rollNo;

      Classroom(){
          System.out.println("Student Object Created");
    }
}

public class Student {

     public static void main(String args[]){



         Classroom c1 = new Classroom();
         Classroom c2 = new Classroom();
         Classroom c3 = new Classroom();

         c1.name="Durgesh";
         c1.rollNo=10;
         System.out.println(c1.name);
         System.out.println(c1.rollNo);
     }




}

