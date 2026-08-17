package Encapsulation;




import java.util.Scanner;

 class User{

        private int pin;
        private double balance;

        // Setter for PIN
        public void setPin(int pin) {
            if (pin >= 1000 && pin <= 9999) {
                this.pin = pin;
            } else {
                System.out.println("Invalid PIN");
            }
        }

        // Deposit Money
        public void deposit(double amount) {

            if (amount > 0) {
                balance += amount;
                System.out.println("₹" + amount + " Deposited Successfully.");
            } else {
                System.out.println("Invalid Deposit Amount.");
            }
        }

        // Withdraw Money
        public void withdraw(int enteredPin, double amount) {

            if (enteredPin == pin) {

                if (amount > 0 && balance >= amount) {
                    balance -= amount;
                    System.out.println("₹" + amount + " Withdraw Successful.");
                } else {
                    System.out.println("Invalid Withdraw Amount or Insufficient Balance.");
                }

            } else {
                System.out.println("Invalid PIN");
            }
        }

        // Check Balance
        public void checkBalance(int enteredPin) {

            if (enteredPin == pin) {
                System.out.println("Available Balance : ₹" + balance);
            } else {
                System.out.println("Invalid PIN");
            }
        }

        // Change PIN
        public void changePin(int oldPin, int newPin) {

            if (oldPin == pin) {

                if (newPin >= 1000 && newPin <= 9999) {
                    pin = newPin;
                    System.out.println("PIN Changed Successfully.");
                } else {
                    System.out.println("New PIN must be 4 digits.");
                }

            } else {
                System.out.println("Old PIN is Incorrect.");
            }
        }
    }

public class atn {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            User user= new User();

            // Initial PIN
            user.setPin(1234);

            // Deposit
            System.out.print("Enter Deposit Amount : ");
            double deposit = sc.nextDouble();
            user.deposit(deposit);

            // Withdraw
            System.out.print("\nEnter PIN : ");
            int enteredPin = sc.nextInt();

            System.out.print("Enter Withdraw Amount : ");
            double withdraw = sc.nextDouble();

            user.withdraw(enteredPin, withdraw);

            // Balance
            System.out.println();
            user.checkBalance(enteredPin);

            // Change PIN
            System.out.println("\n------ Change PIN ------");

            System.out.print("Enter Old PIN : ");
            int oldPin = sc.nextInt();

            System.out.print("Enter New PIN : ");
            int newPin = sc.nextInt();

            user.changePin(oldPin, newPin);

            // Check Balance with New PIN
            System.out.println("\nCheck Balance Using New PIN");

            System.out.print("Enter PIN : ");
            int checkPin = sc.nextInt();

            user.checkBalance(checkPin);

            sc.close();
        }
    }

// The best real-life example of Encapsulation is an ATM Machine.
//
// In an ATM, the balance and PIN are hidden from the user. The user cannot access or modify them directly.
// Instead, the user performs operations like deposit(), withdraw(), checkBalance(), and changePin() through the ATM interface.
//
// This is called Encapsulation because the data is hidden and can be accessed only through public methods.