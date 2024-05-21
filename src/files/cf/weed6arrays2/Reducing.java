package files.cf.weed6arrays2;

/**
 * Demonstrates Reducing an array to
 * single value, e.g. total, avg.
 */
public class Reducing {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Total: " + getTotal(arr));
        System.out.printf("Average: %.2f", getAvg(arr));
    }

    /**
     * Returns the sum of the array elements.
     *
     * @param arr       the source array
     * @return          the total (sum)
     */
    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total;
    }

    /**
     * Returns the average of the array elements.
     *
     * @param arr       the source array.
     * @return          the average.
     */
    public static double getAvg(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return (double) total / arr.length;
    }
}
