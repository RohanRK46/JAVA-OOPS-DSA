public class array2Dbasic {
    public static void main(String[] args) {

        // Declaration in one line and memory allocation in next line

        int [][] arr2 ;
        arr2 = new int[3][3];

        arr2[0][0] = 1 ;
        arr2[0][1] = 2 ;
        arr2[0][2] = 3 ;
        arr2[1][0] = 4 ;
        arr2[1][1] = 5 ;
        arr2[1][2] = 6 ;
        arr2[2][0] = 7 ;
        arr2[2][1] = 8 ;
        arr2[2][2] = 9 ;

        // printing entire 2D array using nested loop
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }


        // Declaration and allocating memory in single line

        int[][] arr1 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 3;
        arr1[1][1] = 4;
        arr1[2][0] = 5;
        arr1[2][1] = 6;

        System.out.println(arr1);



        // 2D array creation directly with value
        int[][] arr = {
                        {1 , 2 , 3},
                        {3 , 4 , 5},
                        {5 , 6 , 7}
                        };

        System.out.println(arr[0][1]);
    }
}