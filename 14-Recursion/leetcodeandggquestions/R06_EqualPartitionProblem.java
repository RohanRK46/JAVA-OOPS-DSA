package leetcodeandggquestions;

public class R06_EqualPartitionProblem {
    static boolean EqualPartition(int arr[] , int index ,int target , int value){

        if(value == target){
            return true;
        }

        if(index > arr.length - 1){
            return false;
        }

        // this handles odd number cause its impossible to get equal partition 
        if(target % 2 != 0){
            return false;
        }

        // first index include case
        boolean includeAns = EqualPartition(arr, index + 1, target - arr[index], value + arr[index]);

        // exclude first index

        boolean excludeAns = EqualPartition(arr, index + 1, target, value);

        return includeAns || excludeAns;

    }
    public static void main(String[] args) {
        int arr[] = { 10 , 5 , 3 , 2 };

        int index = 0;

        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }

        if(sum % 2 != 0){
            System.out.println("false");
            return;
        }

        int target = sum / 2;
        int value = 0;

        System.out.println(EqualPartition(arr , index , target , value));
    }
}
