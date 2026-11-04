package problems;

public class LL01_ReversingLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL01_ReversingLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtTail(int value){
        Node newNode = new Node(value);
        // if list is empty
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void Traversal(){
        Node temp = head;

        for(int i = 1 ; i <= size ; i++){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void ReturnHead(){
        System.out.println(head.data);
        return;
    }

    public void ReturnTail(){
        System.out.println(tail.data);
        return;
    }

    public void ReverseLinkedList(){
        Node current = head;
        Node previous = null;
        
        while(current != null){
            Node forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        head = previous;
    }
    public static void main(String[] args) {
        LL01_ReversingLinkedList SinglyLinkedList = new LL01_ReversingLinkedList();
        SinglyLinkedList.insertAtTail(10);
        SinglyLinkedList.insertAtTail(20);
        SinglyLinkedList.insertAtTail(30);
        SinglyLinkedList.insertAtTail(40);
        SinglyLinkedList.insertAtTail(50);
        SinglyLinkedList.Traversal();

        SinglyLinkedList.ReverseLinkedList();
        SinglyLinkedList.Traversal();
    }
}
