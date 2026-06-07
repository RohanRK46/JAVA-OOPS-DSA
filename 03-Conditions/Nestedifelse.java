import java.util.Scanner;

public class Nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks :");
        int marks = sc.nextInt();

        if(marks >= 35){
            if(marks >= 75){
                System.out.println("Distinction");
            }
            else if(marks >= 60){
                System.out.println("first class");
            }
            else{
                System.out.println("pass");
            }
        }
        else{
            System.out.println("fail");
        }
    }
}
