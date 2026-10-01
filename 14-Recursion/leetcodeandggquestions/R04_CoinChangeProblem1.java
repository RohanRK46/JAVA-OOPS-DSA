package leetcodeandggquestions;

public class R04_CoinChangeProblem1 {

    static int MinCoinCounter(int coins[] ,int index ,int target , int count){

        // base case :: when all the coins have been used;

        if(index > coins.length - 1){
            return Integer.MAX_VALUE;
        }

        if(target < 0){
            return Integer.MAX_VALUE;
        }

        if(target == 0){
            return count;
        }


        int ans = Integer.MAX_VALUE;

        // including :: first coin

        int includeAns = MinCoinCounter(coins, index, target - coins[index], count + 1); 
        
        // exclude :: first coin

        int excludeAns = MinCoinCounter(coins, index + 1, target, count);

        ans = Math.min(includeAns, excludeAns);

        return ans;

    }
    public static void main(String[] args) {
     int target = 11;
     int coins[] = { 1 , 2 , 5 , 10};
     int index = 0;
     int count = 0;

     int ans = MinCoinCounter(coins , index , target , count);
     System.out.println(ans);
    }
}
