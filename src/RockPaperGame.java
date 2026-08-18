import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String input;
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        do{
            System.out.print("Enter your move( rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("You have entered the wrong choice please re-enter from the menu");

            } else {
                computerChoice = choices[random.nextInt(3)];

                System.out.println("Computer choicce:" + computerChoice);
                if (computerChoice.equals("rock")&& playerChoice.equals("rock") || computerChoice.equals("paper") && playerChoice.equals("paper")||computerChoice.equals("scissors")&&playerChoice.equals("scissors")) {
                    System.out.println("Its a tie!");
                }else if(computerChoice.equals("rock") && playerChoice.equals("scissors")|| computerChoice.equals("scissors") && playerChoice.equals("paper")|| computerChoice.equals("paper") && playerChoice.equals("rock") ){
                    System.out.println("Computer won!");
                }else if(computerChoice.equals("scissors") && playerChoice.equals("rock")|| computerChoice.equals("paper") && playerChoice.equals("scissors")|| computerChoice.equals("rock") && playerChoice.equals("paper") ){
                    System.out.println("Player won!");}
            }
            System.out.print("you want to play again(y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("y"));










        scanner.close();
    }


}

