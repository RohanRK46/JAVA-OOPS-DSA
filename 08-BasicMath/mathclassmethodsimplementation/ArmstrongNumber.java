package mathclassmethodsimplementation;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;

        int temp = num;
        int temp2 = num;
        int length = 0;
        int sum = 0; 
        
        while ( num != 0 ) {
            length = length + 1;
            num = num / 10;
        }

        while ( temp != 0 ) {
            int LastDigit = temp % 10 ; 
            sum = sum +(int) Math.pow(LastDigit, length);
            temp = temp/10;
        }

        if( temp2 == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
