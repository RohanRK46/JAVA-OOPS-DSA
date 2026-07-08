package arraymanipulationproblem;

import java.util.Arrays;

public class A01_ArraySort {
    public static void main(String[] args) {

        int arr[] = { 2 , 4 , 6 , 8 , 10};

        int i = 0;
        int j = arr.length - 1;
        
        while (i <= j ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    System.out.println(Arrays.toString(arr));
    }
}
