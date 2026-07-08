package basicquestions;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String str = sc.nextLine();

        String[] arr = str.split((" "));
        int count = arr.length;
        System.out.println("Number of words are : "+ count);
    }
}
