import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("What item would you like to buy?: ");
        String foodItem=sc.nextLine();
        System.out.print("what is the price for each?: ");
        double price = sc.nextDouble();
        System.out.print("How many would like?: ");
        int quantity=sc.nextInt();

        double finalPrice= price*quantity;

        System.out.println("\nYou have bought "+quantity+" "+ foodItem+"/s");
        System.out.println("Your total is $"+finalPrice);
        sc.close();
    }

}