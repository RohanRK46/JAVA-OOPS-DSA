package basics;

public class BR08_PrintNumbers {

    static void PrintNum(int num){

        if(num == 0){
            return;
        }

        int digit = num % 10;
        
        // updating the digit here
        num = num / 10;
        
        PrintNum(num);
        System.out.println(digit);

    }

    public static void main(String[] args) {
        int num = 127;
        // output required 1 , 2 , 7
        PrintNum(num);
    }
    
}
