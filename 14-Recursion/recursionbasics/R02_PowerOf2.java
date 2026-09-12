package recursionbasics;

public class R02_PowerOf2 {

    static int PowerOf2(int n){
        if(n == 0){
            return 1;
        }

        return 2 * PowerOf2(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(PowerOf2(2));
    }
}
