package sortingarray;
import java.util.Arrays;

public class S01_WorstBruteForceForZerosAndOnes {
    public static void main(String[] args) {
        int arr[] = {1 , 1, 0 , 0 , 1 , 0 , 1 , 0 , 1};
        
        Arrays.sort(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }    
}
