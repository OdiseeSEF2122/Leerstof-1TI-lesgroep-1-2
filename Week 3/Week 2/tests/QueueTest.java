import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue queue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    public void store_WhenCalled_RememberObject(){
        // Arrange
        int element = 5;

        // Act
        queue.store(element);

        // Assert
        assertNotNull(queue);
    }

    @Test
    public void release_withElementStored_ReturnsElement(){
        // Arrange
        queue.store(5);

        // Act
        int result = queue.release();

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void release_withReleasedElement_ReturnsNull(){
        // Arrange
        queue.store(5);
        queue.release();

        // Act
        Integer result = queue.release();

        // Assert
        assertNull(result);
    }

    @Test
    public void release_withMultipleElementsStored_ReturnElementsFIFO(){
        // Arrange
        queue.store(5);
        queue.store(10);
        queue.store(15);

        // Act

        // Assert
        assertEquals(5, queue.release());
        assertEquals(10, queue.release());
        assertEquals(15, queue.release());
    }

    @Test
    public void queue_defaultCtor_CanStore5elements(){
        // Arrange
        queue.store(5);
        queue.store(10);
        queue.store(15);
        queue.store(20);
        queue.store(25);
        queue.store(30);

        // Act

        // Assert
        assertEquals(5, queue.release());
        assertEquals(10, queue.release());
        assertEquals(15, queue.release());
        assertEquals(20, queue.release());
        assertEquals(25, queue.release());
        assertEquals(null, queue.release());


    }

    @Test
    public void queue_CtorWithMax3_CanStore3elements(){
        // Arrange
        queue = new Queue(3);
        queue.store(5);
        queue.store(10);
        queue.store(15);
        queue.store(20);

        // Act

        // Assert
        assertEquals(5, queue.release());
        assertEquals(10, queue.release());
        assertEquals(15, queue.release());
        assertEquals(null, queue.release());
    }
}