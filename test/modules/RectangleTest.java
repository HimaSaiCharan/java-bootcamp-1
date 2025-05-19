package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void calculatesAreaWithPositiveDimensions() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());

        Rectangle rectangle1 = new Rectangle(4, 5);
        assertEquals(20, rectangle1.area());
    }

    @Test
    void calculatesAreaWithWidthZero() {
        Rectangle rectangle = new Rectangle(4, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesAreaWithLengthZero() {
        Rectangle rectangle = new Rectangle(0, 4);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesAreaWithDimensionsZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void calculatesPerimeterWithPositiveDimensions() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter());

        Rectangle rectangle1 = new Rectangle(3, 3);
        assertEquals(12, rectangle1.perimeter());
    }

    @Test
    void calculatesPerimeterWithLengthZero() {
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(6, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterWithWidthZero() {
        Rectangle rectangle = new Rectangle(3, 0);
        assertEquals(6, rectangle.perimeter());
    }

    @Test
    void calculatesPerimeterWithDimensionsZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.perimeter());
    }
}