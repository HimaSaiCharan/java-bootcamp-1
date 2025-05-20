package units;

import java.util.Objects;

public class Volume {
    private final double unit;

    public Volume(double unit) {
        this.unit = unit;
    }

    public static Volume liter(double l) {
        return new Volume(convertToBase(l, 1));
    }

    public static Volume gallon(double gal) {
        return new Volume(convertToBase(gal, 3.78));
    }

    private static double convertToBase(double value, double factor) {
        return value * factor;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume)) return false;
        Volume that = (Volume) o;
        return Double.compare(unit, that.unit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unit);
    }
}
