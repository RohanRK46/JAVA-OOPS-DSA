package queue;
import java.util.*;

public class Q2_LinkedList {
    public static void main(String[] args) {
        Deque <Integer> Dll = new LinkedList<>();
        Dll.offer(10);
        Dll.offer(20);
        Dll.offer(30);

        Dll.pop();
        System.out.println(Dll);

    }
}
