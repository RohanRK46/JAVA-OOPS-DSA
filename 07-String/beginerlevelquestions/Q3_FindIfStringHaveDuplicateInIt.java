package beginerlevelquestions;

public class Q3_FindIfStringHaveDuplicateInIt {
    public static void main(String[] args) {
        String str1 = "rohann";

        boolean haveduplicate = false;

        for(int i = 0 ; i < str1.length() ; i++){
            for(int j = 0 ; j < i ; j++){
                if(str1.charAt(i) == str1.charAt(j)){

                    haveduplicate = true;
                    break;
                }
            }
        }

        System.out.println(haveduplicate);
    }
}
