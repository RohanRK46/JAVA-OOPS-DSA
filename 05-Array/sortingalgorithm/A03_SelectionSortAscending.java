package sortingalgorithm;

public class A03_SelectionSortAscending {
    public static void main(String[] args) {
        int arr[] = { 5 , 2 , 7 , 4 , 5 , 6};

        for(int i = 0 ; i < arr.length ; i++){
            int minIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                // if [minindex] ki value tb change karni h jb chota element mile
                if(arr[minIndex] > arr[j]){
                    //swap index only 
                    minIndex = j;
                }
            }
            // swap with i value
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }    

        for(int i : arr){
            System.out.println(i);
        }
    }
}
