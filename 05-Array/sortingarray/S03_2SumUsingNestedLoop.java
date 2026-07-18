package sortingarray;

public class S03_2SumUsingNestedLoop {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 2, 6, 3, 7, 9};

        int target = 10;

        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target ){
                    System.out.println( "Pair : " +  arr[i] + " , " + arr[j]);
                }
            }
        }
    }
}
