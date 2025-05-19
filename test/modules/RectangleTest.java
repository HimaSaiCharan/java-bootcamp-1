package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());

        Rectangle rectangle1 = new Rectangle(0, 0);
        assertEquals(0, rectangle1.area());

        Rectangle rectangle2 = new Rectangle(4, 0);
        assertEquals(0, rectangle2.area());

        Rectangle rectangle3 = new Rectangle(0, 4);
        assertEquals(0, rectangle3.area());
    }


    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());

        Rectangle rectangle1 = new Rectangle(3, 3);
        assertEquals(12, rectangle1.perimeter());
    }
}