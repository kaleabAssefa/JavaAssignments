import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String email;
       String userName;
       String domain;
        System.out.print("Enter you email: ");
        email = sc.nextLine();

        if(email.contains("@")){
            userName = email.substring(0,email.indexOf("@"));
            System.out.println("Your user name is: "+ userName);
            domain = email.substring(email.indexOf("@")+1);
            System.out.println("Your domain is: "+ domain);
        }else{
            System.out.println("Please enter a valid email");
        }




        sc.close();
    }
}