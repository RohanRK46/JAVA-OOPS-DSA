package sortingarray;

import java.util.Map;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class S03_2SumUsingHashMap {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 2, 6, 3, 7, 9, 8 };

        int target = 10;

        Map<Integer, Integer> Pairs = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Pairs.put(arr[i], i);
        }

        System.out.print(Pairs + " " );

        for (Map.Entry<Integer, Integer> eachpair : Pairs.entrySet()) {
            if (eachpair.getKey() + eachpair.getValue() == target) {
                System.out.println(eachpair);
            }
        }
    }
}
