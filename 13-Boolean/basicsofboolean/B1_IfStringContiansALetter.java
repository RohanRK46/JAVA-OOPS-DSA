package basicsofboolean;

public class B1_IfStringContiansALetter {
    public static void main(String[] args) {
        
        String str = "rohan";

        boolean ContainsLetterA = false;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a'){
                ContainsLetterA = true;
                break;
            }
        }
        System.out.println(ContainsLetterA);
    }
}
