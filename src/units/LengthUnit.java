package units;

import java.util.Objects;

public class LengthUnit {
    private final double unit;

    private LengthUnit(double unit) {
        this.unit = unit;
    }

    public static LengthUnit inch(double value) {
        return new LengthUnit(value / 12);
    }

    public static LengthUnit feet(double value) {
        return new LengthUnit(value);
    }

    public static LengthUnit centimeter(double value) {
        return new LengthUnit(value / (12 * 2.5));
    }

    public static LengthUnit millimeter(double value) {
        return new LengthUnit(value / (12 * 2.5 * 10));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LengthUnit)) return false;
        LengthUnit unit1 = (LengthUnit) o;
        return Double.compare(unit, unit1.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }
}
