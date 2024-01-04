import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.Queue;

public class QueueTest {

    @Test
    public void addShouldAddElementToEndOfQueue() {
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        int expectedResult = 5;
        assertEquals(expectedResult, queue.peek());
    }

    @Test
    public void offerShouldAddElementToEndOfQueue() {
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        int expectedResult = 5;
        assertEquals(expectedResult, queue.peek());
    }

    @Test
    public void removeShouldRemoveHeadOfQueue() {
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        int expectedResult = 5;
        assertEquals(expectedResult, queue.remove());
    }

    @Test
    public void elementShouldReturnHeadOfQueue() {
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        int expectedResult = 5;
        assertEquals(expectedResult, queue.element());
    }

    @Test
    public void peekShouldReturnHeadOfQueue() {
        Queue queue = new Queue();
        queue.add(5);
        queue.add(10);
        int expectedResult = 5;
        assertEquals(expectedResult, queue.element());
    }

    @Test
    public void peekShouldReturnNullIfQueueEmpty() {
        Queue queue = new Queue();
        assertNull(queue.peek());
    }



    //element
    //offer
    //peek
    //poll
    //remove
}
