package units;

import java.util.Objects;

public class Length {
    private final double unit;

    private Length(double unit) {
        this.unit = unit;
    }

    public static Length inch(double value) {
        return new Length(value / 12);
    }

    public static Length feet(double value) {
        return new Length(value);
    }

    public static Length centimeter(double value) {
        return new Length(value / (12 * 2.5));
    }

    public static Length millimeter(double value) {
        return new Length(value / (12 * 2.5 * 10));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length)) return false;
        Length unit1 = (Length) o;
        return Double.compare(unit, unit1.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }
}
