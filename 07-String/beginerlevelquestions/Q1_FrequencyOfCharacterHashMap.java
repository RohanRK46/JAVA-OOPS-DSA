package beginerlevelquestions;

import java.util.LinkedHashMap;
import java.util.Map;


public class Q1_FrequencyOfCharacterHashMap {
    public static void main(String[] args) {

        Map < Character , Integer > Record = new LinkedHashMap<>();

        String str = "apple";

        for(int i = 0 ; i < str.length() ; i++){

           char ch = str.charAt(i);

           if(Record.containsKey(ch)){
                Record.put(ch, Record.get(ch) + 1);
           }
           else{
            Record.put( ch, 1);
           }

        }
    System.out.println(Record);
    }
}
