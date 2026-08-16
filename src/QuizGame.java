import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //options 2d array
        //declare virable
        //welcome message
        //Question(loop)
            //option
            //CHECK GUESS FROM USER
            //CHECK OUT GUESS
        //DISPLAY FINAL RESULT

        //Array of questions
        String[] questions={"Which Scanner method is normally used to read an int?",
                "How do you read a char using Scanner?",
                "Which loop is commonly used when you know how many times you want to repeat something?",
                "What does scanner.nextLine() do?"};
        String[][] options={{"1, scanner.nextLine()", "2,scanner.nextInt()","3,scanner.getInt()","4,scanner.readInt()"},
                {"1,scanner.nextChar()","2,scanner.charAt(0) ","3,scanner.next().charAt(0) ","4,scanner.nextCharacter()"},
                {"1,if ","2,switch ","3,for","4,try"},
                {"1,Reads only one character","2,Reads only an integer","3,Reads an entire line of text","4,Reads only the first word"}
        };
        int[] answers={2,2,3,3};
        int score = 0;
        int guess;

        System.out.println("*******************************");
        System.out.println("Welcome to java questions quiz");
        System.out.println("*******************************");
        System.out.println();

        for(int i = 0;i<questions.length;i++){
            System.out.println();
            System.out.println(questions[i]);
            for(String option:options[i]){

                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess= scanner.nextInt();
            if(guess==answers[i]){
                System.out.println("***************");
                System.out.println("Correct answer");
                System.out.println("***************");
                score+=1;
            }else{
                System.out.println("-------------");
                System.out.println("Wrong answer");
                System.out.println("-------------");
                if(score<=0){
                    score =0;
                }else{
                    score-=1;
                }
            }


        }

        System.out.println();
        System.out.println("Your final socre is "+ score +" out of "+questions.length);

    scanner.close();
    }
}
