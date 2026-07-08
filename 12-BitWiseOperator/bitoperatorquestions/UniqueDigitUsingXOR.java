package bitoperatorquestions;

public class UniqueDigitUsingXOR {
    public static void main(String[] args) {
        int arr[] = {22 , 12 , 13 , 13 ,12 , 22 , 53 , 33 , 33};

        int uniqueNum = 0;

        for(int a : arr){
            uniqueNum = uniqueNum ^ a;
        }

        System.out.println("Unique Number is : " + uniqueNum);
    }
}
