package Multithreding_Two;


class Bankaccount{
    int bal =10000;

     synchronized public void withdraw(int amount){
        if(bal>=amount){
            System.out.println(Thread.currentThread().getName() + " is going withdraw a Amount rs : "+amount+ " total bal :" + bal);

            try{
                Thread.sleep(100);

            }catch(Exception e){
                System.out.println("Exception");
            }

            bal=bal-amount;
            System.out.println(Thread.currentThread().getName() + " Withdraw Complete : Remaining Balence : "+bal);

        }else{
            System.out.println(Thread.currentThread().getName() + " In suffciant Balance");

        }
    }
}

class Person extends Thread{
    Bankaccount account;
    Person(String name,Bankaccount account){
        super(name);
        this.account=account;
    }

    public void run(){
        account.withdraw(5000);
    }
}
public class WithSync {

    public static void main(String args[]){
        Bankaccount account =new Bankaccount();

        Person pati =new Person("pati",account);
        Person patani =new Person("patani",account);
        Person child =new Person("child",account);

        pati.start();
        patani.start();
        child.start();

    }

}
