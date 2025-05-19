package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void calculatesArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());

        Rectangle rectangle4 = new Rectangle(4, 5);
        assertEquals(20, rectangle4.area());

        Rectangle rectangle1 = new Rectangle(0, 0);
        assertEquals(0, rectangle1.area());

        Rectangle rectangle2 = new Rectangle(4, 0);
        assertEquals(0, rectangle2.area());

        Rectangle rectangle3 = new Rectangle(0, 4);
        assertEquals(0, rectangle3.area());
    }

    @Test
    void calculatesPerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());

        Rectangle rectangle1 = new Rectangle(3, 3);
        assertEquals(12, rectangle1.perimeter());

        Rectangle rectangle2 = new Rectangle(0, 3);
        assertEquals(6, rectangle2.perimeter());

        Rectangle rectangle3 = new Rectangle(3, 0);
        assertEquals(6, rectangle3.perimeter());

        Rectangle rectangle4 = new Rectangle(0, 0);
        assertEquals(0, rectangle4.perimeter());
    }
}