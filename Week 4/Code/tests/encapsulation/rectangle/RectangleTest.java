package encapsulation.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea_WithLengthChanged_AreaChangedAsWell() {
        // Arrange
        Rectangle rectangle = new Rectangle(5.25451, 10);
        rectangle.setLength(5.68415);

        // Act
        double area = rectangle.getArea();

        // Assert
        // derde parameter in assertEquals is hoever de double ernaast mag zitten
        assertEquals(29.86, area, 0.01);
    }
}