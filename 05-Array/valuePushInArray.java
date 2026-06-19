
import java.util.Scanner;

public class valuePushInArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("How many value you want to input :");
            int n = sc.nextInt();
            
            int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter " + i +" Value : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    } 
    }
}
