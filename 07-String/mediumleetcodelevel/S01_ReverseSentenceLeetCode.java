package mediumleetcodelevel;

public class S01_ReverseSentenceLeetCode {

    static int startIndexOfWord(String a , int e){

        while(e > 0 && a.charAt(e) == ' '){
            e--;
        }

        while(e > 0){
            // now here we will encounter our first non emptly space :: if true
            if( a.charAt(e) != ' '){
                e--;
            }
            else{
                return e+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String a = "MY NAME IS ROHAN";

        // i want output ROHAN IS NAME MY
        int e = a.length() - 1; // last index of string a last val = 15 

        while(e >= 0){
            // index of first word
            int s = startIndexOfWord(a, e);
            
            for(int i = s ; i < e ; i++){
                System.out.println(a.charAt(i));
            }
            System.out.println(" ");

            e = s - 1;
        }
    }
}
