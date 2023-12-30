package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    private boolean isEmpty() {
        return size == 0;
    }

    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    private void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    private int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove an item from an empty list");
        }
        int headData = head.data;
        head.next.prev = null;
        head = head.next;
        size--;
        return headData;
    }

    private int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove an item from an empty list");
        }
        int tailData = tail.data;
        tail = tail.prev;
        if (tail != null){
            tail.next = null;
        }
        else {
            head = null;
        }
        size--;
        return tailData;


    }
}
