package twodarraysquestions;

public class A07_SpiralPrinting2DArray {
    public static void main(String[] args) {
        int arr[][] = {
            {10 , 12 , 13 , 14},
            {22 , 24 , 26 , 28},
            {32 , 34 , 36 , 38},
            {42 , 44 , 46 , 48},
            {50 , 52 , 55 , 58}
        };

        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        
        while( startRow <= endRow && startCol <= endCol){
            //for printng Left to right
            for(int col = startCol ; col <= endCol ; col++){
                System.out.println(arr[startRow][col]);
            }
            startRow++;

            // for printing top to bottom 
            for(int row = startRow ; row <= endRow ; row++){
                System.out.println(arr[row][endCol]);
            }
            endCol--;

            // for printing right to left
            for(int col = endCol ; col >= startCol ; col--){
                System.out.println(arr[endRow][col]);
            }
            endRow--;

            // for priting bottom to top
            for(int row = endRow ; row >= startRow ; row--){
                System.out.println(arr[row][startCol]);
            }
            startCol++;
        }
    }
}
