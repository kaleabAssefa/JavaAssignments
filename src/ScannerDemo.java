import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int socail=scanner.nextInt();
        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter the year to check if is a leap year: ");
        int year = scanner.nextInt();
        boolean leapYear=(year%400==0)||(year%4==0&&year%100!=0);
        if(leapYear == true){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}
