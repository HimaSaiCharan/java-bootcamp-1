package units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

    @Test
    void compareGallonAndLiter() {
        Volume liter = Volume.liter(3.78);
        Volume gallon = Volume.gallon(1);

        assertEquals(liter, gallon);
    }
}