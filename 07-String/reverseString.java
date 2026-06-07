import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        String reverse = "";

        for( int i = str.length() - 1 ; i >= 0 ; i-- ){
            char ch = str.charAt(i);
            reverse = reverse + ch ;
        }
        System.out.println(reverse);
    }
}
