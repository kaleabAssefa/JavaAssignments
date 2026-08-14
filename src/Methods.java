public class Methods {
    public static void main(String[] args) {
        birthDays();
        birthDays();
        square(3);
        System.out.println(square(3));
        String firstName = "Kaleab";
        String lastName="Assefa";
        System.out.println(names(firstName,lastName));

        System.out.println(ages(18));

    }
    static void birthDays(){
        System.out.println("Happy brithday");
        System.out.println("Birthdays");
    }
    static double square(double number){
        return number * number;
    }
    static String names(String firstName, String lastName){
        return firstName +" "+ lastName;
    }
    static boolean ages(int age){
        return age >=18;
    }
}
