package basics;

public class DoublyLinkedList {

    static class Node {

        Node previous;
        int data;
        Node next;

        Node(int data) {
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // method to insert at head
    public void insertAtHead(int value) {
        Node newNode = new Node(value);

        // if there is just one node
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
        return;
    }

    // method to insert at tail

    public void insertAtTail(int value) {

        Node newNode = new Node(value);
        // if there is just one node
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    // method to insert at any position

    public void insertAtPosition(int value, int position) {

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            insertAtHead(value);
            return;
        }

        if (position == size + 1) {
            insertAtTail(value);
            return;
        }

        Node temp = head;

        Node newNode = new Node(value);

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        // now temp is facing at position

        Node previousNode = temp;
        Node nextNode = temp.next;

        nextNode.previous = newNode;
        previousNode.next = newNode;

        newNode.previous = previousNode;
        newNode.next = nextNode;

        size++;
        return;
    }

    public void TraversalStart() {
        Node temp = head;

        for (int i = 0; i < size; i++) {

            if(i == 0){
                System.out.print("<-" + temp.data + "<->");
            }
            else if(i == size - 1){
                System.out.println(temp.data + "->");
            }
            else{    
                System.out.print( temp.data + "<->");
            }
            temp = temp.next;
        }
        System.out.println();

        return;
    }

    public void deleteAtHead(){

        // if only one node is there
        if(head == null){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return ;
        }

        head = head.next;
        head.previous = null;
        size--;
    }

    public void deleteAtTail(){

        Node temp = tail;

        if(head == null){
            return;
            // since linked list is alredy empty
        }

        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        temp = temp.previous;
        temp.next = null;
        tail = temp;
        size--;

        // tail = tail.previous;
        // tail.next = null;
        // size--;
    }

    public void deleteAtPosition(int position){
        
        if(position < 1 || position > size + 1){
            System.out.println("Invalid Position");
            return;
        }

        if(position == 1){
            deleteAtHead();;
            return;
        }

        if(position == size){
            deleteAtTail();
            return;
        }

        // main logic
        Node temp = head;

        for(int i = 1 ; i < position - 1 ; i++){
            temp = temp.next;

            // temp is one node before position
        }

        temp.next = temp.next.next;
        temp.next.previous = temp;
        size--;

    }

    public void deleteValue( int value ){
        
        // handeling with empty DoublyLinkedList
        if(head == null){
            return;
        }

        boolean found = false;
        // main logic
        Node temp = head;
        
        while(temp != null){
            if(temp.data == value){

                found = true;

                // handeling with 1 node case
                if(head == tail){
                    head = null;
                    tail = null;
                    size = 0;
                    return;
                }
                
                if(temp == head){
                    deleteAtHead();
                    temp = head;
                    continue;
                }

                if(temp == tail){
                    deleteAtTail();
                    temp = null;
                    break;
                }

                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                size--;
                temp = temp.next;
            }
            else{
                temp = temp.next;
            }
        }
        
        if(found == false){
            System.out.println("No such value found");
        }
        return;
    }

    public void DeleteFirstValue(int value){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp != null){

            if(temp.data == value){

                // handeling single node case
                if(head == tail){
                    head = null;
                    tail = null;
                    size = 0;
                    return;
                }

                // if value is same at position 1
                if(temp == head){
                    deleteAtHead();
                    return;
                }

                // if value is same at end node
                if(temp == tail){
                    deleteAtTail();
                    return;
                }

                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                size--;
                return;
            }
            temp = temp.next;
        }

        System.out.println("No such value found");
    }

    public void changeFirstValue(int current , int newValue){

    }

    // public boolean changeAllValue(){

    // }

    // public int sizeOfDoublyLinkedList(){

    // }
    
    // public void clearAll(){

    // }

    public static void main(String[] args) {
        DoublyLinkedList newDLL = new DoublyLinkedList();

        newDLL.insertAtHead(10);
        newDLL.TraversalStart();

        newDLL.insertAtHead(20);
        newDLL.TraversalStart();

        newDLL.insertAtTail(30);
        newDLL.TraversalStart();

        newDLL.insertAtPosition(2, 3);
        newDLL.TraversalStart();
        
        newDLL.deleteAtPosition(4);
        newDLL.TraversalStart();
        
    }

}
