package queue;

import linkedlist.LinkedList;

import java.util.NoSuchElementException;

public class Queue {
    private LinkedList queue = new LinkedList();
    public boolean add(int data) {
        queue.addLast(data);
        return true;
    }

    public int element() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.peek();
    }

    public boolean offer(int data) {
        queue.addLast(data);
        return true;
    }

    public java.lang.Integer peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.peek();
    }

    public int poll() {
        return queue.peek();
    }

    public int remove() {
        return queue.removeFirst();
    }
}
