package queue;
import java.util.*;

public class Q4_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> ad = new PriorityQueue<>();
        ad.offer(30);
        ad.offer(40);
        ad.offer(10);
        ad.offer(20);

        System.out.println(ad);

        ad.poll();
        System.out.println(ad);
    }
}
