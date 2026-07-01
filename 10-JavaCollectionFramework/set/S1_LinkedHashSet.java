package set;
import java.util.*;

public class S1_LinkedHashSet {
    public static void main(String[] args) {
    
// LinkedHashSet retains the order of insertion 

        Set <Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(10);
        lhs.add(10);
        lhs.add(30);
        lhs.add(40);

        System.out.println(lhs);
    }
}
