package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int data) {
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

    public boolean add(int data) {
        addLast(data);
        return true;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot peek item from an empty list");
        }
        return head.data;
    }

    public int peekFirst() {
        return peek();
    }

    public int peekLast() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot peek item from an empty list");
        }
        return tail.data;
    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove an item from an empty list");
        }
        int headData = head.data;
        head.next.prev = null;
        head = head.next;
        size--;
        return headData;
    }

    public int removeLast() {
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

    public int indexOf(int data){
        if (isEmpty()){
            return -1;
        }
        int index = -1;
        Node node = head;
        while (node.next != null) {
            if (node.next.data == data) {
                index++;
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }
}
