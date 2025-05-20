package units;

import java.util.Objects;

public class VolumeUnit {
    private final double value;

    public VolumeUnit(double value) {
        this.value = value;
    }

    public static VolumeUnit liter(double value) {
        return new VolumeUnit(value);
    }

    public static VolumeUnit gallon(double value) {
        return new VolumeUnit(value * 3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VolumeUnit)) return false;
        VolumeUnit that = (VolumeUnit) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
