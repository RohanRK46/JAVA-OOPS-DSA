import java.util.Scanner;

public class basicInbuildMethodStr {
    public static void main(String[] args) {
        // taking input .next() and .nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string1 : ");
        String str1 = sc.next(); 
        sc.nextLine();  // why this line is important becuase if not for this line 
        // the leftover string will be used by 2nd line

        System.out.println("Enter your 2nd Striing : ");
        String str2 = sc.nextLine();

        System.out.print("value you took with next :" + str1);
        // takes valiue only till the first space
        System.out.println();

        System.out.println("value you took with nextline :" + str2);
        // takas value as entire line

        // String comparison

        // this only checks if string refernce is same or not
        if(str1 == str2){
            System.out.println("String Reference is same");
        }
         else{
            System.out.println("String Reference is not same");
         }

        // this checks if all alphabets are equall with casesensitivity
        if(str1.equals(str2)){
            System.out.println("string is same form letter to letter");
         }
         else{
            System.out.println("string is not same form letter to letter");
         }
        
        // this compares string wihtout casesensityvisty
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("String is same but letter might be upper or lower case");
        }
        else{
            System.out.println("String is not same even without casesensitivity");
        }

        // string
        String str3 = new String("  Babubhaii  ");

        System.out.println(str3.charAt(2));
        System.out.println(str3.charAt(2+4));

        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        // removes all unnessary space before and after
        String str3mirror = str3.trim();
        System.out.println(str3mirror);

        System.out.println(str3.length());

        // returns bullian valaue and checks if string is empty or not even empty space counts as space
        System.out.println(str3.isEmpty());

        // actually checks if there is anything in string or not empty space does not count
        System.out.println(str3.isBlank());
        
        // gives substring with starting index , lastindex - 1
        System.out.println(str3.substring(2,10));
        
        // checks string if it conatins something
        System.out.println(str3.contains(" "));
        System.out.println(str3.contains("bubu"));

    }
}
