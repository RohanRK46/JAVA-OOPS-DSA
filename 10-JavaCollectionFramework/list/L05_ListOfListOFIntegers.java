package list;

import java.util.ArrayList;
import java.util.List;

public class L05_ListOfListOFIntegers {
    public static void main(String[] args) {

        List<List<Integer>> listonKaiList = new ArrayList<>();

        listonKaiList.add(new ArrayList<>(List.of(1 , 2 , 3)));
        listonKaiList.add(new ArrayList<>(List.of(1 )));
        listonKaiList.add(new ArrayList<>(List.of(1 , 2 )));

        System.out.println(listonKaiList);

    }
}
