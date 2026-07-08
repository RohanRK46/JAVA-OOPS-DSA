package sortingarray;

public class S01_BruteForceZerosAndOnes1 {
    public static void main(String[] args) {
        int arr[] = {1 , 1, 0 , 0 , 1 , 0 , 1 , 0 , 1 };

        int ZeroCount = 0;
        int OneCount = 0;       

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0 ){
                ZeroCount = ZeroCount + 1;
            }
            else{
                OneCount = OneCount + 1;
            }
        }

        System.out.println("Zero count : " + ZeroCount);
        System.out.println("Ones Count : " + OneCount);

        int sortedArr[] = new int[arr.length];
        for(int i = 0 ; i < ZeroCount ; i++){
            sortedArr[i] = 0 ; 
        }
        for(int i = ZeroCount ; i < sortedArr.length ; i++){
            sortedArr[i] = 1 ;
        }

        for(int a : sortedArr ){
            System.out.print(a + " ");
        }
    }
}
