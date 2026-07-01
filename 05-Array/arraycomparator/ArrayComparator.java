package arraycomparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayComparator {
    public static void main(String[] args) {
        Integer arr[] = { 4, 13, 66, 46, 35, 7 };

        // lambda equaltion for sort

        // Arrays.sort(arr, (Integer a, Integer b) -> b - a);
        // for( int a : arr){
        // System.out.println(a);
        // }

        // using sepearte custom class for compare
        // Arrays.sort(arr, new RevComp());
        // for (int a : arr) {
        // System.out.print(a + " ");
        // }

        // Using Anonymous class
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        for (int a : arr) {
            System.out.println(a + " ");
        }



    }
}
