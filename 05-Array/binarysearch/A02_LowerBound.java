package binarysearch;

// target = lower bound 
// lower bound when element is not present in array;

public class A02_LowerBound {
    public static void main(String[] args) {

        int target = 35;

        int arr[] = { 10 , 20  , 30 , 40 , 50 , 60 , 70};

        int start = 0;
        int end = arr.length - 1;

        int ans = 0;
        // we know : start index , end index 
        // we need to find either lowest index of target or index of element which is just
        // bigger than target ( smallest index of all elements bigger than taregt )
        // we know to find taregt we use binary search


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                // if mid = target (1st conditon either this is the only index for target )
                // (2nd condition there will be target of smaller index as well)
                // there fore we wont consider it answer but will store it just in case if we dont
                // find tager in smaller index

                ans = mid;
                // index store

                // why did we move end to left and not start to right because we need smaller index
                end = mid - 1;
            }

            else if(target < arr[mid] ){
                // let suppose target is 35 and arr is = 10 20 30 40 50 mid = 30
                // if element is not present - moving right 
                ans = mid;

                end = mid - 1;
            }
            else{
                // target > mid move right
                start = mid + 1;
            }
        }
    System.out.println( ans );
    }
}