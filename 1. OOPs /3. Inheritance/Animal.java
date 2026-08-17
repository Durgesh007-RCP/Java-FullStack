package Inheritance;



 class Animals {
    Animals(){
        System.out.println("Animal Constructor");
    }
    void eat(){
        System.out.println("Eating");

    }
}
class Dog extends Animals{

    Dog(){
        System.out.println("Dog Constructer");

    }

    void bark(){
        System.out.println("Dog Bark");
    }
}
public class Animal{
    public static void main(String args[]){

        Dog d=new Dog();

        d.bark();
        d.eat();
    }
}

//How inheritance Work Internally

// firstly i create a object of child class so it can be access both child and parents Member
// so first execute parent constructer then child constructer by using super() keyword and after execute methode
//it can be first search in child class if method is found so it's execute if not found it's search in parent class
// that type inheritance is work properly