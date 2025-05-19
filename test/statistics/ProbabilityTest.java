package statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void tailProbability() {
        Probability tailProbability = Probability.create(0.5);
        assert(tailProbability.equals(Probability.create(0.5)));
    }

    @Test
    void notTailProbability() {
        Probability notTailProbability = Probability.create(0.5).complement();
        assert(notTailProbability.equals(Probability.create(0.5)));
    }

    @Test
    void gettingTailsWhenTwoCoinsFlipped() {
        Probability tailProbability = Probability.create(0.5).and(Probability.create(0.5));
        assert(tailProbability.equals(Probability.create(0.25)));
    }

    @Test
    void invalidProbabilityForCreation() {
        assertThrows(RuntimeException.class, ()->Probability.create(2));
        assertThrows(RuntimeException.class, ()->Probability.create(-3));
    }
}