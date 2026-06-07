import java.util.Scanner;

public class forloop1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of prints :");
        int a = sc.nextInt();

        for(int i = 1 ; i <= a ; i++ ){
            System.out.println("Mera Bharat mahan");
        }
    }   
}
