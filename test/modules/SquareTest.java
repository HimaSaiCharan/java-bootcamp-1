package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculatesAreaWithPositiveSides() {
        Square square = new Square(2);
        assertEquals(4, square.area());

        Square square1 = new Square(3);
        assertEquals(9, square1.area());
    }

    @Test
    void calculatesAreaWithZero() {
        Square square = new Square(0);
        assertEquals(0, square.area());
    }

    @Test
    void calculatesPerimeterWithPositiveSides() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());
        Square square1 = new Square(3);
        assertEquals(12, square1.perimeter());
    }

    @Test
    void calculatesPerimeterWithZero() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }
}