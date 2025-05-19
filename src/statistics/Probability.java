package statistics;

public class Probability {
    public static double chance(int totalOutcomes, int favourableOutcomes) {
        return (double) favourableOutcomes/totalOutcomes;
    }

    public static double notChance(int totalOutcomes, int favourableOutcomes) {
        return 1 -  Probability.chance(totalOutcomes, favourableOutcomes);
    }
}
