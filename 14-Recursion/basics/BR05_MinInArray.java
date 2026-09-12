package basics;

public class BR05_MinInArray {

    static void minInArray(int arr[] , int i , int min ){

        // Base case
        if(i >= arr.length){
            System.out.println(min);
            return;
        }

        // computation
        if(arr[i] < min){
            min = arr[i];
        }
        i++;

        // recursion
        minInArray(arr, i, min);
    }
    public static void main(String[] args) {
        int arr[] = { 20 , 10 , 50 , 30 , 40 };

        // min will be used to track the min value :: main purpose
        int min = Integer.MAX_VALUE;

        // i will be used to track index
        int i = 0;

        minInArray(arr , i , min );
    }
}
