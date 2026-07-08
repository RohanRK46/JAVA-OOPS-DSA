package sortingarray;

public class S02_SortZeroesOnesAndTwoesInArray {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 0, 2, 2, 1, 2, 0, 1, 0, 2, 0 };

        int Left = 0;
        int Current = 0;
        int Right = arr.length - 1;

        while (Current <= Right) {

            if (arr[Current] == 0) {
                int temp = arr[Left];
                arr[Left] = arr[Current];
                arr[Current] = temp;
                Left++;
                Current++;
            } else if (arr[Current] == 2) {
                int temp = arr[Right];
                arr[Right] = arr[Current];
                arr[Current] = temp;
                Right--;
            } else {
                // arr[current] == 1 kuch nhi karna current++;
                Current++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
