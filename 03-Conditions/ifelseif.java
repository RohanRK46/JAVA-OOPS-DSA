import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your percentage :");
        int a = sc.nextInt();

        if (a < 30 ){
            System.out.println("fail");
        }
        else if(a >= 30 && a < 50 ){
            System.out.println("D");
        }
        else if(a >= 50 && a < 70 ){
            System.out.println("C");
        }
        else if( a >= 70 && a < 80 ){
            System.out.println("B");
        }
        else if( a >= 80 && a < 88 ){
            System.out.println("A");
        }
        else if(a >= 88 && a <= 100 ){
            System.out.println("O");
        }
    }    
}
