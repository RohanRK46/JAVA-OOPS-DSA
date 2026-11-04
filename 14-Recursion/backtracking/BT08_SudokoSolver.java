package backtracking;

import java.util.List;
import java.util.ArrayList;

public class BT08_SudokoSolver {

    static boolean isPossibleInSubBox( char board[][] , int row , int col , int startRow , int startCol , int num ){
        char ch = (char) (num + '0');

        startRow = (row / 3 ) * 3;
        startCol = (col / 3 ) * 3;

        for(int i = startRow ; i < startRow + 3 ; i++){
            for(int j = startCol ; j < startCol + 3 ; j++ ){
                if(board[i][j] == ch){
                    return false;
                }
            }
        }

        return  true;
    }

    static boolean isPossible( char board[][] , int num , int row , int col ){

        // checking entire row
        
        for(int i = 0 ; i < board[0].length ; i++){

            char current = board[row][i]; 
            char ch = (char) (num + '0');

            if( current == ch ){
                return false;
            }
        }

        // checking entire col

        for(int j = 0 ; j < board.length ; j++){

            char current = board[j][col];
            char ch = (char) (num + '0');

            if(current == ch){
                return false;
            }
            
        }

        // checking for subsquare
        
        // step 1 : identify which sub sqaure we are currently on
        // step 2 : if its possible or not

        int startRow = 0;
        int startCol = 0;
        if(isPossibleInSubBox( board , row , col , startRow , startCol , num ) == false){
            return false;
        }

        return true;
    }

    static void Solver( char board[][] , int row , int col , List<List<String>> solvedSudoko){
        // approach -> will solve row by row and add that solved row into solvedSudoko and when 
        // it has solved all the row base case will hit and recursion will end

        if(col == board[0].length ){
            // this means we have successfully added completed one row 
            return;
        }

        col = 0;
        while(col < board[0].length){
            // checking if current cell is filled or not
            if(board[row][col] != '.'){
                col++;
            }
            else{
                // found first '.' now trying to add 1 to 9 in it but before that checking for rules

                for(int num = 0 ; num < 10 ; num++ ){
                    
                    char ch = (char) (num + '0');

                    if(isPossible( board , num , row , col )){
                        board[row][col] = ch;
                    }

                    Solver(board, row , col + 1, solvedSudoko);
                    
                    // backtracking
                    board[row][col] = '.';
                }
                col++;
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.',   '.', '7', '.',   '.', '.', '.' },
                { '6', '.', '.',   '1', '9', '5',   '.', '.', '.' },
                { '.', '9', '8',   '.', '.', '.',   '.', '6', '.' },

                { '8', '.', '.',   '.', '6', '.',   '.', '.', '3' },
                { '4', '.', '.',   '8', '.', '3',   '.', '.', '1' },
                { '7', '.', '.',   '.', '2', '.',   '.', '.', '6' },

                { '.', '6', '.',   '.', '.', '.',   '2', '8', '.' },
                { '.', '.', '.',   '4', '1', '9',   '.', '.', '5' },
                { '.', '.', '.',   '.', '8', '.',   '.', '7', '9' }
        };

        int row = 0;
        int col = 0;

        List<List<String>> solvedSudoko = new ArrayList<>(); 

        Solver(board , row , col , solvedSudoko);

        System.out.println(solvedSudoko);
    }
}
