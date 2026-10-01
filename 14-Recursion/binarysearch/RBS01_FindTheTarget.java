package binarysearch;

public class RBS01_FindTheTarget {

    static int BinarySearch( int arr[] , int s , int e , int target){
    // BC
    if(s > e){
        return -1;
    }

    // Operation
    int mid = s + (e - s) / 2;

    if(arr[mid] == target){
        return mid;
    }
    if(arr[mid] > target){
        e = mid - 1;
    }
    else{
        s = mid + 1;
    }
    
    // Recursive call
    return BinarySearch(arr , s , e, target);

    }
    public static void main(String[] args) {
        int arr[] = { 30 , 40 , 50 , 60 , 70 , 80 , 90 };
        
        int target = 50;
        int s = 0;
        int e = arr.length - 1;

        System.out.println(BinarySearch(arr , s , e , target));
    }
}
