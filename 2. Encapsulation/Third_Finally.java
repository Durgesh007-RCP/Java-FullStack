package Exception;

import java.util.Scanner;

public class Third_Finally {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("Ans --> " + a / b);

            System.out.println("Succ");

        } catch (ArithmeticException e) {

            System.out.println("not divisible by 0");


        } finally{
            System.out.println("OKKKKKKKKKKKKKK");
        }


    }
}