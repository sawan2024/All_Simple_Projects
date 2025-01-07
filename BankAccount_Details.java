/**
 * @see <a href==https://docs.oracle.com/en/java/javase/14/docs/api/index.html>Java<a/>
 */

import java.util.Scanner;

//Classes:
//
//BankAccount: Represents a generic bank account.
//Main: Entry point for the system.
//Attributes (in BankAccount):
class Account_Details1{
    String Account_Number;
    String User_Name;
    double Balance;
    Account_Details1(String Account_Number,String User_Name,double Balance){
        this.Account_Number = Account_Number;
        this.User_Name = User_Name;
        this.Balance = Balance;
    }
    //Deposit Method insufficient
    public void Deposit(double amount) {
        if (Balance > 0) {
            System.out.println("Add amount successful : " + Balance + ".");
        } else {
            System.out.println("Invalid Input Try Again.");
        }
    }
//    withdraw Amount
    public void withdraw(double amount){
        if (Balance <= amount && amount > 0 ){
            Balance -=amount;
            System.out.println("Successful withdraw : "+amount);
    }else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }
    public double getBalance(){
            return Balance;
        }
//        display Account Details
        public void Display_details(){
            System.out.println("Account Number: " + Account_Number);
            System.out.println("Account Holder: " + User_Name);
            System.out.println("Balance: " + Balance);
        }
}
public class BankAccount_Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String Account_Number = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String User_Name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double Balance = scanner.nextDouble();
        Account_Details1 account = new Account_Details1(Account_Number,User_Name,Balance);

        int choice;
        do {
            System.out.println("\n--- Bank Account System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.Deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    account.Display_details();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}


