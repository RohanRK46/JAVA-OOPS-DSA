package leetcodeandggquestions;

public class R05_CoinChangeProblemWorsCase {

    static int Solve(int coins[] , int target){

        if(target == 0){
            return 0;
        }

        if( target < 0 ){
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;

        for(int i = 0 ; i < coins.length ; i++ ){

            int coinValue = coins[i];

            int recAns = Solve(coins, target - coinValue);

            if(recAns != Integer.MAX_VALUE){
                int totalCoinUsed = 1 + recAns;
                mini = Math.min(mini, totalCoinUsed);
            }

        }
        return mini;
    }
    public static void main(String[] args) {

    int coins[] = {1 , 2 , 5 , 10 };

    int target = 6;

    int ans = Solve(coins , target);
    System.out.println(ans);
    }
}
