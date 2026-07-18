package sortingalgorithm;

public class A02_BubbleSortDescending {
    public static void main(String[] args) {

        int arr[] = { 2 , 7 , 4  , 6 , 5};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length - 1 ; j++){
                if(arr[j] < arr[j+1]){
                    // bigger should be left most element 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
