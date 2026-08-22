package binarysearch;

public class A14_FIndTheUniqueElement {

    static int UniqueElement(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // if element behind mid is not equals to mid and element after mid is not equals 
            // that means its the ans;

            if( (mid - 1 >= 0 && arr[mid] != arr[mid - 1]) &&  (mid + 1 <= end && arr[mid] != arr[mid + 1])){
                return mid;
            }

            // now suppose mid is not the answer
            // we need to move left or right
            if(arr[mid] == arr[mid - 1] || arr[mid] == arr[mid + 1]){
                if (mid - 1 % 2 == 0){
                    // which means first number is starting with even this means 
                    // out ans is in right side
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10 , 10 , 20 , 30 , 30 , 40 , 40 , 50 , 50};
        System.out.println(UniqueElement(arr));
    }
     
}