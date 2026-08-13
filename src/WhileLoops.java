import java.util.Scanner;
import java.util.Random;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts=0;
        int randomNumber= random.nextInt(1,11);

        System.out.println("Number Guessing game");



        do{
            System.out.print("Guess the number between 1-10: ");
            guess = sc.nextInt();
            if(guess>randomNumber){
                System.out.println("Your guess is to high");
            }else if (guess < randomNumber){
                System.out.println("Your guess is to low");
            }else{
                System.out.println("You have won");
            }
            attempts+=1;

        }while(guess!= randomNumber);
        //we want to give the user if the guess is high or low from the random number
        //

        System.out.println("You have won the random number was "+guess);
        System.out.println("This was your "+ attempts+ " attempts");

        sc.close();
    }
}
