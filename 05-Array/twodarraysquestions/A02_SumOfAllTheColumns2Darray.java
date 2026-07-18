package twodarraysquestions;
import java.util.List;
import java.util.ArrayList;

public class A02_SumOfAllTheColumns2Darray {
    public static void main(String[] args) {

        int arr[][] = {
            {1 , 2 , 3 , 4},
            {5 , 6 , 7 , 8},
            {1 , 6 , 8 , 3}
        };

        List <Integer> columnSum = new ArrayList<>(); 

        int rows = arr.length;
        int columns = arr[0].length;

        for(int i = 0 ; i < columns ; i++ ){
            int colsum = 0;
            for(int j = 0 ; j < rows ; j++){
                colsum = colsum + arr[j][i];
            }
            columnSum.add(colsum);
        }

        System.out.println(columnSum);
    }
}
