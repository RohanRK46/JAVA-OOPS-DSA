package leetcodeandggquestions;

public class R09_MinimiseTheDifferenceBetweenTarget{

    static int MinimiseTheTarget(int matrix[][] , int row , int col , int target , int mini ){

        // valid case in each row we have selected one element
        if(row == matrix.length ){
            return Math.abs(target);
        }

        if(col > matrix[0].length - 1){
            return Integer.MAX_VALUE;
        }

        // include first element case
        int IncludeAns = MinimiseTheTarget(matrix, row + 1 , 0 , target - matrix[row][col], mini);
        // exclude first element case
        int ExcludeAns = MinimiseTheTarget(matrix, row , col + 1 , target, mini);

        mini = Math.min(IncludeAns,ExcludeAns);
        return mini; 

    }
    public static void main(String[] args) {
       int matrix[][] = {
        {1 , 2 , 3},
        {4 , 5 , 6},
        {7 , 8 , 9},
       };

       // goal is to chose one element from each row
       // then sum , every element chosen
       // subtract it with target store the result in mini
       // and compare that mini with other result 
       // return the smallest mini

       int row = 0;
       int col = 0;
       int target = 13;
       int mini = Integer.MAX_VALUE;

       int ans = MinimiseTheTarget(matrix , row , col , target , mini );
       System.out.println(ans);
    }
}