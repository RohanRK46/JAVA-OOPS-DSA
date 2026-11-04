package backtracking;

// ".Q.."
// "...Q"
// "Q..."
// "..Q."

public class BT07_NQueenProblem {

    static boolean isSafe(char board[][], int row, int col) {

        // Check above in the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void Solve(char board[][], int target, int row, int col, int queenPlaced) {

        // base case
        if (queenPlaced == target) {
            return;
        }

        // i have 4 choices i can either place queen at 0,0 or 0,1 , 0,2 , 0,3
        // i'll do 0,0 case and pass other case to recursion

        while (queenPlaced != target) {
            // row = 0
            // col = 0

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                queenPlaced = queenPlaced + 1;
            }

            Solve(board, target, row, col + 1, queenPlaced);

        }

    }

    public static void main() {
        char board[][] = new char[4][4];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }

        // taking row , col as two trackers
        int row = 0;
        int col = 0;

        int target = 4;
        int queenPlaced = 0;

        Solve(board, target, row, col, queenPlaced);
        

    }
}
