package arraycomparator;

import java.util.Comparator;

public class RevComp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2 ;

        // lets talk about descending
        // +Ve means ie o1 = 9 , o2 = 5 { 9 - 5 } = +ve thus 9 comes before 5 
        // -Ve means ie o1 = 4 , o2 = 5 { 4 - 5 } = -ve that means 5 comes before 4 
        // 0 means no change in order
        // +ve , -ve , 0 
    }

    
}
