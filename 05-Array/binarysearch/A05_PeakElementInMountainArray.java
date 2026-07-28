package binarysearch;

public class A05_PeakElementInMountainArray {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 76 , 65 , 44};

        int start = 0 ;
        int end = arr.length - 1;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start) / 2 ;

            if(arr[mid] > arr[mid + 1]){
                ans = mid ;
                end = mid - 1; 
            }
            else{
                start = mid + 1 ;
            }
        }
    }
}
