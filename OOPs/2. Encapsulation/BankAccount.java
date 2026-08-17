package Encapsulation;

import java.util.Scanner;

class Account{
    private String accountHolder;
    private int accountNumber;

    private double balance;


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {

        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if(accountNumber >0){
            this.accountNumber = accountNumber;
        }else{
            System.out.print("Invalid Please Check.............: " );

        }
    }



    public void deposit(double deposit){
         if(deposit >0 ){
            balance+=deposit;
        }else{
            System.out.println("Invalid Deposit Amount");
        }


    }
public void withdraw( int withdraw) {

    if (withdraw > 0 && balance >= withdraw ) {
        balance -= withdraw;

    } else {
        System.out.println("Invalid Withdraw");
    }
}

public void DisplayAccount(){

    System.out.println("================================");
    System.out.println("Account Holder : " + accountHolder);
    System.out.println("Account Number : " + accountNumber);
    System.out.println("Available Balance : " + balance);
    System.out.println("================================");

}
}
public class BankAccount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Deposit Money : ");
        double deposit= sc.nextInt();

        System.out.print("Withdraw     : ");
        int withdraw = sc.nextInt();



        Account a=new Account();

        a.deposit(deposit);
        a.withdraw(withdraw);

        a.setAccountHolder("Durgesh");
        a.setAccountNumber(6293);





        a.DisplayAccount();




    }

}
