package quicksort;

import java.lang.reflect.Array;
import java.util.Arrays;

// in this to place pivot element we will use count method

public class QS01_BasicQuickSort {

    static int SortingOneElement(int arr[] , int start , int end){
        
        int pivotElement = arr[start];
        int count = 0;

        for(int i = start ; i <= end ; i++){
            if(arr[i] < pivotElement){
                count++;
            }
        }

        int pivotIndex = count + start;

        // we have successfully placed pivot index in correct index

        int temp = arr[pivotIndex];
        arr[pivotIndex] = pivotElement;
        arr[start] = temp;

        // now sorting rest of the elements
        int i = start;
        int j = end;
        
        while( i < pivotIndex && j > pivotIndex ) {
            if(arr[i] > pivotElement && arr[j] < pivotElement)
            {
                int temp2 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp2;

                i++;
                j--;
            }
            
            if(arr[i] < pivotElement){
                i++;
            }

            if(arr[j] > pivotElement){
                j--;
            }
        }

        return pivotIndex;
    }

    static void quickSort(int arr[] , int start , int end){
        // when start and end lies on same index
        if(start == end){
            return;
        }

        // invalid case
        if(start > end ){
            return;
        }

        int pivot = SortingOneElement(arr , start , end);

        // recursion to solve elements smaller than pivot (Left)
        quickSort(arr, start, pivot - 1);

        // recursion to solve elements greater than pivot (Right);
        quickSort(arr, pivot + 1, end);

    }
    public static void main(String[] args) {
        int arr[] = {8 , 9 , 7 , 6 , 5 , 4 , 3 , 1 , 2};

        int start = 0;
        int end = arr.length - 1;

        quickSort(arr , start , end);
        System.out.println(Arrays.toString(arr));
        
    }

    
}
