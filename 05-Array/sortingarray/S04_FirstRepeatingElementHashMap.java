package sortingarray;

import java.util.Map;
import java.util.HashMap;

public class S04_FirstRepeatingElementHashMap {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 2, 3, 4, 5 };

        Map<Integer, Integer> Record = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (Record.containsKey(arr[i])) {
                Record.put(arr[i], Record.get(arr[i]) + 1);
            } else {
                Record.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (Record.get(arr[i]) > 1) {
                System.out.println("First Repeating Element: " + arr[i]);
                break;
            }
        }
    }
}
