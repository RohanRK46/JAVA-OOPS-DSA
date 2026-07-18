package basicsofboolean;

public class B3_CheckifWordConatainsUppercase {
    public static void main(String[] args) {
        String str = "Tom";

        boolean containCapital = false;

        for(int i = 0 ; i < str.length() ; i++){

            char ch = str.charAt(i);
            int code = ch;
            if((code >= 65) && (code <= 90)){
                containCapital = true;
            }
        }

        if(containCapital){
            System.out.println("contains Capital");
        }
        
        else{
            System.out.println("does not contain capital");
        }
    }
}