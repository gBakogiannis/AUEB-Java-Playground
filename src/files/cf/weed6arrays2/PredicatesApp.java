package files.cf.weed6arrays2;

public class PredicatesApp {

    public static void main(String[] args) {

        int[] arr = {1, 3, 10, 6, 8, 4, 5, 6, 15, 35};

        System.out.println("Array \"arr\" has more than two evens: " + moreThanTwoEvens(arr));
        System.out.println("Array \"arr\" has more than two odds: " + moreThanTwoOdds(arr));
        System.out.println("Array \"arr\" has more than two consecutive numbers: " + moreThanTwoConsecutive(arr));
        System.out.println("Array \"arr\" has more than two same ending numbers: " + moreThanTwoSameEndings(arr));

    }

    /**
     * Traverses an array to decide if the array
     * involves more than two even numbers.
     *
     * @param arr       the source array.
     * @return          true, if the array contains
     *                  more than two evens, false otherwise.
     */
    public static boolean moreThanTwoEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 2;
    }

    /**
     * Traverses an array to decide if the array
     * involves more than two odd numbers.
     *
     * @param arr       the source array
     * @return          true, if the array contains
     *                  more than two odds, false otherwise.
     */
    public static boolean moreThanTwoOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0)
                odds++;
        }
        return odds > 2;
    }

    /**
     * Traverses an array to decide if the array
     * involves more than two consecutive numbers.
     *
     * @param arr   the source array
     * @return      true, if array contains
     *              more than two consecutive, false otherwise.
     */
    public static boolean moreThanTwoConsecutive(int[] arr) {
        if (arr == null) return false;
        int cons = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] -1) && (arr[i] == arr[i+2] - 2)) {
                cons++;
            }
        }
        return cons >= 1;
    }

    /**
     * Checks if the array contains more than two
     * numbers with the same ending.
     *
     * @param arr       the source array
     * @return          true, if the array contains more than
     *                  two numbers with the same ending, false otherwise.
     */
    public static boolean moreThanTwoSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }
}
