package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    private boolean isEmpty(){
        return size == 0;
    }
    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        if (tail == null){
            tail = newNode;
        }
    }

    private void addLast(int data){
        if (isEmpty()){
            addFirst(data);
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    private int removeFirst(){
        return 1;
    }

    private int removeLast(){
        return 1;
    }

}
