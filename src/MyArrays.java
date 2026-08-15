import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Enter the number of foods:");
        size = scanner.nextInt();
        String[] foods = new String[size];
        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        for (String food : foods) {
            System.out.println(food);

        }
        scanner.close();

    }

}
