package Encapsulation;




class Student{
    private String name;
    private int age;


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String Name){
        this.name=Name;
    }
    public void setAge(int Age){
        if(Age >  18){
            this.age=Age;
        }else{
            System.out.println("Invalid Age");
        }

    }




}

public class School {
    public static void main(String args []){

        Student s1=new Student();
       s1.setName("Durgesh");
       s1.setAge(15);


System.out.println("Name :-  "+ s1.getName());
System.out.println("Age  :-  "+ s1.getAge());



    }
}
