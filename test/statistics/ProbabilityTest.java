package statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void tailProbability() {
        assertEquals(0.5, Probability.chance(2, 1));
    }

    @Test
    void notTailProbability() {
        assertEquals(0.5, Probability.notChance(2, 1));
    }
}