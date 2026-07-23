public class Menu {

    public static void main(String[]args){
        //Printing all natural numbers
        int n = 10;
        for(int i =1; i<=n;i++){
            System.out.println(i);
        }

        //All even numbers
        for(int i =1; i < 100;i++){
            if(i%2==0){
                System.out.println("Printing out even numbers only");
                System.out.println(i);
            }
        }

        //Printing the summ of all even numbers
        int m = 10;
        int sum =0;
        for(int i =1; i<=m;i++) {
            if(i%2==0){
                sum += i;
            }

        }
        System.out.println("Printingthe sum of all even numbers");
        System.out.println(sum);


        //Printing all odd numbers
        for(int i=1;i<100;i++){
            if(i%2!=0){
                System.out.println("Printing out all odd numbrs");
                System.out.println(i);
            }
        }

        //9, Printing all natural numbers in reverse order
        for(int i=100; i>=1;i--){
            System.out.println("Prinitng prime numbers in reverse order");
            System.out.println(i);
        }



    }
}
