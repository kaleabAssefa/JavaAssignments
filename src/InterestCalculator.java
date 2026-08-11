import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principalAmount;
        double interestRate;
        int compundYear;
        int numberOfYears;
        double finalAmount;

        System.out.print("Enter the Principal amount: ");
        principalAmount = sc.nextDouble();
        System.out.print("Enter the interest rate(in %): ");
        interestRate = sc.nextDouble();
        System.out.print("Enter the # of times compunded per year: ");
        compundYear=sc.nextInt();
        System.out.print("Enter # of years: ");
        numberOfYears=sc.nextInt();

        finalAmount = principalAmount* Math.pow(1+interestRate/compundYear,compundYear*numberOfYears);

        System.out.printf("The amount after %d is $%.2f ",compundYear,finalAmount );

        sc.close();
    }
}
