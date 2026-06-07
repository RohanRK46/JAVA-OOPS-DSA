class gcd {
    static void gcdOfTwoNumber(int a , int b){
        // Euclidens algorithm
        // GCD = GCD(a,b) = gcd(b , a%b) till b (!= 0) and i also know when b = 0 , value of a is GCD
        while(b != 0){
            int temp = b ;
            b = a % b ;
            a = temp ; 
        }
        System.out.println("GCD = " + a );


    }
}

public class gcdFinder {
    public static void main(String[] args) {
        gcd.gcdOfTwoNumber(15, 20);
    }
}
