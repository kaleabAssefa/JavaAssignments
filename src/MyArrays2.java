import java.util.Scanner;

public class MyArrays2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods ={"Pizza","Burger","Hotdog","Smotthie"};
        System.out.print("Enter the food you want to find from the menu: ");
        String target = scanner.nextLine();
        boolean isTrue=false;
        for(int i =0; i<foods.length;i++){
            if(foods[i].equals(target)){
                System.out.println("Element is found at index "+i);
                isTrue = true;
            }
        }
        if(isTrue==false){
            System.out.println("We don't have the food in our menu");
        }

        scanner.close();
        System.out.println(add(1,2,4));
        System.out.println(average(10,20,30,40));

    }
    static int add(int...numbers){
        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
        return sum;
    }

    static int average(int...numbers){
        int sum = 0;
        int avr=0;
        for(int i =0;i<numbers.length;i++){
            sum+=numbers[i];
            System.out.println("The elements of numbers"+i);
        }
        System.out.println("Total elements are after the average is "+avr);
        return sum/numbers.length

    }

}
