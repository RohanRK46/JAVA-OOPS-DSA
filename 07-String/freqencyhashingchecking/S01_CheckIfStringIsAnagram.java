package freqencyhashingchecking;
import java.util.HashMap;
import java.util.Map;

public class S01_CheckIfStringIsAnagram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagarama";

        Map <Character , Integer> freqOFa = new HashMap<>();
        Map <Character , Integer> freqOFb = new HashMap<>();

        if(a.length() != b.length()){
            System.out.println("not a anagram");
            return;
        }

        for(int i = 0 ; i < a.length() ; i++){

            // populating freqOfA
            if(freqOFa.containsKey(a.charAt(i))){
                freqOFa.put(a.charAt(i), freqOFa.get(a.charAt(i)) + 1);
            }
            else{
                freqOFa.put(a.charAt(i), 1);
            }

            // populating freqOfB
            if(freqOFb.containsKey(b.charAt(i))){
                freqOFb.put(b.charAt(i), freqOFb.get(b.charAt(i)) + 1);
            }
            else{
                freqOFb.put(b.charAt(i), 1);
            }
        }

        for(Map.Entry<Character , Integer> pairs : freqOFa.entrySet()){
            char key = pairs.getKey();
            int value = pairs.getValue();

            if(!freqOFb.containsKey(key) || freqOFb.get(key) != value){
                System.out.println("not a anagram");
                return;
            }
        }

        System.out.println("its anagram!!");
    }
}