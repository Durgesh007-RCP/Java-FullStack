package Constructer;




class Office{
    String EmpId;
    String name;
    int salary;


    Office(){
     EmpId="SA";
     name="Durgesh";
     salary=25000;
    }

    public void Display(){

System.out.println("Emp Id : "+EmpId);
        System.out.println("name : "+name);
        System.out.println("Salary : "+salary);


    }

}
public class Employee {
    public static void main(String args[]){

        Office O1=new Office();
        Office O2=new Office();

       O1.Display();
        O2.Display();
    }
}
