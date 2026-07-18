package twodarraysquestions;

public class A06_RotateAMatrixBy90Degree {
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

            int startCol = 0;
            int endCol = matrix[0].length - 1;

            while(startCol < endCol){
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;
                startCol++;
                endCol--;
            }
        }

        for(int row = 0 ; row < matrix.length ; row++){
            for(int col = 0 ; col < matrix[0].length ; col++){
                System.out.println(matrix[row][col]);
            }
        }
    }
}