package binarysearch;

public class A07_BookAllocationProblem {

    static boolean isValidAns(int arr[] , int mid , int x){

        int maxStudentCount = x;
        int maxpages = mid;

        int student = 1;
        int pages = 0;

        for(int i = 0 ; i < arr.length ; i++){
            
            if(arr[i] > maxpages){
                return false;
            }
            if(pages + arr[i] <= maxpages ){
                // jitne pages assign kr sakta hu 1st student ko utne kr dunga
                pages = pages + arr[i];
                // untill limit excedes
            }
            else{
                // student count increse karna pdega
                student++;
                // pr count increse karne se pehle check karunga ki totalnumber of student se 
                // jada toh nhi
                if(student > maxStudentCount){
                    return false;
                }
                else{
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }

    static int Bookallocation(int arr[] , int x ){
        int start = 0;
        
        // calculating sum of array
        int sum = arr[arr.length - 1];
        for(int a : arr){
            sum = sum + a;
        }
        
        // allocating sum to end
        int end = sum ;

        int ans = -1;

        while ( start <= end ) {
            int mid = start + (end - start) / 2 ;
            if( isValidAns(arr , mid , x) ){
                // true
                ans = mid;
                end = mid - 1;

            }
            else{
                start = mid + 1;
            }
        }
        return ans;        
    }

    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};

        System.out.println(Bookallocation(arr, 2));
    }
}
