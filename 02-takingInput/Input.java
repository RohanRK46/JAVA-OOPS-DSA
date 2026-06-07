import java.util.Scanner;

public interface Input {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your first number :");
    int a = sc.nextInt();
    System.out.print("enter your second number :");
    int b = sc.nextInt();

    int c = a + b;
    System.out.print("addition of two numbers are :");
    System.out.println(c);

 }   
}