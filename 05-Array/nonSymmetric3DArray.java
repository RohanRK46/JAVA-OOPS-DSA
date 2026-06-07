public class nonSymmetric3DArray {
    public static void main(String[] args) {
        // what if array is 3D but for each row the column length is diffrent

        // this type of array are called jagged array or Ragged array
        int[][] arr = {
            {1 , 2},
            {3 , 4 , 5 , 5 },
            {6 , 7 , 8 , 9 , 10 , 11 },
            {11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 },
        };

        // how to fetch this array now 
        // length is given my arr[0].length will give lentgh of first column 
        // so we can simply run a loop and put ( i ) in arr[i] and run to that point to get all elements

        int rowlength = arr.length;

        for(int i = 0 ; i < rowlength ; i++){
            int Columnlen = arr[i].length ;
            for(int j = 0 ; j < Columnlen ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
