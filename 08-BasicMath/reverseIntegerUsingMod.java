
class palindrome {
    static void ispalindrome(int num) {

        int temp = num ; 
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if(rev == num){
            System.out.println("Yes, Its a palindrome");
        }
        else{
            System.out.println("No, Its not a plaindrome.");
        }

    }
}

class digitrev {
    static void revnum(int num) {

        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}

public class reverseIntegerUsingMod {
    public static void main(String[] args) {
        digitrev.revnum(5678);
        palindrome.ispalindrome(1221);
    }
}
