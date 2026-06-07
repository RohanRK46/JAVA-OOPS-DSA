
import java.util.Scanner;

public class consonantInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string : ");
        String str = sc.nextLine();

        int consonants = 0 ;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

            }
            else{
                consonants = consonants + 1 ; 
            }
        }

        System.out.println(consonants);
    }
}
