package beginerlevelarrayquestions;

public class B10_MaxproductOf2Number {
    public static void main(String[] args) {
        
        int arr[] = {1 , 2 , 3 , 4 , 5 , 6 };

        // i need max product of 2 number 
        // i need to find two biggest number


        int max = 0;
        
        // this will get the heightest value
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }

        // 2nd largest number

        int max2 = 0;

        int start = 0;
        while(start <= arr.length - 1){
            if(arr[start] == max){
            }
            else{
                if(arr[start] > max2){
                    max2 = arr[start];
                }
            }
            start++;
        }

        System.out.println( max * max2 );

    }
}
