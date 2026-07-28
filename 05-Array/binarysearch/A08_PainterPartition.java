package binarysearch;

public class A08_PainterPartition {

    static boolean isPossible(int board[] , int maxBoard , int maxNosPainters){

        int nosPainter = 1;
        int currentBoard = 0;

        for(int i = 0 ; i < board.length ; i++){
            if (board[i] > maxBoard){
                return false;    
            }

            if(board[i] + currentBoard <= maxBoard ){
                currentBoard = currentBoard + board[i];
            }
            else{
                nosPainter++;

                if(nosPainter > maxNosPainters){
                    return false;
                }
                else{
                    currentBoard = 0;
                    currentBoard = currentBoard + board[i];
                }
            }
        }
        return true;
    }

    static int painterPartition(int board[] , int maxNosPainters ){

        //------------------finding start and end for binary search---------------------
        int max = board[0];

        for(int i : board){
            if(i > max){
                max = i;
            }
        }

        int sum = 0;
        
        for(int i : board){
            sum = sum + i;
        }

        int start = max;
        int end = sum;

        int ans = -1;
        //----------------------------------------------------------------------

        while(start <= end){
            int maxBoard = start + (end - start) / 2;

            if(isPossible(board , maxBoard , maxNosPainters )){
                ans = maxBoard;
                end = maxBoard - 1;
            }
            else{
                start = maxBoard + 1;
            }
        }

    return ans;
    }
    public static void main(String[] args) {

        // You are given:

        // An array boards[], where boards[i] represents the length of the ith board.
        // An integer k, representing the number of painters.

        int board[] = {5 , 10 , 30 , 20 , 15};

        System.out.println(painterPartition(board, 2));

    }
}