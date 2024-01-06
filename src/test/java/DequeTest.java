import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import deque.Deque;

import java.util.NoSuchElementException;

public class DequeTest {
    @Test
    public void addFirstShouldAddItemToHeadOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        int expectedResult = 10;
        assertEquals(expectedResult, deque.peekFirst());
    }

    @Test
    public void addLastShouldAddItemToTailOfDeque() {
        Deque deque = new Deque();
        deque.addLast(5);
        deque.addLast(10);
        int expectedResult = 10;
        assertEquals(expectedResult, deque.peekLast());

    }

    @Test
    public void removeFirstShouldRemoveHeadOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        deque.removeFirst();
        int expectedResult = 5;
        assertEquals(expectedResult, deque.peekFirst());
    }

    @Test
    public void removeLastShouldRemoveTailOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        deque.removeLast();
        int expectedResult = 10;
        assertEquals(expectedResult, deque.peekFirst());
    }

    @Test
    public void getFirstShouldReturnHeadOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        int expectedResult = 10;
        assertEquals(expectedResult, deque.getFirst());
    }

    @Test
    public void getFirstShouldThrowNoSuchElementExceptionIfDequeIsEmpty() {
        Deque deque = new Deque();
        assertThrows(NoSuchElementException.class, deque::getFirst);
    }

    @Test
    public void getLastShouldReturnTailOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        int expectedResult = 5;
        assertEquals(expectedResult, deque.getLast());
    }

    @Test
    public void getLastShouldThrowNoSuchElementExceptionIfDequeIsEmpty() {
        Deque deque = new Deque();
        assertThrows(NoSuchElementException.class, deque::getLast);
    }

    @Test
    public void peekFirstShouldReturnHeadOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        int expectedResult = 10;
        assertEquals(expectedResult, deque.peekFirst());
    }

    @Test
    public void peekLastShouldReturnTailOfDeque() {
        Deque deque = new Deque();
        deque.addFirst(5);
        deque.addFirst(10);
        int expectedResult = 5;
        assertEquals(expectedResult, deque.peekLast());
    }




}

