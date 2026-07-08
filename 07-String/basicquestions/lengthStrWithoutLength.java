package basicquestions;
public class lengthStrWithoutLength {
    public static void main(String[] args) {
        String str = "rohan";
        int length = 0 ;

        char[] arr = str.toCharArray();

        for(char a : arr){
            length = length + 1;
        }
        System.out.println(length);
    }
}
