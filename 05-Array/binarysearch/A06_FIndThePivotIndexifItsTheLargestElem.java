package binarysearch;

public class A06_FIndThePivotIndexifItsTheLargestElem {
    public static void main(String[] args) {
        int arr[] = {4 , 5 , 6 , 7 , 0 , 1 , 2};

        int ref = arr[0];

        // intialising start and end indexes
        int start = 0;
        int end = arr.length - 1 ;

        // to store answer 
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(ref > arr[mid]){
                // i am at 0 , 1 , 2 , i wont find value there so move left side
                end = mid - 1;
            }
            else{
                start = mid + 1;
                ans = mid;
            }
        }

        System.out.println(ans);
    }
}
