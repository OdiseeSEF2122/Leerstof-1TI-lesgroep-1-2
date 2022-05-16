package inheritance.intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedIntListTest {
    private SortedIntList list;

    private void addValues(){
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(8);
        list.add(9);
    }

    @BeforeEach
    public void setup(){
        list = new SortedIntList();
    }

    @Test
    public void add_withNoElements_Succeeds(){
        // Arrange

        // Act
        list.add(0);

        // Assert
    }

    @Test
    public void remove_WithElements_ReturnsCorrectElement(){
        // Arrange
        addValues();

        // Act
        Integer result = list.remove(2);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void remove_WithNoElements_ReturnsNull(){

        // Arrange

        // Act
        Integer result = list.remove(2);

        // Assert
        assertNull(result);
        //assertEquals(null, result);
    }

    @Test
    public void findMin_WithElements_ReturnsCorrectElement(){
        // Arrange
        addValues();

        // Act
        Integer result = list.findMin();

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void findMin_WithNoElements_ReturnsNull(){

        // Arrange

        // Act
        Integer result = list.findMin();

        // Assert
        assertNull(result);
        //assertEquals(null, result);
    }
}