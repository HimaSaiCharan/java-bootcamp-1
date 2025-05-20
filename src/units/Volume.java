package units;

import java.util.Objects;

public class Volume {
    private final double value;

    public Volume(double value) {
        this.value = value;
    }

    public static Volume liter(double value) {
        return new Volume(value);
    }

    public static Volume gallon(double value) {
        return new Volume(value * 3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume)) return false;
        Volume that = (Volume) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
