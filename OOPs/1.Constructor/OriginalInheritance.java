package Constructer;

class Animals{
    void eat(){
        System.out.println("Animal is eating");

    }
}
class Dogs extends Animals{

}
public class OriginalInheritance {
    public static void main(String args []){

        Dogs D =new Dogs();
        D.eat();
    }
}
//Can Constructor be final? (Interview Notes)
//Answer
//
//No, a constructor cannot be declared final.
//
//Reason
//
//The main purpose of the final keyword is to prevent overriding.
//
//But a constructor is never inherited by the child class, so it cannot be overridden.
//
//        Therefore, writing final before a constructor has no meaning, and Java does not allow it.





//Method
//      ↓
//Inherited ✅
//        ↓
//Can Override ✅
//        ↓
//final → Stops Overriding
//
//----------------------------------
//
//Constructor
//      ↓
//Inherited ❌
//        ↓
//Cannot Override ❌
//
//final → No Meaning ❌