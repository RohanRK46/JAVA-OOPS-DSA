package loopandremembering;

public class DP01_JumpingProblem {

    static boolean canJump(int arr[]){

        // we are starting from index = 0
        int start = 0;
        int max = 0;
        int goal = arr.length - 1;
        
        while(start < arr.length){

            if(start > max){
                return false;
            }

            int maxJumpPossible = 0;
            maxJumpPossible = start + arr[start];
            start++;

            if(maxJumpPossible > max){
                max = maxJumpPossible;
            }
        }

        if(max >= goal){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}