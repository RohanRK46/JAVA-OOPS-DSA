import java.util.Scanner;

public class TerneryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your feedback 1-10 :");
        int a = sc.nextInt();

       String result = (a >= 6) ? "Satisfied" : "not satisfied"; 

       System.out.println(result);

    }
}
