package beginerlevelquestions;

public class Q2_ifFrequencyisEqualPrintEqual {
    public static void main(String[] args) {
        String str1 = "rohaaan";
        String str2 = "boohan";

        int maxIterationStr1 = 0;

        int maxIterationStr2 = 0;

        // itteration counter for str1

        for (int i = 0; i < str1.length(); i++) {

            // checking for duplicates
            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    visited = true;
                    break;
                }
            }

            if (visited) // false is true
                continue;

            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j))
                    count++;
            }
            if (maxIterationStr1 < count) {
                maxIterationStr1 = count;
            }
        }

        // iteration counter for str2

        for (int i = 0; i < str2.length(); i++) {

            // checking for duplicates
            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (str2.charAt(i) == str2.charAt(j)) {
                    visited = true;
                    break;
                }
            }

            if (visited) // false is true
                continue;

            int count = 0;

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(i) == str2.charAt(j))
                    count++;
            }
            if (maxIterationStr2 < count) {
                maxIterationStr2 = count;
            }
        }

        System.out.println(maxIterationStr1);
        System.out.println(maxIterationStr2);

        if(maxIterationStr1 == maxIterationStr2){
            System.out.println("Equal Iteration");
        }
        else{
            System.out.println("Not Equal");
        }

    }
}
