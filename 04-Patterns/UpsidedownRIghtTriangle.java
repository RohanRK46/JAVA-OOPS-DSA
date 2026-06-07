public class UpsidedownRIghtTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = 1 ; 
            for (int j = 5; j >= i; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
