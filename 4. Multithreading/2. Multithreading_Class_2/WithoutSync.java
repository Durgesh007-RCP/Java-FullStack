//package Multithreding_Two;
//
//class BankAccount{
//    int bal =10000;
//
//     void Withdraw(int amount){
//        if(bal>=amount){
//            System.out.println(Thread.currentThread().getName() + " is going withdraw a Amount rs : -"+amount);
////
//            try{
//                Thread.sleep(200);
//
//            }catch(Exception e){
//                System.out.println("Exception");
//            }
//
//            bal=bal-amount;
//            System.out.println(Thread.currentThread().getName() + " Withdraw Complete : Remaining Balence : -"+bal);
//
//        }else{
//            System.out.println(Thread.currentThread().getName() + " In suffciant Balance");
//
//        }
//    }
//}
//
//class person extends Thread{
//    BankAccount account;
//    person(String name,BankAccount account){
//         super(name);
//         this.account=account;
//    }
//
//    public void run(){
//        account.Withdraw(5000);
//    }
//}
//public class WithoutSync {
//
//    public static void main(String args[]){
//        BankAccount account =new BankAccount();
//
//        person pati =new person("pati",account);
//        person patani =new person("patani",account);
//
//        pati.start();
//        patani.start();
//
//    }
//
//}
