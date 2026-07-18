package twodarraysquestions;

import java.util.ArrayList;
import java.util.List;

class Methods{
    public List<Integer> printEven(int arr[][] , int col){
        // printing column top to bottom
        List <Integer> ans = new ArrayList<>();

        for(int row = 0 ; row < arr.length ; row++ ){
            ans.add(arr[row][col]);
        }
        return ans;
    }   

    public List<Integer> printOdd(int arr[][] , int col){
    // printing column bottom to top
        List <Integer> ans = new ArrayList<>();

            for(int row = arr.length - 1 ; row >= 0 ; row--){
                ans.add(arr[row][col]);
            }
        return ans;
    }
}
public class A04_WavePrintingArray{
    public static void main(String[] args) {
        int arr[][] = {
            { 1 , 3 , 7 , 9},
            { 2 , 4 , 6 , 8},
            { 2 , 2 , 2 , 2}
        };

        List <Integer> waveprint = new ArrayList<>();

        Methods obj = new Methods();

        for(int col = 0 ; col < arr[0].length ; col++){
            if(col % 2 == 0){
                waveprint.addAll(obj.printEven(arr, col));
            }
            else{
                waveprint.addAll(obj.printOdd(arr, col));
            }
        }

        System.out.println(waveprint);
    }
}