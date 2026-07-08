package basicquestions;

public class Palindrome2pointer {
    public static void main(String[] args) {
        String str = "boob";
        
        int firstindex = 0;
        int lastindex = str.length() - 1;

        while (firstindex <= lastindex) {
            if(str.charAt(firstindex) == str.charAt(lastindex)){
                System.out.println("its palindrome");
            }
            else{
                System.out.println("not a palindrome");
            }
            break;
        }

    }
}
