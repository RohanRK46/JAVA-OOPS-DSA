package slidingwindow;

// basic sliding window question

public class SW01_highestSumOfSubArray {

    static int sumOfMaxSubArray(int arr[] , int m){

        int i = 0;
        int j = 0;

        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        while( j < m ){
            currentSum = currentSum + arr[j];
            j++;
        }
        // after while loop terminates j = 3;


        // assiging max its new value
        if(currentSum > max){
            max = currentSum;
        }
        
        // this loop will terminates after j reached to last index
        while(j < arr.length){
            currentSum = currentSum + arr[j];
            currentSum = currentSum - arr[i];
            
            i++;
            j++;

            if(currentSum > max){
                max = currentSum;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int m = 3;

        System.out.println(sumOfMaxSubArray(arr, m));
    }
}