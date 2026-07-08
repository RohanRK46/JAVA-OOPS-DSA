package bitoperatorquestions;

public class Swapping2NumbersUsingXOR {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("old value of a : " +  a);
        System.out.println("old value of b : " +  b);


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("new value of a : " +  a);
        System.out.println("new value of b : " +  b);
    }
}
