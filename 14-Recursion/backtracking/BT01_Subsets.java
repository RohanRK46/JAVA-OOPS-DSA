package backtracking;
import java.util.List;
import java.util.ArrayList;

// note :: you have to return list of list of integer

public class BT01_Subsets {

    static void Solve(int arr[] , int index , List<List<Integer>> collection , List<Integer> value){
        // basecase 
        if(index > arr.length - 1){
            collection.add(new ArrayList<>(value));
            return;
        }

        //include case
        value.add(arr[index]);
        Solve(arr, index + 1, collection, value);

        //exclude case
        value.remove(value.size() - 1);
        Solve(arr, index + 1, collection, value);

    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3};
        int index = 0;
        List<List<Integer>> collection = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        Solve(arr , index , collection , value);
        collection.sort((a,b) -> b.size() - a.size());
        System.out.println(collection);
    }
}