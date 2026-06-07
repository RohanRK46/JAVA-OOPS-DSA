import java.util.*;

public class maxElementInArray{
    public static void main(String[] args){

        // this part will take input from the user and push it to the array
        Scanner sc = new Scanner(System.in);

        System.out.print("Total number of element in Array :");
        int x = sc.nextInt();

        int arr[] = new int[x];

        for(int i = 0 ; i < x ; i++ ){
            System.out.print("Enter " + i + " Element : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        // this part will find out the max value in an array

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum value in Array is :" + max);
    }
}