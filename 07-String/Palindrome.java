
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine();

        // reversing string
        String rev = " ";

        for( int i = str.length() - 1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        if(str.equals(rev)){
            System.out.println("plaindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
