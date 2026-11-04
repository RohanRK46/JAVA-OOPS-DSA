package basics;

public class SinglyLinkedList {
    
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

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        
        // if LL is empty or size == 0 or head and tail == null
        if( head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);

        if( head == null && tail == null){
            // LL is empty and its going to be head and tail
            head = newNode;
            tail = newNode;
        }
        
        else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void insertAtPosition(int position , int data){
        // make sure position starts from 1 to size
        if(position < 1 || position > size + 1){
            // invalid case
            System.out.println("cannot insert at positon");
            return;
        }

        if(position == 1){
            insertAtHead(data);
            return;
        }

        if(position == size + 1){
            insertAtTail(data);
            return;
        }

        // insert at postion method
        // reach to the previous node of position
        Node PreviousNode = head;

        for(int i = 1; i < position - 1; i++){
            PreviousNode = PreviousNode.next;
        }

        Node newNode = new Node(data);

        newNode.next = PreviousNode.next;
        PreviousNode.next = newNode;

        size++;
    }

    public void Traversal(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    public void getSize(){
        System.out.println("LinkedList size : " + size);
        return;
    }

    public boolean isEmpty(){
        if(head == null){
            System.out.println("LinkedList is Empty !!");
            return true;
        }
        return false;
    }

    public int getHead(){
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }

    public int getTail(){
        if(tail == null){
            return -1;
        }
        else{
            return tail.data;
        }
    }

    public void clear(){
        if(head == null && tail == null){
            System.out.println("alredy cleared !!");
            return;
        }
        head = null;
        tail = null;
        size = 0;
    }

    public boolean SearchValue(int value){
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int PositionOf(int value){

        Node temp;
        temp = head;

        int count = 0;
    
        while(temp != null){
            count++;
            if(temp.data == value){
                return count;
            }
            temp = temp.next;
        }

        // return -1 if does not exisit
        return -1;
    }

    public void UpdateAtPosition(int position , int value){

        // invalid position case
        if( position < 1 || position > size ){
            System.out.println("Input Not Possible");
            return;
        }

        Node temp;
        temp = head;

        for(int i = 1 ; i < position ; i++){
            temp = temp.next;
        }

        temp.data = value;
    }

    public boolean UpdateAtValue( int currentValue , int newValue){

        Node temp;
        temp = head;

        for(int i = 1 ; i <= size ; i++ ){

            if(temp.data == currentValue){
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public boolean DeleteAtPosition(int position){
        
        if(position < 1 || position > size){
            System.out.println("Position invalid");
            return false;
        }
        
        Node temp = head;

        // deletion at postion 1
        if(position == 1 ){
            if(temp.next == null){
                // LL exist further
                head = null;
                tail = null;
                size = 0;
                return true;
            }
            else{
                temp = temp.next;
                head = temp;
                size--;
                return true;
            }
        }

        Node temp2;
        temp2 = head;

        // deletion at tail ( last position )
        if( position == size ){
            for(int i = 1 ; i < size - 1 ; i++){
                temp2 = temp2.next; 
            }
            tail = temp2;
            temp2.next = null;
            size--;
            return true;
        }

        // temp ko position - 1 tk leke jana h aur usse next kai next se join kr dena h with size--;
        for(int i = 1; i < position - 1 ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
        return true;
    }

    public boolean DeleteAtHead(){
        Node temp = head;

        // single length LinkedList
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return true;
        }

        head = temp.next;
        size--;
        return true;
    }

    public void DeleteAtTail(){
        Node temp = head;

        // empty LinkedList
        if(head == null){
            return;
        }

        // single eleement
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        
        for(int i = 1 ; i < size - 2 ; i++){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
        System.out.println("Deletion at tail successfull!!");
        return;
    }

    public void UpdateValue(int current , int newValue){
        Node temp = head;

        for(int i = 1 ; i <= size ; i++){
            if(temp.data == current){
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
        return;
    }

    // public booolean DeleteValue(int value){

    // }
    public static void main(String[] args) {
        SinglyLinkedList newLList = new SinglyLinkedList();
        
        // newLList.isEmpty();

        newLList.insertAtHead(10);
        // newLList.Traversal();
        newLList.insertAtHead(20);
        // newLList.Traversal();
        newLList.insertAtHead(30);
        // newLList.Traversal();
        newLList.insertAtHead(40);
        // newLList.Traversal();
        
        newLList.insertAtTail(5);
        // newLList.Traversal();

        newLList.insertAtPosition(1, 15);
        // newLList.Traversal();

        newLList.insertAtPosition(7, 100);
        newLList.Traversal();

        // System.out.println(newLList.getHead());
        // System.out.println(newLList.getTail());

        // newLList.getSize();

        // System.out.println(newLList.SearchValue(100));
        // System.out.println(newLList.PositionOf(40));
        
        newLList.UpdateAtPosition(5, 11);
        
        newLList.UpdateAtPosition(7, 300);
        newLList.Traversal();

        newLList.UpdateAtValue(5, 55);
        newLList.Traversal();

        newLList.DeleteAtPosition(7);
        newLList.Traversal();

        newLList.UpdateValue(40, 44);
        newLList.Traversal();

        newLList.DeleteAtHead();
        newLList.Traversal();

        newLList.DeleteAtTail();
        newLList.Traversal();

    }
}
