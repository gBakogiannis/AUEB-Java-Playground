package files.cf.weed6arrays2;

/**
 * Demonstrates Array Mapping.
 */
public class Mapping {

    public static void main(String[] args) {
        int[] salaries = {1000, 1200, 900, 1700};
        final double BONUS = 0.25;
        double[] wages = getWagesWithBonus(salaries, BONUS);
        for (double wage : wages) {
            System.out.printf("%.2f ", wage);
        }
    }

    /**
     * Returns a new array of the wages plus the bonus.
     *
     * @param wages     the array of initial wages.
     * @param bonus     the bonus, i.e. 0.10, as a
     *                  percentage of the wage
     * @return          the updated wages
     */
    public static double[] getWagesWithBonus(int[] wages, double bonus) {
        if (wages == null) return null;
        double[] passedOut = new double[wages.length];

        for (int i = 0; i < wages.length; i++) {
            passedOut[i] = wages[i] + wages[i] * bonus;
        }
        return passedOut;
    }
}
