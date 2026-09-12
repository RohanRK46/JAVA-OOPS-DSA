package basics;

public class BR02_PrintNto1 {

    static void printNto1(int n ){
        int end = 0;

        if(n <= end ){
            return;
        }

        System.out.println(n);
        n--;
        printNto1(n);
    }
    public static void main(String[] args) {
        printNto1(5);
    }
}
