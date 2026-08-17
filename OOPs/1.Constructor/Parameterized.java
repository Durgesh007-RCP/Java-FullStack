package Constructer;


class Students {

    String name;
    int RollNo;

    String Branch;

Students(String inputname, int inputRollNo, String inputBranch){
    this.name=inputname;
    this.RollNo=inputRollNo;
    this.Branch=inputBranch;
// current object la refer karto

    //eg Student.name=input.name
//    s1.name=input.name;
}
public void Display(){
    System.out.println("Name   : "+name);
    System.out.println("RollNo : "+RollNo);
    System.out.println("Branch : "+Branch);
    System.out.println( "  " );
}
}
public class Parameterized {

    public static void main(String args[]){


        Students s1=new Students("Durgesh",10,"ETC");
        Students s2=new Students("Rohit",11,"ETC");
        Students s3 = new Students("Prathamesh", 30, "IT");
 s1.Display();
 s2.Display();
        s3.Display();

    }
}
