import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import linkedlist.LinkedList;

public class LinkedListTest {
    @Test
    public void addShouldReturnFirstValueWhenListNotEmpty() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        var result = linkedList.peek();
        assertEquals(10, result);
    }
    @Test
    public void peekShouldThrowRuntimeExceptionWhenListEmpty() {
        LinkedList linkedlist = new LinkedList();
        assertThrows(RuntimeException.class, linkedlist::peek);
    }
    @Test
    public void indexOfShouldReturnCorrectIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        var expectedValue = 1;
        var result = linkedList.indexOf(6);
        assertEquals(expectedValue, result);
    }

    @Test
    public void addFirstShouldAddItemToFrontOfList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.addFirst(10);
        var result = linkedList.peek();
        assertEquals(10, result);
    }

    @Test
    public void isEmptyShouldReturnTrueWhenListHasNoItems() {
        LinkedList linkedList = new LinkedList();
        var expectedValue = true;
        assertEquals(expectedValue, linkedList.isEmpty());
    }

    @Test
    public void isEmptyShouldReturnFalseWhenListHasItems() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        var expectedValue = false;
        assertEquals(expectedValue, linkedList.isEmpty());
    }

    @Test
    public void addLastShouldAddItemToEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.addLast(10);
        var expectedValue = 10;
        assertEquals(expectedValue, linkedList.peekLast());

    }
}
