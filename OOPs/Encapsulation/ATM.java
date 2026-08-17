//package Encapsulation;
//
//
//import java.util.Scanner;
//
//class user{
//    private int pin;
//    private double balance;
//
//    public int getPin() {
//        return pin;
//    }
//
//    public void setPin(int pin)
//    {
//        this.pin = pin;
//    }
//
//    public void deposit(double amount) {
//        if(amount > 0 ){
//            balance+=amount;
//        }else{
//            System.out.println("Invalid Amount is Not Negative : ");
//        }
//
//    }
//    public void withdraw(int enteredPin, double withdraw){
//
//     if(enteredPin==pin) {
//         if (balance >= withdraw) {
//             balance-=withdraw;
//         } else {
//             System.out.println("Invalid Withdraw Amount");
//         }
//
//
//     }else {
//         System.out.println("Invalid PIN");
//     }
//
//    }
//
//    public void checkBalance(int enteredPin){
//        if(enteredPin == pin){
//            System.out.println("Available Balance : " + balance);
//        }else{
//            System.out.println("Invalid PIN");
//        }
//
//    }
//}
//public class ATM {
//    public static void main(String args[]){
//
//        Scanner sc=new Scanner(System.in);
//
//        user u=new user();
//        u.setPin(1234);
//        System.out.println("Entered Pin  : ");
//        int enteredPin=sc.nextInt();
//
//        System.out.println("Deposit Your Money : ");
//        double amount =sc.nextDouble();
//
//
//
//
//
//        System.out.println("Withdraw Your Money   : ");
//        double withdraw=sc.nextDouble();
//        u.deposit(amount);
//        u.withdraw(enteredPin, withdraw);
//        u.checkBalance(enteredPin);
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//}
