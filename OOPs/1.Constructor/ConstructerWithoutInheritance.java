package Constructer;

class Animal{

    Animal(){
        System.out.println("Animal Call By using Constucter");
    }
}
class Dog extends Animal{
    Dog(){

    }
}
public class ConstructerWithoutInheritance {

    public static void main(String args[]){

        Dog d=new Dog();
    //    d.Animal();// throw error

    }
}
// manje Constructer inherit hot nahi te fkt object creat hotach call hot
// pn JVM atomatiocally Child class madhe super() add karat