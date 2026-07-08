package beginerlevelarrayquestions;

public class B8_SwapAlternateElementInArray {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5 , 6};
        
        int newarr[] = new int[arr.length];

        // output = { 2 , 1 , 4 , 3 , 6 , 5};

        for(int i = 0 ; i < arr.length - 1; i++){

            int second = arr[i];
            int first = arr[i+1];

            first = first ^ second;
            second = first ^ second;
            first = first ^ second;

            newarr[i] = second;
            newarr[i+1] = first;
            i++;
        }

        for(int i : newarr){
            System.out.println(i);
        }
    }
}