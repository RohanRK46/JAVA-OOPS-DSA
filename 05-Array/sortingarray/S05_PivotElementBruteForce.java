package sortingarray;

public class S05_PivotElementBruteForce {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };

        int pivot = -1;
        
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            // for left sum
            for(int j = 0 ; j < i ; j++){
                leftSum = leftSum + arr[j];
            }

            // for right sum
            for(int j = i + 1 ; j < arr.length ; j++){
                rightSum = rightSum + arr[j];
            }

            if(leftSum == rightSum){
                pivot = arr[i];
                break;
            }
        }
        System.out.println("pivot element is : " + pivot);
    }
}