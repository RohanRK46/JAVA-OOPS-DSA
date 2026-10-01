package leetcodeandggquestions;

import java.util.ArrayList;

public class R07_EqualPartitionProbemReturnArray {

    static void EqualPartition(int arr[] ,int target ,int index ,ArrayList arr1){

        // valid case when its possible
        if(target == 0 ){
            System.out.println(arr1.toString());
            return;
        }
        
        // index out of bound case handle
        if( index > arr.length - 1){
            return; 
        }

        // calculation

        //include first index case
        arr1.add(arr[index]);
        EqualPartition(arr, target - arr[index], index + 1, arr1); 

        // exclud first index case
        arr1.remove(arr1.size() - 1);
        EqualPartition(arr, target , index + 1 , arr1);
    }
    public static void main(String[] args) {
        int arr[] = {10 , 5 , 5 };

        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }

        if(sum % 2 != 0){
            System.out.println("false");
            return;
        }

        int target = sum / 2 ;
        int index = 0;
        ArrayList arr1 = new ArrayList<>();

        EqualPartition(arr , target , index , arr1);
    }
}
