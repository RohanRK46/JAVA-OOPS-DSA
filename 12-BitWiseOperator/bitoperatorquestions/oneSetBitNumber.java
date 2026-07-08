package bitoperatorquestions;

public class oneSetBitNumber {
    public static void main(String[] args) {
            int num = 64;

    if((num & num - 1) == 0 ){
        System.out.println("only one set bit");
    }
    else{
        System.out.println("not belongs to the 2pow series 1 , 2 , 4 , 8 , 16 ...");
    }
    }

}
