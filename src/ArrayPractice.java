public class ArrayPractice {
    static void maxValue(int myAr []){
        int max= myAr[0];
        for(int i = 1; i < myAr.length;i++){
            if(myAr[i] > max){
                 max = myAr[i];

            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int myAr [] = {20,23,45,67};
        maxValue(myAr);
    }
}
