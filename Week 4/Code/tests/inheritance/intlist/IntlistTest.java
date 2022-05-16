package inheritance.intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntlistTest {

    private Intlist intlist;

    private void addValues(){
        intlist.add(5);
        intlist.add(4);
        intlist.add(3);
        intlist.add(2);
        intlist.add(1);
        intlist.add(0);
        intlist.add(8);
        intlist.add(9);
    }

    @BeforeEach
    public void setup(){
        intlist = new Intlist();
    }

    @Test
    public void add_withNoElements_Succeeds(){
        // Arrange

        // Act
        intlist.add(0);

        // Assert
    }

    @Test
    public void remove_WithElements_ReturnsCorrectElement(){
        // Arrange
        addValues();

        // Act
        Integer result = intlist.remove(2);

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void remove_WithNoElements_ReturnsNull(){

        // Arrange

        // Act
        Integer result = intlist.remove(2);

        // Assert
        assertNull(result);
        //assertEquals(null, result);
    }

    @Test
    public void findMin_WithElements_ReturnsCorrectElement(){
        // Arrange
        addValues();

        // Act
        Integer result = intlist.findMin();

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void findMin_WithNoElements_ReturnsNull(){

        // Arrange

        // Act
        Integer result = intlist.findMin();

        // Assert
        assertNull(result);
        //assertEquals(null, result);
    }
}