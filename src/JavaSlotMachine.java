import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;


        System.out.println("**********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐️");
        System.out.println("**********************");


        while (balance > 0) {
            System.out.println();
            System.out.println("Current Balance is: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient Balance");
                continue;
            } else if (bet < 0) {
                System.out.println("Bet can't be less than $1");
                continue;
            } else {
                balance = balance - bet;
            }
            System.out.println("Spinning....");
            System.out.println("**************");
            row = spinRow();
            payout = payout( row,  bet);
            if(payout>0){
                System.out.println();
                System.out.println("Congratulation you have won");
                balance += payout;
            }else{
                System.out.println();
                System.out.println("Sorry you have lost this round");
            }
            System.out.print("Do you want to play again?(Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                System.out.println("Thanks for playing");
                break;
            }else{
                System.out.println("Lets play again.");
            }

        }


        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐️"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(3)];
            System.out.print(row[i]);
            //we have three different symbol
            //we want to check it two of them are the same symbol
            //if yes add display u r a winner and add the balance
            //if else display u lost and do tyou want to play again
            //decrease from the final amount
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println(" " + String.join("|", row));


    }

    static int payout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;
            };
        }
        return 0;

    }
}
