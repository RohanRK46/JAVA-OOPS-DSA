package kadanealgorithm;

public class A01_maxSubArray{
    public static void main(String[] args) {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    
    for(int i = 0 ; i < arr.length ; i++){
        sum = sum + arr[i];

        if(maxSum < sum){
            maxSum = sum;
        }
        if(sum < 0){
            sum = 0;
        }
    }
    System.out.println(maxSum);
    }
}