// package leetcodeandggquestions;

// public class R08_BruteForceRecursionOfEqualPartition {

//     static boolean EqualPartitionPossible(int arr[]){
//         int sum = 0;
//         for(int i : arr){
//             sum = sum + i;
//         }

//         if(sum % 2 != 0){
//             return false;
//         }

//         int target = sum / 2;


//         int currentSum = 0;
//         int leftOver = 0;

//         for(int i = 0 ; i < arr.length ; i++){
            
//             if(arr[i] > target ){
//                 continue;
//             }
//             else{
//                 currentSum = currentSum + arr[i];
//             }
            
//             if(currentSum < target){
//                 continue;
//             }
//             else{
//                 leftOver = currentSum;
//                 currentSum = 0;
//             }
//         }



//     }
//     public static void main(String[] args) {
//     int arr[] = {1 , 5 , 11 , 5};
//     System.out.println(EqualPartitionPossible(arr));
//     }
// }
