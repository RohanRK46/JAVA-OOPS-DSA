package basics;

public class BR03_PrintingArrayUsingRecursion {

    static void printArr( int n ,int arr[]){

        if(n >= arr.length ){
            return;
        }

        System.out.println(arr[n]);
        n++;

        printArr(n , arr);

    }
    public static void main(String[] args) {
        int arr[] = { 10 , 20 , 30 , 40 , 50};

        // will print from 1st index to last index

        printArr(0 , arr);
    }
}
