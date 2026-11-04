package backtracking;

import java.util.ArrayList;
import java.util.List;

public class BT04_RatInAMazeProblem {

    static void FindPath(int arr[][] , int row , int col , boolean visited[][], List<List<String>>allPaths ,StringBuilder path ){
        
        if (row < 0 || col < 0 ||
            row >= arr.length || col >= arr[0].length) {
                return;
            }
            
            // Check if the cell is blocked or already visited
            if (arr[row][col] == 0 || visited[row][col]) {
                return;
            }
            
            if(row == arr.length - 1 && col == arr[0].length - 1){
                // this means we have reached the desitination and path is ready to be added in allPaths 
                allPaths.add(new ArrayList<>(List.of(path.toString())));
                return;
            }

        visited[row][col] = true;

        // taking right 
        if( col + 1 < arr[0].length && arr[row][col + 1] == 1 ){   
            path.append("R");
            FindPath(arr , row , col + 1 , visited , allPaths , path );
            path.deleteCharAt(path.length() - 1 );
        }
        
        // taking Down
        if(row + 1 < arr.length && arr[row + 1][col] == 1){
            path.append("D");
            FindPath(arr, row + 1 , col , visited , allPaths , path);
            path.deleteCharAt(path.length() - 1 );
        }

        // take left
        if(col - 1 >= 0 && arr[row][col - 1] == 1 ){
            path.append("L");
            FindPath(arr, row, col - 1 , visited , allPaths, path);
            path.deleteCharAt(path.length() - 1);
        }

        // take Up
        if(row - 1 >= 0 && arr[row - 1][col] == 1){
            path.append("U");
            FindPath(arr, row - 1, col, visited , allPaths, path);
            path.deleteCharAt(path.length() - 1);
        }

        visited[row][col] = false;
        
    }
    public static void main(String[] args) {
        int arr[][] = {

        //  c0   c1  c2  c3  c4  c5
            {1 , 1 , 1 , 1 , 1 , 1}, // row 0
            {1 , 0 , 1 , 0 , 0 , 1}, // row 1
            {1 , 0 , 1 , 1 , 0 , 1}, // row 2
            {1 , 0 , 0 , 1 , 0 , 1}, // row 3 
            {1 , 1 , 1 , 1 , 0 , 1}  // row 4
        };

        int row = 0;
        int col = 0;

        List<List<String>> allPaths = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        boolean visited[][] = new boolean[arr.length][arr[0].length];
        FindPath(arr , row , col , visited , allPaths , path );
        System.out.println(allPaths);
    }
}
