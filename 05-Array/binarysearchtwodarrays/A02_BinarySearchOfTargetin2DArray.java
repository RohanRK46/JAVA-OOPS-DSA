package binarysearchtwodarrays;

// in this case there is no such condition as last element is always smaller than the first element
// of next row here in 2D array we just have one condtion its sorted row wise as well as column wise

// meaning if we go right its asscending order and if we go down its asscending from 1st lement 
// from last element if we go up or left it will be descending

public class A02_BinarySearchOfTargetin2DArray {

    static boolean isTargetAvailable(int matrix[][], int target){
        int totalRows = matrix.length;
        // o/p -> 5
        int totalCols = matrix[0].length;
        // o/p -> 5

        int row = totalRows - 1;
        int col = 0;

        while ( row >= 0 && col < totalCols ) {
            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] > target ){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            int matrix[][] = {
        {1  , 4  , 7  , 11 , 15},
        {2  , 5  , 8  , 12 , 19},
        {3  , 6  , 9  , 16 , 22},
        {10 , 13 , 14 , 17 , 24},
        {18 , 21 , 23 , 26 , 30}
    };

    int target = 9;

    System.out.println(isTargetAvailable(matrix , target));
    }
}
