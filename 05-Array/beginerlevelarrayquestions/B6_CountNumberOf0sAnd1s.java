package beginerlevelarrayquestions;

public class B6_CountNumberOf0sAnd1s {
    public static void main(String[] args) {
        int arr[] = {1 , 1 , 0 , 0 , 1 , 0 , 1 , 1 , 0 };
        int count0 = 0;
        int count1 = 0;

        for(int i : arr){
            if(i == 0){
                count0++;
            }
            else{
                count1++;
            }
        }

        System.out.println("No of 0s :" + count0);
        System.out.println("No of 1s :" + count1);
    }
    
}