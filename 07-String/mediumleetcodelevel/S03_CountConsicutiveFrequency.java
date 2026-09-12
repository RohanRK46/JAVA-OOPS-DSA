package mediumleetcodelevel;

// Count Consecutive Characters
// I/P = 'a','a','a','b','b','c','c','c','c','d','a','a'
// O/P = a3b2c4da2

public class S03_CountConsicutiveFrequency {

    static String FreqeuncyCountr(Character arr[]){
        StringBuilder ans = new StringBuilder();
        
        int i = 0;

        while(i < arr.length ){
            Character ch = arr[i];
            int count = 1;

            ans.append(ch);

            while(i+1 < arr.length && arr[i+1] == ch ){
                count++;
                i++;
            }
            ans.append(count);
            i++;
        }
        return ans.toString();
    }


    public static void main(String[] args) {
        Character arr[] = {'a','a','a','b','b','c','c','c','c','d','a','a'};
        System.out.println(FreqeuncyCountr(arr));
    }
}
