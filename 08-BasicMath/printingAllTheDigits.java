
import java.util.Scanner;

class Digitprint{
    static void rev(int num){
        String str = String.valueOf(num);
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}

class NumPrint{
    static void digitsprint(int num){
        String str = String.valueOf(num);

        String reverse = "";
        for(int i = str.length() - 1 ; i >= 0 ; i-- ){
            char ch = str.charAt(i);
            reverse = reverse + ch ; 
        }
        int reversenum = Integer.parseInt(reverse);
        System.out.println(reversenum);
    }
}

public class printingAllTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse : ");

        // taking input
        int num = sc.nextInt();

        System.out.print("Enter number to print Digit : ");
        int num2 = sc.nextInt();

        NumPrint.digitsprint(num);
        Digitprint.rev(num2);
    }
}
