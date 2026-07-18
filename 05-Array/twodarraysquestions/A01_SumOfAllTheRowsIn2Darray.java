package twodarraysquestions;
import java.util.List;
import java.util.ArrayList;

public class A01_SumOfAllTheRowsIn2Darray {
    public static void main(String[] args) {
        
        List <Integer> sumcollection = new ArrayList<>();

        int arr[][] = {
            {1 , 2 , 3},
            {4 , 5 , 6},
            {7 , 8 , 9}
        };

        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0 ;
            for(int j = 0 ; j < arr[0].length ; j++){
                sum = sum + arr[i][j];
            }
            sumcollection.add(sum);
        }

        System.out.println(sumcollection);
    }
}
