package beginerlevelarrayquestions;

class ArrayOperation7{
    static int getUnsortedElementAccendingArray(int arr[]) {
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] > arr[i + 1] ){
                return arr[i+1];
            }
        }
        return 0;
    }

        static int getUnsortedElementDescendingArray(int arr[]) {
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] < arr[i + 1] ){
                return arr[i+1];
            }
        }
        return 0;
    }
}

public class B7_UnsortedElement {
    public static void main(String[] args) {

        // asscending order array
        int arr[] = { 2, 3 , 6 , 4 , 9 , 12};
        System.out.println(ArrayOperation7.getUnsortedElementAccendingArray(arr));
        // output should be : 4


        // descending order array
        int arr2[] = { 10, 8 , 12 , 6 , 3 , 1};
        System.out.println(ArrayOperation7.getUnsortedElementDescendingArray(arr2));
        // output should be : 12

        // sorted array asscending
        int arr3[] = { 2, 3 , 6 , 8 , 9 , 12};
        System.out.println(ArrayOperation7.getUnsortedElementAccendingArray(arr3));
        // output : 0
        

        // sorted arry Descending
        int arr4[] = { 10, 8 , 7 , 6 , 3 , 1};
        System.out.println(ArrayOperation7.getUnsortedElementDescendingArray(arr4));
        // output : 0

    }
}
