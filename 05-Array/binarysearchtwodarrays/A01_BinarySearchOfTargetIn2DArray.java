package binarysearchtwodarrays;

// in this case last element of any row is smaller than the first element of next row

import java.util.Arrays;

public class A01_BinarySearchOfTargetIn2DArray {

    static int[] binarySearchIn2DArray(int arr[][] , int target){

        int NosRows = arr.length;
        int NosCols = arr[0].length;

        int totalElement = NosCols * NosRows;

        int start = 0;
        int end = totalElement - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int midRow = mid / NosCols;
            int midCol = mid % NosCols;

            if(arr[midRow][midCol] == target){
                return new int[]{midRow,midCol};
            }
            
            if(arr[midRow][midCol] < target ){
                // move right
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
    
        int arr[][] = {
            {1 , 3 , 5 , 7},
            {10 , 11 , 16 , 20},
            {23 , 30 , 34 , 60}
        };

        System.out.println(Arrays.toString(binarySearchIn2DArray(arr, 30)));

        // so there are total 3 * 4 numbers in this 2D array so 12 - 1 = last element

    }

}
