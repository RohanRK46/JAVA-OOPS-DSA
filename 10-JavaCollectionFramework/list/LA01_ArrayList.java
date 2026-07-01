package list;

import java.util.*;

public class LA01_ArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();

        // to insert elements in implementations

        arrayList1.add(1); // index 0
        arrayList1.add(2); // index 1
        arrayList1.add(3); // index 2 -- this gets removed at line 17
        arrayList1.add(4); // index 3
        arrayList1.add(5); // index 4

        // to remove elements in implementation
        arrayList1.remove(3);

        // indices remaind 0 , 1 , 2 , 3
        // arrayList1.remove(4); // this giving out of bound error
        arrayList1.remove(3); // this works

        List<Integer> arrList2 = new ArrayList<>();

        arrList2.add(6);
        arrList2.add(7);

        // for adding two diffrent arraylist
        arrayList1.addAll(arrList2);

        // for removing all elements of array from one array to another
        // but make sure all similar elements will also be removed
        arrayList1.removeAll(arrList2);

        System.out.println(arrayList1);

        Iterator<Integer> it = arrList2.iterator();

        while (it.hasNext()) {
            System.out.println("Element : " + it.next());
        }

        List<Integer> arrList3 = new ArrayList<>();
        arrList3.add(10);

        arrList3.add(35);

        arrList3.add(22);

        arrList3.add(26);

        arrList3.add(18);

        // sort function allows to sort List's dedicated functions 

        arrList3.sort((a, b) -> b - a);
        System.out.println(arrList3);

        arrList3.sort((a, b) -> a - b);
        System.out.println(arrList3);

        arrList3.sort((a, b) -> {
            if (a < b)
                return -1;
            else if (a > b)
                return 1;
            else
                return 0;
        });

        System.out.println(arrList3);

        List<Integer> arrList3clone = new ArrayList<>(arrList3);
        System.out.println(arrList3clone);

        System.out.println(arrList3clone.get(2));

        // earlier List : 10 , 18 , 22 , 26 , 35 

        arrList3clone.add(2, 21);
        System.out.println(arrList3clone);
        // expected List : 10 , 18 , 21 , 22 , 26 , 35  
        arrList3clone.replaceAll(n -> n*2);
        System.out.println(arrList3clone);
    }
}
