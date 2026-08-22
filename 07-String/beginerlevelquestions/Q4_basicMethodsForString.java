package beginerlevelquestions;

public class Q4_basicMethodsForString {
    public static void main(String[] args) {
        String s = "abcpqabc";
        System.out.println(s.contains("pq"));
        
        // so if we know size of pq say pq = 2 length;
        // suppose indexOf is giving start index of that substring then  (indexOf + 1)
        // will be end index

        String Part = "pq";
        while(s.contains(Part)){
            int index = s.indexOf(Part);

            s = s.substring(0, index) + s.substring( index + Part.length());
        }
        
        System.out.println(s);
    }
}
