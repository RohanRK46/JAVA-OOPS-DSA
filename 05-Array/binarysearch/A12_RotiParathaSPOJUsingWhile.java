package binarysearch;

public class A12_RotiParathaSPOJUsingWhile {

    static boolean isPossible(int Rank[] , int mid , int n , int I){
        // mid = total time i have to cook roties mid = 110
        // i = number of cheffs 
        // n = total number of roties

        int parathasCooked = 0;

        for(int R = 0 ; R < Rank.length ; R++){
            int currentRank = Rank[R] ;
            int i = 1;
            int totalTime = 0;
            while(totalTime <= mid){
                if(totalTime + currentRank * i <= mid){
                    parathasCooked++;
                    totalTime = totalTime + currentRank * i;
                    i++;
                }
                else{
                    break;
                }
            }
        }
        if(parathasCooked >= n){
            return true;
        }
        else{
            return false;
        }
    }

    static int minTimeToCookAllParathas(int Rank[] , int I , int n ){
        // what i need to find : in how many minuits n number of roties can be cooked
        // with I number of cooks of individal rank
        
        int lastRank = Rank[Rank.length - 1];
        
        // end = slowest cook ki last roti kitne der mai banegi woh mera range ka last hoga 
        // 4 , 8 , 12 ..... 4(10) 
        
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = sum + lastRank * i ;
        }
        
        int start = 1;
        int end = sum;

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isPossible(Rank , mid , n , I)){
                // true then its potential ans
                ans = mid;
                // move left
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int Rank[] = {1,2,3,4};
        int I = 4; // number of cooks
        int n = 10; // number of paratha

        System.out.println(minTimeToCookAllParathas( Rank , I , n ));
    }
}
