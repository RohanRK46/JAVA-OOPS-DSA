package slidingwindow;

import java.util.Arrays;

public class SW02_KeepingTrackOfindexToFindSubArray {
        static int FirstIndexOfMaxSubArray(int arr[] , int m){

        int i = 0;
        int j = 0;
        int maxStart = i;

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
            maxStart = i;
        }
        
        // this loop will terminates after j reached to last index
        while(j < arr.length){
            currentSum = currentSum + arr[j];
            currentSum = currentSum - arr[i];
            
            i++;
            j++;

            if(currentSum > max){
                max = currentSum;
                maxStart = i;
            }
            
        }
        return maxStart;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int m = 3;

        int startIndex = FirstIndexOfMaxSubArray(arr, m);

        int ans[] = new int[m];

        //suppose start index is 2 , so i need to print 2 , 3 , 4
        for(int i = 0 ; i < m ; i++){
            ans[i] = startIndex;
            startIndex++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
