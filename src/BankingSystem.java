import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atmPin = 12345;
        int atm = 123;

        double balance = 100;
        int options = 1;
        double amount = 0;
        System.out.print("Please Enter your Atm number: ");
        int userAtmPin = scanner.nextInt();
        if (atmPin == userAtmPin) {
            System.out.print("Please enter you atm pin: ");
            int userPin = scanner.nextInt();
            if (atm == userPin) {
                while (options != 4) {
                    System.out.println("******************");
                    System.out.println("BANKING PROGRAM");
                    System.out.println("******************");
                    System.out.println("1. Show Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.println("******************");
                    System.out.print("Enter your choice: ");
                    options = scanner.nextInt();
                    switch (options) {
                        case 1:
                            System.out.println("Your balance is $" + balance);
                            break;
                        case 2:
                            System.out.print("Enter how much you want to deposit: ");
                            amount = scanner.nextDouble();
                            balance = deposit(amount, balance);
                            System.out.println("Your balance is: $" + balance);
                            break;
                        case 3:
                            System.out.print("How much money you want to with draw?: ");
                            amount = scanner.nextDouble();
                            if (amount <= balance) {
                                balance = withdraw(amount, balance);
                                System.out.println("Your current balance is: " + balance);
                            } else {
                                System.out.println("You cant withdraw more than your balance");
                            }
                            break;
                        case 4:
                            System.out.println("Thanks for choosing our Bank");
                            break;
                        default:
                            System.out.println("Please choose the right menu");
                    }
                }

            } else {
                System.out.println("Wrong pin");
            }
        } else {
            System.out.println("Wrong Atm number try again!");
        }
        scanner.close();
    }

    static double deposit(double amount, double balance) {
        return balance += amount;

    }

    static double withdraw(double amount, double balance) {
        return balance -= amount;
    }

}