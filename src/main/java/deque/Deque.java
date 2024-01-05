package deque;

import linkedlist.LinkedList;

import java.util.NoSuchElementException;

public class Deque {
    private LinkedList deque = new LinkedList();
    public void addFirst(int data) {
        deque.addFirst(data);
    }

    public void addLast(int data) {
        deque.addLast(data);
    }

    public int removeFirst() {
        return deque.removeFirst();
    }

    public int removeLast() {
        return deque.removeLast();
    }

    public int getFirst() {
        if (deque.isEmpty()) {
            throw new NoSuchElementException();
        }
        return deque.peekFirst();
    }

    public int peekFirst() {
        return deque.peekFirst();
    }

    public int getLast() {
        if (deque.isEmpty()) {
            throw new NoSuchElementException();
        }
        return deque.peekLast();
    }

    public int peekLast() {
        return deque.peekLast();
    }
}
