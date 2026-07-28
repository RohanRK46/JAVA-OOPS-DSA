package binarysearch;

// Upperbound
public class A03_UpperBound {
    public static void main(String[] args) {
        int arr[] = { 10 , 20  , 30 , 40 , 50 , 60 , 70};

        int target = 35;

        int start = 0 ;
        int end = arr.length - 1;

        int ans = -1 ;

        while(start <= end ){
            int mid = start + (end - start) / 2;
            if ( arr[mid] > target ){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1 ;
            }
        }
    System.out.println("Upper Bound : " + ans);
    }
}
