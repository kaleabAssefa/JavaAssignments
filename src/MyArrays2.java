public class MyArrays2{
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6};
        int target = 6;
        for(int i =0; i<numbers.length;i++){
            if(target == numbers[i]){
                System.out.println("Element is found at index "+i);
            }
        }
    }

}
