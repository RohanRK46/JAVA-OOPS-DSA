
package backtracking;

import java.util.List;
import java.util.ArrayList;

public class BT08_SudokoSolverGPT {

    static boolean isPossibleInSubBox(char board[][], int row, int col, int num) {

        char ch = (char) (num + '0');

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isPossible(char board[][], int num, int row, int col) {

        char ch = (char) (num + '0');

        // Checking entire row
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] == ch) {
                return false;
            }
        }

        // Checking entire column
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == ch) {
                return false;
            }
        }

        // Checking 3x3 sub-box
        return isPossibleInSubBox(board, row, col, num);
    }

    static boolean Solver(char board[][], int row, int col,
                          List<List<String>> solvedSudoko) {

        // Base case: entire board is solved
        if (row == 9) {

            List<String> solvedBoard = new ArrayList<>();

            for (int i = 0; i < 9; i++) {
                solvedBoard.add(new String(board[i]));
            }

            solvedSudoko.add(solvedBoard);
            return true;
        }

        // Move to the next row
        if (col == 9) {
            return Solver(board, row + 1, 0, solvedSudoko);
        }

        // Skip already filled cells
        if (board[row][col] != '.') {
            return Solver(board, row, col + 1, solvedSudoko);
        }

        // Try numbers 1 to 9
        for (int num = 1; num <= 9; num++) {

            char ch = (char) (num + '0');

            if (isPossible(board, num, row, col)) {

                // Place the number
                board[row][col] = ch;

                // Solve the next cell
                if (Solver(board, row, col + 1, solvedSudoko)) {
                    return true;
                }

                // Backtracking
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },

            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },

            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        List<List<String>> solvedSudoko = new ArrayList<>();

        boolean solved = Solver(board, 0, 0, solvedSudoko);

        if (solved) {
            System.out.println(solvedSudoko.get(0));
        } else {
            System.out.println("No solution exists.");
        }
    }
}
