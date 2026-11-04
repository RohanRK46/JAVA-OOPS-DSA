package leetcodeandggquestions;

public class R10_TriangleArrayShortestPath {

    static int ShortestPath(int arr[][] ,int row ,int col ,int path ){
        // BaseCases
        // if all rows are traveled meaning we have chose one from each row and we have a ans
        if(row == arr.length){
            return 0;
        }

        // going to first element 

        int firstChoice = ShortestPath(arr, row + 1, col, path);
        
        int secondChoice = ShortestPath(arr, row + 1, col + 1, path);
        
        return arr[row][col] + Math.min(firstChoice, secondChoice);

    }
    public static void main(String[] args) {
        int arr[][] = {
                {2},
              {3 , 4},
            {6 , 5 , 7},
          {4 , 1 , 8 , 3}
        };

        int row = 0;
        int col = 0;
        int path = 0;
        
        int ans = ShortestPath(arr , row , col , path );
        System.out.println(ans);
    }
}
