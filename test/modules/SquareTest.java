package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculatesAreaWithPositiveSides() {
        Square square = new Square(2);
        assertEquals(4, square.area());
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
    }

    @Test
    void calculatesPerimeterWithZero() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }
}