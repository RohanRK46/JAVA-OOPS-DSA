package beginerlevelarrayquestions;

class ArrayProblem{
    static int[] getCommonElement(int arr1[] , int arr2[]) {

        int newarr[] = new int[arr1.length];

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    newarr[i] = arr2[j];
                }
            }
        }
    return newarr;
    }
}

public class B9_CommonElementInTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1 , 2 , 3 , 4};
        int arr2[] = { 3 , 4 , 5 , 6};

        int newarr[] = new int[arr1.length];
        newarr = ArrayProblem.getCommonElement(arr1, arr2);

        for(int i : newarr){
            System.out.println(i);
        }
    }
}
