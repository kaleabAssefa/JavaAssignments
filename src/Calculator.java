import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validResult=true;

        System.out.print("Enter the first number: ");
        num1=sc.nextDouble();
        System.out.print("Enter an operator: ");
        operator=sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2=sc.nextDouble();

        switch(operator){
            case '+'-> result = num1+num2;
            case '-'->result= num1-num2;
            case '*'->result=num1*num2;
            case '/'->{
                if(num1==0 || num2 == 0){
                    System.out.println("You can't divide the number 0");
                    validResult= false;
                }else{
                    result=num1/num2;
                }
            }
            default->{
                System.out.println("Wrong operation please try the right operators");
            }
        }
        if(validResult){
            System.out.println("Your final result is: "+result);
        }





        sc.close();

    }
}
