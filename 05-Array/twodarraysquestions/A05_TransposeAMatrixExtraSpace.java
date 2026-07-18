package twodarraysquestions;

public class A05_TransposeAMatrixExtraSpace {
    public static void main(String[] args) {
        int arr[][] = {
                { 5, 4, 3 },
                { 3, 7, 8 },
                { 2, 6, 9 }
        };

        int prevTotalRows = arr.length;
        int prevTotalCols = arr[0].length;

        int newTotalRows = arr[0].length;
        int newTotalCols = arr.length;

        int newArr[][] = new int[newTotalRows][newTotalCols];

        for (int row = 0; row < prevTotalRows; row++) {
            System.out.printf("Row(%d)\n" , row);
            for (int col = 0; col < prevTotalCols; col++) {
                System.out.printf("Col(%d) : %d\n", col , arr[row][col] );
            }
        }

        System.out.println();

        for (int row = 0; row < prevTotalRows; row++) {
            for (int col = 0; col < prevTotalCols; col++) {
                newArr[col][row] = arr[row][col];
            }
        }

        for (int row = 0; row < newTotalRows; row++) {
            System.out.printf("Row(%d)\n" , row);
            for (int col = 0; col < newTotalCols; col++) {
                System.out.printf("Col(%d) : %d\n", col , newArr[row][col] );
            }
        }

    }
}
