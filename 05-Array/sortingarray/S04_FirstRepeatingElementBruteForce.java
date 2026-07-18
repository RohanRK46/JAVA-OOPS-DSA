package sortingarray;

public class S04_FirstRepeatingElementBruteForce {
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 2 , 2 , 3 , 4 , 5};

        boolean found = false;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++ ){
                if( arr[i] == arr[j] && i!=j){
                    System.out.println("First Repeating Elem : " + arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if(found){
            System.out.println("No Such Element Found");
        }
    }
}
