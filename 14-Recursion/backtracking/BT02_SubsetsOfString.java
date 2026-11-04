package backtracking;
import java.util.ArrayList;
import java.util.List;

public class BT02_SubsetsOfString {

    static void Solve(String str ,int index , StringBuilder subset , List<List<String>> superset){
        if(index > str.length() - 1){
            // subset is ready insert it into superset    
            superset.add(new ArrayList<>(List.of(subset.toString())));
            return;
        }

        subset.append(str.charAt(index));
        Solve(str , index + 1 , subset , superset );

        // backtracking
        subset.deleteCharAt(subset.length() - 1);
        Solve(str , index + 1 , subset , superset );


    }
    public static void main(String[] args) {
        String str = "abc";
        int index = 0;

        StringBuilder subset = new StringBuilder();
        List<List<String>> superset = new ArrayList<>();

        Solve(str , index , subset , superset );
        System.out.println(superset);
    }
    
}