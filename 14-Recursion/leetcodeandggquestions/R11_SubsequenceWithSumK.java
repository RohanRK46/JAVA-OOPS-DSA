package leetcodeandggquestions;

public class R11_SubsequenceWithSumK {

    static boolean HaveSubsequenceWithValueK(int arr[] , int k , int index){
        if(index > arr.length - 1){
            if(k == 0){
                return true;
            }
            else{
                return false;
            }
        }

        // include case
        boolean include = HaveSubsequenceWithValueK(arr, k - arr[index], index + 1);

        // exclude case
        boolean exclude = HaveSubsequenceWithValueK(arr, k, index + 1);

        return include || exclude;

    }
    public static void main(String[] args) {
        int arr[] = {10 , 1 , 2 , 7 , 6 , 1 , 5 };
        int k = 8;
        int index = 0;

        boolean ans = HaveSubsequenceWithValueK(arr , k , index);
        System.out.println(ans);
    }
}
