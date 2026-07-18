package sortingalgorithm;

public class A01_BubbleSortAscending {
    public static void main(String[] args) {
        
        int arr[] = { 2 , 7 , 4  , 6 , 5};

        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            for(int j = 0 ; j < arr.length - i - 1; j++ ){
                if(arr[j] > arr[j+1]){
                    // swap why if (pehle aane wala chotahoga , but in this condition pehle wala bda h)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        
        for(int a : arr){
            System.out.println(a);
        }
    }
}
