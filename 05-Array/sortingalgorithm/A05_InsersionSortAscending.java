package sortingalgorithm;

public class A05_InsersionSortAscending {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 4, 5, 6 };

        for(int i = 1 ; i < arr.length ; i++ ){
            int key = i ;
            int prevElem = i-1;

            // suppose we have 5 , 2 , 3 so 2 is key when sorted > key 
            while (prevElem >= 0 && prevElem > key) {
                // only one value swap of prev with prev + 1
                arr[prevElem + 1] = arr[prevElem];
            }
        }

    for(int i : arr){
        System.out.println(i);
    }
    }
}
