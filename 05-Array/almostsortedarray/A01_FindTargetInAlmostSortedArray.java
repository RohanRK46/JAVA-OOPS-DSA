package almostsortedarray;

public class A01_FindTargetInAlmostSortedArray {

    static int FindElementInAlmostSortedArray(int arr[] , int k){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // this will fetch mid values

            if(arr[mid - 1] >= 0 && mid - 1 == k)
                return mid-1;
            if(arr[mid] == k)
                return mid;
            if(arr[mid + 1] < arr.length && mid+1 == k)
                return mid+1;

            // moving left or right based on mid

            if( arr[mid] > k ){
                // move left
                end = mid - 2 ;
            }
            else{
                start = mid + 2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3 , 5 , 10 , 9 , 11};
        int k = 10;
        System.out.println( FindElementInAlmostSortedArray(arr , k) );
    }
}
