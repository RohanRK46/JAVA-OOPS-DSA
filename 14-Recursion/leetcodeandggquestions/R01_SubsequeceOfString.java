package leetcodeandggquestions;
import java.util.ArrayList;

public class R01_SubsequeceOfString {

    static void GetSubsequence(String s , StringBuilder output , ArrayList<String> ans ,int index){
        
        // BaseCase
        if(index > s.length() - 1){
            String Subsequence = output.toString();
            ans.add(Subsequence);
            return ;
        }

        // calculation
        // include 
        output.append(s.charAt(index));
        //RC
        GetSubsequence(s, output, ans, index + 1);

        // exclude
        output.deleteCharAt(output.length() - 1);
        //RC
        GetSubsequence(s, output, ans, index + 1);

    }
    public static void main(String[] args) {
        String s = "abc";

        StringBuilder output = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();

        int index = 0;

        GetSubsequence(s, output, ans, index);  
        System.out.println(ans);
    }
}
