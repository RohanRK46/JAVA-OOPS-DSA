package queue;
import java.util.*;

public class Q1_BasicsOfAllClass {
    public static void main(String[] args) {
        ArrayDeque <Integer> Dq = new ArrayDeque<>();
        Dq.offerFirst(10);
        Dq.offer(20);
        Dq.offer(30);
        Dq.offerLast(40);

        // basically you can use all the first and last methods using reference 
        // of dedicated class or Deque

        System.out.println(Dq);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        Deque <Integer> stack2 = new ArrayDeque<>();
        System.out.println("Implementing stack2");
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);

        System.out.println(stack2);

        stack2.pop();

        // why we are creating stack with Deque when it has a dedicated interface because of such 
        // method which makes no sense to stack

        // stack2.addFirst(10);
        // stack2.addLast(20);

        System.out.println("final Stack2 : " + stack2);
        System.out.println(stack2.containsAll(stack));

    }
}
