package binarysearch;

public class A10_ekoSPOJ {

    static boolean isPossible(int arr[] ,int mid , int m ){

        // mid here is the height where chainsaw is fixed anything lower than that wont cut anything so mid = 10 
        // and height of 1st tree is also 10 so nothing will be cut
        // minimum wood we need is 7 units

        int wood = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int currentWood = ( arr[i] - mid ) ;
            if(currentWood > 0 ){
                wood = wood + currentWood;
            }
        }
        if(wood >= m){
            return true;
        }
        return false;
    }

    static int treeCutting(int arr[] , int m ){
        int start = 1 ;
        int end = arr[arr.length - 1];
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isPossible(arr , mid , m)){
                // true
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10 , 15 , 17 , 20};
        int m = 7;

        System.out.println(treeCutting(arr, m));
    }
}
