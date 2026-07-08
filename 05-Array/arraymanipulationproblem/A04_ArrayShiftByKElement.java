package arraymanipulationproblem;
import java.util.Scanner;

public class A04_ArrayShiftByKElement {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times do you want to shift element : ");
        int k = sc.nextInt();
        
        int arr[] = {10 , 20 , 30 , 40 , 50 , 60 , 70};

        int newarr[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            newarr[(i + k) % arr.length] = arr[i];
        }
        
        for(int a : newarr){
            System.out.print(a + " ");
        }
    }
}
