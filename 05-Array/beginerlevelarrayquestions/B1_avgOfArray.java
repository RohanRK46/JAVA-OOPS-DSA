package beginerlevelarrayquestions;

class ArrayOperation0{
    static double getAverage( int arr[]){
        int length = arr.length;
        double avg = 0;
        int sum = 0;
        
        for(int i : arr){
            sum = sum + i;
        }

        avg = sum / length ;
        return avg;
    }
}

public class B1_avgOfArray {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30};
        System.out.println(ArrayOperation0.getAverage(arr));
    }
    
}
