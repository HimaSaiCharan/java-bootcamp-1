package statistics;

import java.util.Objects;

public class Probability {
    private final double probability;

    private  Probability(double probability) {
        this.probability = probability;
    }

    public static Probability create(double probability) {
        if (probability > 1 || probability < 0) throw new RuntimeException("Invalid Probability");

        return new Probability(probability);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability)) return false;
        Probability that = (Probability) o;
        return Double.compare(probability, that.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public Probability not() {
        return new Probability(1 - this.probability);
    }

    public Probability and(Probability otherProbability) {
        return Probability.create(otherProbability.probability * probability);
    }

    public Probability or(Probability otherProbability) {
        return not().and(otherProbability.not()).not();
    }
}
