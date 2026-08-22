package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Sum2 {

    static int[] twoSum(int[] nums, int target) {

        Map <Integer , Integer> record = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            
            int requiredElem = target - nums[i];

            if(record.containsKey(requiredElem)){
                // true
                return new int[]{ record.get(requiredElem) , i};
                
            }
            record.put(nums[i] , i );
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = {2 , 7 , 11 , 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}