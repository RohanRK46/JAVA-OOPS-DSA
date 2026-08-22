package binarysearch;

// we dont know the length of array so we cant use arr.length

public class A15_UnboundedSearch {

    static int getEndIndex(int arr[] , int target ){

        int i = 1;

        if(arr[0] == target){
            return 0;
        }
        else{
            while(arr[i] <= target){
                i = i * 2;
            }
        }
        return i;
    }

    static int binarySearch(int arr[] , int target){
        int end = getEndIndex(arr , target);
        int start = end / 2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47};
        int target = 9;

        System.out.println(binarySearch(arr , target));
    }
}
