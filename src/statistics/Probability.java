package statistics;

public class Probability {
    public static double chance(int totalPossibilities, int noOfTrails) {
        return (double) noOfTrails/totalPossibilities;
    }

    public static double notChance(int totalPossibilities, int noOfTrails) {
        return 1 -  Probability.chance(totalPossibilities, noOfTrails);
    }
}
