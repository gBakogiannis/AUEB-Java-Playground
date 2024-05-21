package files.cf.week6arrays3.assignments;

/**
 * Finds the high and low index of an array, where a key value exists.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class LowHighApp {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] lowHighIndex = getLowAndHighIndexOf(arr, 8);

        printArray(lowHighIndex);
    }

    /**
     * Checks if a key value exists in an ordered integer array. If key value exists, it returns the lowest and the
     * highest array index where the key value occurs. Else throws RuntimeException.
     *
     * @param arr       the input array
     * @param key       the key value to be searched in the array
     * @return          an array of size two (2) with the lowest and the highest array index where the key value occurs
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        if (arr == null) throw new RuntimeException();

        boolean keyExists = false;
        int lowIndex = 0;
        int highIndex = 0;
        int[] lowHighIndexArr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                keyExists = true;
                lowIndex = i;
                highIndex = i;
                break;
            }
        }

        if (!keyExists) throw new RuntimeException("Key does not exist in the array!");

        for (int j = lowIndex + 1; j < arr.length; j++) {
            if (arr[j] == key) highIndex++;
        }

        lowHighIndexArr[0] = lowIndex;
        lowHighIndexArr[1] = highIndex;

        return lowHighIndexArr;
    }

    /**
     * Prints the array's elements.
     *
     * @param arr   the input array
     */
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
