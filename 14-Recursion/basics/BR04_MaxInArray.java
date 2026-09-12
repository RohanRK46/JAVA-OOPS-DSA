package basics;

public class BR04_MaxInArray {

    static void findMax(int arr[] , int i , int max){

        // first base case when entire array is done stop
        if(i >= arr.length ){
            System.out.println(max);
            return;
        }

        // calculaiton
        if(arr[i] > max ){
            max = arr[i];
        }
        i++;

        // recursion
        findMax(arr , i , max );
    }
    public static void main(String[] args) {
        int arr[]  = { 20 , 10 , 50 , 30 , 40 };

        int i = 0;

        int max = Integer.MIN_VALUE;
        // goal to find max in the array using recursion;

        // so i will compare first two elements and get
        //  the max from it and rest will recursion handle

        findMax(arr , i , max);

    }
}
