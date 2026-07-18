package twodarraysquestions;

public class A02_2Darraytest {
    public static void main(String[] args) {
        // what gives rows and what gives column

        int arr[][] = {
                { 1, 2, 3, 4 },
                { 4, 5, 3, 1 },
                { 7, 9, 10, 11 }
        };

        int rows = arr.length;
        System.out.println(rows);

        int column = arr[0].length;
        System.out.println(column);
    }
}
