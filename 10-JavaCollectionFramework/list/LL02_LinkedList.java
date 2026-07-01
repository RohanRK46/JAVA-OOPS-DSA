// linked List can be made exactly same was as ArrayList and all methods are valid 
// in linked list as well , except clone(); and 3 extra methods peek() , poll() , offer()

// Linked List have three fields [ prev ] [ Actual data ] [ Next ]

// prev contains the address of previous element (null if first element)
// next contians the address of next element (null if last element)
package list;

import java.util.*;

public class LL02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(10);
        llist.add(20);
        llist.add(30);
        llist.add(5);

        System.out.println(llist);

        // all methods of ArrayList will work here as well

        llist.sort(null);
        System.out.println(llist);

        LinkedList<Integer> llist2 = new LinkedList<>();
        System.out.println(llist2);

        // System.out.println(llist2.getFirst()); 
        // this thorws exception error (no such element)

        System.out.println(llist2.peek()); // this returns null is object is empty

        System.out.println(llist.offer(999)); // returns boolean if adding was success or not 
    }
}