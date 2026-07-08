package beginerlevelarrayquestions;

class ArrayOpperation4 {
    static int getMaxElement(int arr[]) {
        int maxElemn = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxElemn < arr[i]) {
                maxElemn = arr[i];
            }

            // or you can use Math.max
            // maxElemn = Math.max(maxElemn, arr[i]);
        }
        return maxElemn;
    }
}

public class B4_MaxElementInAnArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 30, 20 };
        System.out.println(ArrayOpperation4.getMaxElement(arr1));

        int arr2[] = { 40 , 30, 20 };
        System.out.println(ArrayOpperation4.getMaxElement(arr2));

    }
}
