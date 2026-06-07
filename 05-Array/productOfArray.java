import java.util.Scanner;

public class productOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        int product = 1;
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
            product = product * arr[i];
        }
        System.out.println(product);   
    }
}
