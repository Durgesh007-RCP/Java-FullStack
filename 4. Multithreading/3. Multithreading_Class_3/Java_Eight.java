package Multithreading_Three;


// Lambda Expression: A shortcut to write the implementation of a Functional Interface.
@FunctionalInterface // functionalInterface only one abstract methode is Exist
interface Calculator{
public int sum(int a,int b);

}
public class Java_Eight {
    public static void main(String args[]){
       // Calculator c=(a,b)->a+b;  as pn lihata yet
        Calculator c=(a,b)->{
            return a+b;
        };
//                   ^
//                   |
//                   |
//        He compiler internally convert karto:
//
//        Calculator c = new Calculator() {
//
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };

       System.out.println( c.sum(10,10)) ;
    }

}
