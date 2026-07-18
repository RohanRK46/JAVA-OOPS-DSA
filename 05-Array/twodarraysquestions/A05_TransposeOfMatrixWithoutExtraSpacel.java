package twodarraysquestions;

public class A05_TransposeOfMatrixWithoutExtraSpacel {
    public static void main(String[] args) {
        int matrix[][] = {
            {1 , 2 , 3},
            {4 , 5 , 6},
            {7 , 8 , 9}
        };

        for(int row = 0 ; row < matrix.length ; row++){
            for(int col = 0 ; col < row ; col++){
                int temp = matrix[col][row];
                matrix[col][row] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }
        
        for(int row = 0 ; row < matrix.length ; row++){
            for(int col = 0 ; col < matrix[0].length ; col++){
                System.out.println(matrix[row][col]);
            }
        }
    }
}