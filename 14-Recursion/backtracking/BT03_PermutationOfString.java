package backtracking;
import java.util.ArrayList;
import java.util.List;

public class BT03_PermutationOfString {

    static void Solve(String str, int originalLength, StringBuilder permutation, List<List<String>> collection) {

        if (permutation.length() == originalLength) {
            // One complete permutation is ready
            collection.add(new ArrayList<>(List.of(permutation.toString())));
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            permutation.append(str.charAt(i));

            String remainingString = str.substring(0, i) + str.substring(i + 1);

            Solve(remainingString, originalLength, permutation, collection);

            // Backtrack
            permutation.deleteCharAt(permutation.length() - 1);
        }
    }

    public static void main(String[] args) {

        String str = "abc";
        int originalLength = str.length();

        StringBuilder permutation = new StringBuilder();
        List<List<String>> collection = new ArrayList<>();

        Solve(str, originalLength, permutation, collection);

        System.out.println(collection);
    }
}
