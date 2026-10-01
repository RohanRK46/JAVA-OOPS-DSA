package leetcodeandggquestions;

public class R03_CoinChangeProblem2 {

    static int PossibleChanges(int coins[] ,int target , int index){

        if(index >= coins.length){
        return 0;
        }

        if(target == 0){
            return 1;
        }

        if(target < 0){
            return 0;
        }

        int value = coins[index];
        // including case 1 coin :: coin 1
        int includeAns = PossibleChanges(coins, target - value, index);

        // exclude case 1 coin :: coin 1
        int excludeAns = PossibleChanges(coins, target, index + 1);

        int finalAns = includeAns + excludeAns;
        return  finalAns; 
    }
    public static void main(String[] args) {
        int coins[] = {1 , 2 , 5 , 10};
        int target = 55;
        int index = 0;

        int ans = PossibleChanges(coins , target , index );
        System.out.println(ans);
    }
}
