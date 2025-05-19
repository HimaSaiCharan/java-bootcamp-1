package statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void tailProbability() throws InvalidProbabilityException {
        Probability tailProbability = Probability.create(0.5);
        assertEquals(tailProbability, Probability.create(0.5));
    }

    @Test
    void notTailProbability() throws InvalidProbabilityException {
        Probability notTailProbability = Probability.create(0.5).not();
        assertEquals(notTailProbability, Probability.create(0.5));
    }

    @Test
    void gettingTailsWhenTwoCoinsFlipped() throws InvalidProbabilityException {
        Probability tailProbability = Probability.create(0.5).and(Probability.create(0.5));
        assertEquals(tailProbability, Probability.create(0.25));
    }

    @Test
    void invalidProbabilityForCreation() {
        assertThrows(InvalidProbabilityException.class, ()->Probability.create(2));
        assertThrows(InvalidProbabilityException.class, ()->Probability.create(-3));
    }

    @Test
    void gettingAtLeastATailWhenTwoCoinsFlipped() throws InvalidProbabilityException {
        Probability tailProbability = Probability.create(0.5).or(Probability.create(0.5));
        assertEquals(tailProbability, Probability.create(0.75));
    }
}