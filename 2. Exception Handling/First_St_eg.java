package Exception;

public class First_St_eg {
    public static void main(String args[]){

        int age=16;


        try{
            if(age < 18){
               throw new ArithmeticException("Ege is not Above 18");
            }
            System.out.println("Registration Succesfull");
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}
