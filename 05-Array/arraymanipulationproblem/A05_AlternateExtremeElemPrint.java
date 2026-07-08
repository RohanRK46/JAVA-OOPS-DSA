package arraymanipulationproblem;

public class A05_AlternateExtremeElemPrint{

    static void printExtremeElement(int arr[]){

        int i = 0;
        int j = arr.length - 1 ;
        
        while ( i <= j ) {
            if( i == j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                System.out.println(arr[j]);
            }
            i++;
            j--;
        }
    } 
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};
        // o/p = 10 50 20 40 30 
        printExtremeElement(arr);
        

    }
}