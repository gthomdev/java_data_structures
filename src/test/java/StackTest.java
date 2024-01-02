import static org.junit.jupiter.api.Assertions.*;

import linkedlist.LinkedList;
import org.junit.jupiter.api.Test;
import stack.Stack;

import java.util.EmptyStackException;

public class StackTest {
    @Test
    public void pushShouldInsertItemOntoStack() {
        Stack stack = new Stack();
        stack.push(5);
        int expectedResult = 5;
        assertEquals(expectedResult, stack.peek());
    }

    @Test
    public void pushShouldInsertItemOnTopOfStack() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(2);
        int expectedResult = 2;
        assertEquals(stack.peek(), expectedResult);
    }

    @Test
    public void popShouldReturnLastItemAddedToStack() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        int expectedResult = 10;
        assertEquals(stack.pop(), expectedResult);
    }

    @Test
    public void popShouldThrowRuntimeErrorIfStackEmpty() {
        Stack stack = new Stack();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void peekShouldReturnMostRecentItemAddedToStack() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(2);
        int expectedResult = 2;
        assertEquals(stack.peek(), expectedResult);
    }

    @Test
    public void peekShouldThrowEmptyStackExceptionIfStackIsEmpty() {
        Stack stack = new Stack();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void emptyShouldReturnTrueIfStackIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.empty());
    }

    @Test
    public void emptyShouldReturnFalseIfStackIsNotEmpty() {
        Stack stack = new Stack();
        stack.push(5);
        assertFalse(stack.empty());
    }

}
