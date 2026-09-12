package basics;

public class BR07_CountTheElementInArray {

    static int FrequencyOfTarget(int arr[] , int target , int i){
        if(i >= arr.length) return 0;

        int count = 0;

        if(arr[i] == target ){
            count++;
        }
        i++;

        return count + FrequencyOfTarget(arr, target, i);

    }
    public static void main(String[] args) {
        int arr[] = { 20 , 30 , 10 , 20 , 10 , 10 , 40 };
        int target = 10;
        int i = 0;

        System.out.println(FrequencyOfTarget(arr , target , i));
    }
}
