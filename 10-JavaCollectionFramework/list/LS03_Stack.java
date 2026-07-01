package list;
import java.util.*;

public class LS03_Stack {
    public static void main(String[] args) {

        // Stack works on principal of Last in first out , provided some methods that works that way
        //
        Stack <Integer> StackList1 = new Stack<>();
        
        // push is to add element in tial
        StackList1.push(10);
        StackList1.push(20);
        StackList1.push(30);
        StackList1.push(40);
        StackList1.push(50);

        System.out.println(StackList1);

        // pop is to remove element from tail
        StackList1.pop();

        System.out.println(StackList1);

        // peek() gives the top most element that can be accessed at given hand

        System.out.println(StackList1.peek());

        // search() is used to check if element is in object or not returns -1 false and rest 
        // postion based on from top to bottom 1 , 2 , 3 , 4 ...

        System.out.println(StackList1.search(10));

        // empty()

        System.out.println(StackList1);
        System.out.println(StackList1.empty());
        System.out.println(StackList1.isEmpty());

        Stack <Integer> StackList2 = new Stack<>();
        System.out.println(StackList2);
        System.out.println(StackList2.empty());
        System.out.println(StackList2.isEmpty());


    }
}
