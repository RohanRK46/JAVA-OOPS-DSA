
import java.util.Scanner;

public class array2DGenerator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            
            // this takes and create no. rows in an array 

        System.out.print("Number of rows in 2D array : ");
        int rowlength = sc.nextInt();

        int[][] arr = new int[rowlength][]; // rows are initialised now this next input can only go in columns

        // this takes number of columns for each row in array
        for(int i = 0 ; i < rowlength ; i++){
            System.out.println("Enter number of column in 2D array for " + i + " row : ");
            int collength = sc.nextInt();
            arr[i] = new int[collength];
        }

        // taking input in 2D array
        for (int i = 0 ; i < rowlength ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print("For row " + i + " enter " + arr[i].length + " Number of values : ");
                arr[i][j] = sc.nextInt();
            }
        }

        // printing the 2D array

        for (int i = 0 ; i < rowlength ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
}
