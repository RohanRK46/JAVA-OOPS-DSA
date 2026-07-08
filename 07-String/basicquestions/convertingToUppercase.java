package basicquestions;
class conversiontouppercase {
     static void uppercase(String str){
        String uppercase = "";
            for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int ascii = ch ; 
            ascii = ascii - 32;
            char upper = (char)ascii;
            System.out.println(upper);
            uppercase = uppercase + upper;
        }
        System.out.println("Uppercase String is : " + uppercase);
    }
} 

public class convertingToUppercase {
    public static void main(String[] args) {
        String str2 = "rohan" ;
        conversiontouppercase.uppercase(str2);
    }
}
