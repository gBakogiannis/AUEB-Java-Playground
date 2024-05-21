package files.cf.week6arrays1.assignments;

/**
 * An app that finds the position of the second minimum value in an array of integers.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class FindSecondMinApp {

    public static void main(String[] args) {

        int[] arr = {4, 5, 8, 7, -1, 3, 9, 6};

        int minPosition = getSecondMinPosition(arr, 0, arr.length);

        // "minPosition + 1" makes it user-friendly.
        System.out.printf("Minimum value: %d\tPosition: %d%n", arr[minPosition], minPosition + 1);
    }

    /**
     * It finds the position of the minimum element in an array.
     *
     * @param arr       the array to be searched
     * @param low       array index search starting point inclusively. [low....high)
     * @param high      array index search stop point exclusively. [low....high)
     * @return          minimum element's position in the array
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        int arrayPosition = 0;
        int minValue = arr[0];

        for (int i = low + 1; i < high; i++) {
            if (arr[i] < minValue) {
                arrayPosition = i;
                minValue = arr[i];
            }
        }

        return arrayPosition;
    }

    /**
     * It finds the position of the second minimum value in an array.
     *
     * @param arr       the array to be searched
     * @param low       array index search starting point inclusively. [low....high)
     * @param high      array index search stop point exclusively. [low....high)
     * @return          second minimum element's position in the array
     */
    public static int getSecondMinPosition(int[] arr, int low, int high) {
        int firstMin = getMinPosition(arr, low, high);
        int arrayPosition = 0;
        int minValue = arr[0];

        for (int i = low + 1; i < high; i++) {
            if (arr[i] < minValue && i != firstMin) {
                arrayPosition = i;
                minValue = arr[i];
            }
        }

        return arrayPosition;
    }
}
