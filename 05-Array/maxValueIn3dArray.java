public class maxValueIn3dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10 , 50},
            {30 , 5},
            {60 , 11 , 123},
            {59 , 14 , 14}
        };

        int max = arr[0][0];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
