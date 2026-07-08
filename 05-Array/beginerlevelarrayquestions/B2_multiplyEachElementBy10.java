package beginerlevelarrayquestions;

class ArrayOperation1{
    static int[] arrayMultiply10( int arr[]) {
        int length = arr.length;
        int newarr[] = new int[length]; 
        for(int i = 0 ; i < length ; i++){
            int num = arr[i] * 10 ;
            newarr[i] = num;
        }
    return newarr;
    }

}

public class B2_multiplyEachElementBy10 {
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6 , 8};
        int ans[] = ArrayOperation1.arrayMultiply10(arr);
        for(int i : ans){
            System.out.println(i);
        }
        
    }
}
