package arraymanipulationproblem;

import java.util.HashMap;
import java.util.Map;

class Method {

    static int getHighestFreq(Map<Integer, Integer> Record) {

        int maxFreq = 0;
        int maxFeeqElem = 0;

        for (Map.Entry<Integer, Integer> Pair : Record.entrySet()) {
            if (maxFreq < Pair.getValue()) {
                maxFreq = Pair.getValue();
                maxFeeqElem = Pair.getKey();
            }
        }
        System.out.println("Max Feq Element is : " + maxFeeqElem);
        System.out.println("Freq count : " + maxFreq);
        return maxFreq;
    }

    static int getLowestFreq(Map<Integer, Integer> Record) {

        int LowestFreq = 1000;
        int LowestFeeqElem = 0;

        for (Map.Entry<Integer, Integer> Pair : Record.entrySet()) {
            if (LowestFreq > Pair.getValue()) {
                LowestFreq = Pair.getValue();
                LowestFeeqElem = Pair.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : Record.entrySet()) {
            if (entry.getValue() == LowestFeeqElem) {
                System.out.println("Lowest freq element : " + entry.getKey());
            }
        }
        System.out.println("Freq count : " + LowestFreq);
        return LowestFreq;
    }
}

public class A07_IdentifyElemWithHighestAndLowestFreq {
    public static void main(String[] args) {
        Map<Integer, Integer> Record = new HashMap<>();

        int arr[] = { 1, 2, 3, 3, 3, 2, 3, 4 };
        // a = 1 , 2 = 2 , 3 = 4 , 4 = 1

        for (int i = 0; i < arr.length; i++) {
            if (Record.containsKey(arr[i])) {
                Record.put(arr[i], arr[i] + 1);
            } else {
                Record.put(arr[i], 1);
            }
        }

        System.out.println(Record);

        Method.getHighestFreq(Record);
        Method.getLowestFreq(Record);

    }
}
