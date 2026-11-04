package backtracking;

import java.util.ArrayList;
import java.util.List;

public class BT06_MobileKeypad {

    static void Solve( String mapping[] , int nosDigit , String digit , int startIndex, StringBuilder combination , List<String> allCombinations ){
        // base case is when we have successfully selected exactly tow chars from each digit
        if(combination.length() == nosDigit ){
            // we have succesfully made a combination
            allCombinations.add(combination.toString());
            return;
        }
        
        int firstDigit = Character.getNumericValue(digit.charAt(startIndex));

        for(int i = 0 ; i < mapping[firstDigit].length() ; i++){

            // include first char of first digit :: abc -> a
            combination.append(mapping[firstDigit].charAt(i));
            // combination = {a}

            // recursion will append first digit of 2nd digit's first char
            Solve( mapping , nosDigit , digit , startIndex + 1 , combination , allCombinations );
            // combination = {ad}

            // backtracking
            combination.deleteCharAt(combination.length() - 1);
            // combination = {a}
        }
    }
    public static void main(String[] args) {
        
        String mapping[] = { "" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz" };
    
        String digit = "23";

        int startIndex = 0;
    
        StringBuilder combination = new StringBuilder();
        
        List<String> allCombinations = new ArrayList<>(); 
    
        int nosDigit = digit.length();
            
        Solve( mapping , nosDigit , digit , startIndex , combination , allCombinations );

        System.out.println(allCombinations);
    }
}
