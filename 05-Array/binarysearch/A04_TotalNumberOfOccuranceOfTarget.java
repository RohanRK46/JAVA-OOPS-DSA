package binarysearch;

public class A04_TotalNumberOfOccuranceOfTarget {
    public static void main(String[] args) {

        int arr[] = {10 , 20 , 30 , 30 , 30 , 30 , 40 , 40  , 50};

        int target = 30;

        int start = 0 ; 
        int end = arr.length - 1; 

        int lowerBound = -1;
        int UpperBound = -1;

        // This will give lower bound :-

        while(start <= end ){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= target ){
                lowerBound = mid ;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        // resetting start and end
        start = 0 ;
        end = arr.length - 1;

        while(start <= end ){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                UpperBound = mid ;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        int Occurance = UpperBound - lowerBound; 
        System.out.println(Occurance);
    }
}
