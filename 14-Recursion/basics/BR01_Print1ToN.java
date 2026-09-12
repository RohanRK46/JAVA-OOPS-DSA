package basics;

public class BR01_Print1ToN {

    static void oneToNprint(int start , int n ){

        if( start > n ){
            return;
        }

        System.out.println(start);
        start++;

        oneToNprint(start , n);
        
    }

    public static void main(String[] args) {
        oneToNprint(1, 5);
    }
}
