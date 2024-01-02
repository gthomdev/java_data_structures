package stack;

import linkedlist.LinkedList;

import java.util.EmptyStackException;

public class Stack {
    LinkedList stack = new LinkedList();

    public int pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public void push(int data) {
        stack.addLast(data);
    }

    public int peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.peekLast();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
