package arraymanipulationproblem;

import java.util.Map;
import java.util.HashMap;

public class A06_FrequencyOfCharacter {
    public static void main(String[] args) {
        Map<Integer, Integer> Record = new HashMap<>();

        int arr[] = { 1, 2, 3, 3, 3, 2, 4, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            if (Record.containsKey(arr[i])) {
                Record.put(arr[i], Record.get(arr[i]) + 1);
            } else {
                Record.put(arr[i], 1);
            }
        }

        System.out.println(Record);

        int MaxFreq = 0;
        int element = 0;

        for (Map.Entry<Integer, Integer> Pair : Record.entrySet()) {
            if (MaxFreq < Pair.getValue()) {
                MaxFreq = Pair.getValue();
                element = Pair.getKey();
            }
        }
        System.out.printf("Max Freqecy in Array is { %d , %d }", element, MaxFreq);
    }
}