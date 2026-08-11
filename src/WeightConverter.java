import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lbs;
        double kgs;
        int option;
        double finalKgs;
        double finalLbs;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to Kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        option = sc.nextInt();
        if(option == 1){
            System.out.print("Enter the weight in lbs: ");
            lbs = sc.nextDouble();
            finalKgs = lbs * 0.453592;
            System.out.printf("Your weight in kilo is %.2f", finalKgs);
        }else if(option == 2){
            System.out.print("Enter the weight in Kgs: ");
            kgs = sc.nextDouble();
            finalLbs = kgs * 2.20462;
            System.out.printf("Your weight in lbs is %.2f", finalLbs);

        }else{
            System.out.println("Invalid option");
        }




        sc.close();

    }

}
