package Constructer;


class Account{
    String accountNumber;
    String HolderName;

    double Balance;

    Account(String inputaccountNumber,String inputHolderName,double inputBalance){
       if(inputBalance >= 0 ){
        this.accountNumber=inputaccountNumber;
        this. HolderName=inputHolderName;
        this.Balance=inputBalance;
}else{
           this.accountNumber=inputaccountNumber;
           this. HolderName=inputHolderName;
           this.Balance=0;
           System.out.println("Invalid Balance!");
       }
    }



    void display(){
        System.out.println("Account No      : "+accountNumber);
        System.out.println("Account Holder  : "+HolderName);
        System.out.println("Avilable Balance: "+Balance);

        System.out.println(" ");
    }



}
public class BankAccountValidation {
    public static void main(String args[]){

        Account A1=new Account("101","durgesh",500.5);
        Account A2=new Account("102","Patil",-500.5);


        A1.display();
        A2.display();
    }
}
