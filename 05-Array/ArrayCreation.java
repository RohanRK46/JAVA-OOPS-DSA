public class ArrayCreation {
    public static void main(String[] args) {

        // Method 1 : Declaring array and then allocating memory to it
        System.out.println("Method 1");

        String name[]; // Declaring Array

        name = new String[5]; // Allocating Memory

        name[0] = "Rohan"; // pushing values
        name[1] = "Dipak";
        name[2] = "Don";
        name[3] = "Kabottar";
        name[4] = "Donkey";

        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }

        // Method 2 : Declaring and Allocating both in same line
        System.out.println();
        System.out.println("Method 2");

        int arr2[] = new int[5];
        arr2[0] = 5;
        arr2[1] = 15;
        arr2[2] = 25;
        arr2[3] = 35;
        arr2[4] = 45;

        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }


        // Method 3 : Automatic Creating with value
        System.out.println();
        System.out.println("Method 3");

        int[] arr = { 2, 5, 4, 6, 8 };
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }
}
