package leetcodeandggquestions;

public class R02_HouseRobberQuestion {

    static int MaxRobbingMoney(int arr[] ,int index){

        if(index > arr.length - 1){
            return 0;
        }
        
        // include
        int IncludedStolenMoney = arr[index] + MaxRobbingMoney(arr, index + 2);

        //exclude
        int ExcludeStolenMoney = 0 + MaxRobbingMoney(arr, index + 1);

        int ans = Math.max(IncludedStolenMoney, ExcludeStolenMoney);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 1};

        int index = 0;

        int ans = MaxRobbingMoney(arr , index);
        System.out.println(ans);
    }
}
