package binarysearch;
import java.util.Arrays;

public class A09_AggrisiveCowProblem {

    static boolean isPossible(int arr[] ,int mid ,int k ){

        // here k = max number of cow
        // mid is (min distance betweeen any 2 cows) mid = 5

        int cow = 1 ;
        int lastposition = arr[0];

        for(int current = 0 ; current < arr.length ; current++){

            if(arr[current] - lastposition >= mid ){
                cow++;
                lastposition = arr[current];
            }
            if(cow == k){
                return true;
            }
        }
        return false;
    }

    static int cowPlacement(int arr[] , int k ){
        // arr = stalls
        // k = no of cows


        
        int start = 1; 
        int end = arr[arr.length - 1] - arr[0];

        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if(isPossible(arr , mid , k)){ //true right
                ans = mid;
                start = mid + 1;
            }
            else{
                // false left
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 4, 9};
        Arrays.sort(arr);
        System.out.println(cowPlacement( arr, 3));
        
    }
}