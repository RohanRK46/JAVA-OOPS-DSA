package mediumleetcodelevel;

import java.util.Map;
import java.util.HashMap;

// Goal :: freq counting , max freq return :: before return if there are multiple 
// character with max freq :: then return the one will lower ASCII value

public class S02_MostFrequencyCharacterLexicographicaly {
    public static void main(String[] args) {
        String a = "titanium";

        Map <Character , Integer> record = new HashMap<>();

        for(int i = 0 ; i < a.length() ; i++ ){
            if(record.containsKey(a.charAt(i))){
                record.put(a.charAt(i), record.get(a.charAt(i)) + 1);
            }
            else{
                record.put(a.charAt(i), 1);
            }
        }

        int max = Integer.MIN_VALUE;
        char ans = '\0';

        for(Map.Entry<Character, Integer> pair : record.entrySet()){
            if(pair.getValue() > max || pair.getValue() == max && pair.getKey() < ans){
                max = pair.getValue();
                ans = pair.getKey();
            }
        }

        System.out.println(max);
        // output :: 2 
        System.out.println(ans);
        // output :: will be i because i comes before t
    }
}