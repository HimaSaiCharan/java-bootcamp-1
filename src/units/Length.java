package units;

import java.util.Objects;

public class Length {
    private final double unit;

    private Length(double unit) {
        this.unit = unit;
    }

    public static Length inch(double in) {
        return new Length(convertToBaseUnit(in, 12));
    }

    private static double convertToBaseUnit(double value, double factor) {
        return value / factor;
    }

    public static Length feet(double ft) {
        return new Length(convertToBaseUnit(ft, 1));
    }

    public static Length centimeter(double cm) {
        return new Length(convertToBaseUnit(cm, 12 * 2.5));
    }

    public static Length millimeter(double mm) {
        return new Length(convertToBaseUnit(mm ,12 * 2.5 * 10));
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
