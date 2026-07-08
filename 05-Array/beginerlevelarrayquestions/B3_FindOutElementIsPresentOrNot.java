package beginerlevelarrayquestions;

class ArrayOperation2{
    public static boolean presentInArray(int a , int arr[]) {
    int target = a;
    for(int i : arr){
        if(i == target){
            return true;
        }
    }  
    return false;
    }
}

public class B3_FindOutElementIsPresentOrNot {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40};
        System.out.println(ArrayOperation2.presentInArray(10, arr));
    }
}
