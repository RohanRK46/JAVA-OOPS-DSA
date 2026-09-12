package basics;

public class BR06_FindTheTarget {

    static int findTheElem(int arr[] , int i , int target){

        if(i >= arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }
        i++;

        return findTheElem(arr, i, target);
    }
    public static void main(String[] args) {
        int arr[] = {20 , 40 , 30 , 20 , 10 };

        int target = 30;
        
        int i = 0;

        System.out.println(findTheElem(arr , i , target ));
    }
}
