package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeUnitTest {

    @Test
    void compareGallonAndLiter() {
        VolumeUnit liter = VolumeUnit.liter(3.78);
        VolumeUnit gallon = VolumeUnit.gallon(1);

        assertEquals(liter, gallon);
    }
}