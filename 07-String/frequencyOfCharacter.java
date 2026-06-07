import java.util.Scanner;

public class frequencyOfCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        // accessing string chars
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            freq[ch]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0 ){
                System.out.println("frequency of "+ (char)i + " = " + freq[i] );
            }
        }
    }
}