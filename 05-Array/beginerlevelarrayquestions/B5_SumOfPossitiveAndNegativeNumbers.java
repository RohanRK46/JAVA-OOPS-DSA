package beginerlevelarrayquestions;

public class B5_SumOfPossitiveAndNegativeNumbers {
    public static void main(String[] args) {
        int arr[] = { -2 , 4 , -5 , 6 , 7 , -4};

        int PositiveSum = 0;
        int NegativeSum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= 0 ){
                PositiveSum = PositiveSum + arr[i];
            }
            else{
                NegativeSum = NegativeSum + arr[i];
            }
        }
    System.out.println("+ve sum : " + PositiveSum);
    System.out.println("-ve sum : " + NegativeSum);
    }
    
}
