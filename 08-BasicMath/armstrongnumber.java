
import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter your number to check if its armstrong or not : ");
            int num = sc.nextInt();

        // user  ne inout kiya 1234
        int temp = num;
        int temp2 = num;
        int count = 0 ;
        
        while(temp != 0 ){
            temp = temp / 10;
            count = count + 1 ; 
        }

        double sum = 0;
        while(temp2 != 0 ){
            int digit = temp2 % 10;
            double power = Math.pow(digit, count);
            sum = sum + power;
            temp2 = temp2 / 10;
        }

        if(sum == num){
            System.out.println("number is armstring number");
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }
    }
}
