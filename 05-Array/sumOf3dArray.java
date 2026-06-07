public class sumOf3dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1 , 2},
            {3 , 4},
            {5 , 6},
            {7 , 8}
        };
        int  sum = 0 ; 
        int product = 1 ; 
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                sum = sum + arr[i][j];
                product = product * arr[i][j];
            }
        } 

        System.out.println(sum);
        System.out.println(product);

    }
}
