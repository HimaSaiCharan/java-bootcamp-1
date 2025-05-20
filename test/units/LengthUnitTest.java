package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthUnitTest {
    @Test
    void compareFeetAndInch() {
        LengthUnit feet = LengthUnit.feet(1);
        LengthUnit inch = LengthUnit.inch(12);

        assertEquals(feet, inch);
    }

    @Test
    void compareCmAndInch() {
        LengthUnit cm = LengthUnit.centimeter(10);
        LengthUnit inch = LengthUnit.inch(4);

        assertEquals(cm, inch);
    }

    @Test
    void compareCmAndMm() {
        LengthUnit cm = LengthUnit.centimeter(1);
        LengthUnit mm = LengthUnit.millimeter(10);

        assertEquals(cm, mm);
    }
}