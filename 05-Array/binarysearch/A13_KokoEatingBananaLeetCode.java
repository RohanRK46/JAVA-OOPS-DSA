package binarysearch;

public class A13_KokoEatingBananaLeetCode {

    static boolean isPossible(int piles[], int h , long mid ){
        // mid = min amount of banana that i need to eat atlest
        // h = hourse i have in total to consume banana

        int currentTime = 0;

        for(int i = 0 ; i < piles.length ; i++){

            int bananasInCurrentPile = piles[i];
            long bananaLeft = bananasInCurrentPile;

            while(bananaLeft > 0 ){
            // bananas left in 1st pile after eating the least amount will be 
            bananaLeft = bananaLeft - mid ;

            currentTime++;
                // agar mera bananaLeft zero se bda h toh iska mtlb mere banana bache hue h inko bhe khana pdega pehle before moving to next pile
            }
        }
            if(currentTime <= h){
                return true;
            }
            else{
                return false;
            }
    }

    static int minEatingSpeed(int[] piles, int h) {

        int start = 1;

        // Maximum pile is the highest possible speed
        int end = 0;
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            // mid is least amount of bananas to eat per hour

            if (isPossible(piles, h, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int piles[] = {3 , 6 , 7 , 11 };
        
        System.out.println(minEatingSpeed(piles, 8));
    }
}
