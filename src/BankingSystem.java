import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
         //The steps to create the banking system is
        //step1: create the necssary variables
        //Show the Menu
        //step2: create methods after taking the users input
        // The methods are 1,ShowBalance  2,Deposit  3,Withdraw  4,exit
        Scanner scanner = new Scanner(System.in);
        double balance =100;
        double amount;
        int choice = 0;
        while(choice !=4) {
        System.out.println("*************************");
        System.out.println("Welcome to Bankof America");
        System.out.println("*************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        double newBalance;


            switch (choice) {

                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter how much you want to deposit: ");
                    amount = scanner.nextDouble();
                    System.out.println("You deposited $" + amount + "your now balance is $" + depositAmount(balance, amount));
                    balance = depositAmount(balance, amount);
                    break;
                case 3:
                    System.out.print("Enter how much you want to withdraw: ");
                    amount = scanner.nextDouble();
                    if (amount <= balance) {
                        System.out.printf("You withdraw $%.2f  your new balance is $%.2f" ,amount, withDraw(balance, amount));
                        balance = depositAmount(balance, amount);
                    } else {
                        System.out.println("You cannot withdraw more than your current balance");
                    }
                case 4:
                    System.out.println(" ");
                    System.out.println("GoodBye!");
                default:
                    System.out.println("Thank you for choosing BOFA");
                    System.out.println(" ");

            }
        }
    }

    static double depositAmount(double balance, double amount){
         return balance += amount;

    }
    static double withDraw(double balance,double amount){
        double finalAmount = balance - amount;
        return finalAmount;
    }

}
