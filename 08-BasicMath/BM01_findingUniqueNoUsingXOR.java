public class BM01_findingUniqueNoUsingXOR {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 10 , 20 , 43 , 16 , 17 , 16 , 17 };

        int uniqueNo = 0 ; 
        for(int num : arr ){
            uniqueNo = uniqueNo ^ num ;
        }
        System.out.println("Unique Number is :" + uniqueNo);
    }
}
