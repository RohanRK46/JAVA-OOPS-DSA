package loopandremembering;

public class DP03_ClimbingStairsProblem {

    static int nosWays(int n){
        // what i know for 2 stais there is 2 ways
        // for 3 stairs there is 3 ways
        // after 2 and 3 no of ways is given by adding those two

        int a = 2;
        int b = 3;
        int count = 4;
        int ans = 0;

        if(n == 2) return 2;
        
        if(n == 3) return 3;
        
        while( count <= n ){

            ans = a + b;
            count++;
                
            a = b;
            b = ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int noOfStairs = 6;
        
        System.out.println(nosWays(noOfStairs));
    }
}
