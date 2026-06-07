class digitprint{
    static void digitmodprint(int num){

        int numrev = 0;
        while(num != 0){
           int digit = num % 10 ;
           num = num / 10 ;
           System.out.println(digit);
           numrev = numrev * 10 + digit ; 
        }
        System.out.println("Reverse of digits is : " + numrev);
    }
}

class digitcounter {
    static void countdigit(int num){
        int count = 0;
        while(num != 0 ){
            count = count + 1;
            num = num / 10 ;
        }
        System.out.println(count);
    }
}

public class printingAllDigitandRevUsingMod {
    public static void main(String[] args) {
        digitprint.digitmodprint(1234);
        digitcounter.countdigit(1234567);
    }
}
