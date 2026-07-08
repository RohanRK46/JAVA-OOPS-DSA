package arraymanipulationproblem;

public class A02_RightShiftEachElementInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

        int prev = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i]; // Save current element
            arr[i] = prev; // Replace it
            prev = current; // Carry current to the next position
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
