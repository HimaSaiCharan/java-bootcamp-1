package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void compareFeetAndInch() {
        Length feet = Length.feet(1);
        Length inch = Length.inch(12);

        assertEquals(feet, inch);
    }

    @Test
    void compareCmAndInch() {
        Length cm = Length.centimeter(10);
        Length inch = Length.inch(4);

        assertEquals(cm, inch);
    }

    @Test
    void compareCmAndMm() {
        Length cm = Length.centimeter(1);
        Length mm = Length.millimeter(10);

        assertEquals(cm, mm);
    }

    @Test
    void addTwoLengthValues() {
        Length measurement1 = Length.inch(2);
        Length measurement2 = Length.inch(2);

        assertEquals(Length.inch(4), measurement1.add(measurement2));

        Length measurement3 = Length.inch(1);
        Length measurement4 = Length.inch(2);

        assertEquals(Length.inch(3), measurement3.add(measurement4));
    }
}