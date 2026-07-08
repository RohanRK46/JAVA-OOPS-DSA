package bitoperatorquestions;

public class OddOrEvenUsingBitOpertor {
    public static void main(String[] args) {
        int num = 6;
        if((num & 1) == 1 ){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
