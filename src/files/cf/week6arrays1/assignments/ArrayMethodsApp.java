package files.cf.week6arrays1.assignments;

import java.util.Arrays;

/**
 * A collection of five array methods:
 * <ul>
 *     <li>getPosition</li>
 *     <li>printEvenNumbers</li>
 *     <li>mappingBy2x</li>
 *     <li>checkForPositiveNum</li>
 *     <li>areAllPositive</li>
 * </ul>
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class ArrayMethodsApp {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, -1, 8, 6, 11, 9, -11, 7, 4, 5, 3, 10};
        int key = 2;
        int position = 0;

        try {
            position = getPosition(arr, key, 0, arr.length);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // "position + 1" makes it user-friendly
        System.out.printf("Key value: %d\tPosition: %d%n", key, position + 1);

        printEvenNumbers(arr, 0, arr.length);

        int[] mappedArray = mappingBy2x(arr, 0, arr.length);
        printArray(mappedArray);

        boolean positiveExists = checkForPositiveNum(arr, 0, arr.length);
        System.out.println("There is at least one positive value in array \"arr\": " + positiveExists);

        boolean areAllPositive = areAllPositive(arr, 0, arr.length);
        System.out.println("All elements in array \"arr\" are positive numbers: " + areAllPositive);

    }

    /**
     * Gets the position of an element.
     *
     * @param arr               the input array
     * @param element           the element we are searching for
     * @param low               array index search starting point inclusively. [low....high)
     * @param high              array index search stop point exclusively. [low....high)
     * @return                  elements position
     * @throws Exception        throws exception if element in not in array
     */
    public static int getPosition(int[] arr, int element, int low, int high) throws Exception {
        int position = -1;

        for (int i = low; i < high; i++) {
            if (arr[i] == element) {
                position = i;
            }
        }

        if (position == -1) throw new Exception("There is no such element in the array.");

        return position;
    }

    /**
     * Prints only the even numbers of an array.
     *
     * @param arr               the input array
     * @param low               array index search starting point inclusively. [low....high)
     * @param high              array index search stop point exclusively. [low....high)
     */
    public static void printEvenNumbers(int[] arr, int low, int high) {
        for (int i = low; i < high; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Returns a new array where his elements are the elements of the old array multiplied by 2. The user selects the
     * index range where multiplication will take place. Elements out of the specified range are simply copied to the
     * new array unchanged.
     *
     * @param arr               the input array
     * @param low               array index search starting point inclusively. [low....high)
     * @param high              array index search stop point exclusively. [low....high)
     * @return                  a new array with his elements multiplied by 2
     */
    public static int[] mappingBy2x(int[] arr, int low, int high) {
        int[] mappedArray = Arrays.copyOf(arr, arr.length);

        for (int i = low; i < high; i++) {
            mappedArray[i] = arr[i] * 2;
        }

        return mappedArray;
    }

    /**
     * Checks if there is at least one positive number in the array.
     *
     * @param arr               the input array
     * @param low               array index search starting point inclusively. [low....high)
     * @param high              array index search stop point exclusively. [low....high)
     * @return                  true if there is at least one positive number, else returns false
     */
    public static boolean checkForPositiveNum(int[] arr, int low, int high) {
        boolean positiveExists = false;

        for (int i = low; i < high; i++) {
            if (arr[i] > 0) {
                positiveExists = true;
                break;
            }
        }

        return positiveExists;
    }

    /**
     * Checks if all the elements of the array are positive.
     *
     * @param arr               the input array
     * @param low               array index search starting point inclusively. [low....high)
     * @param high              array index search stop point exclusively. [low....high)
     * @return                  true if all elements are positive, else returns false
     */
    public static boolean areAllPositive(int[] arr, int low, int high) {
        boolean allArePositive = true;

        for (int i = low; i < high; i++) {
            if (arr[i] < 0) {
                allArePositive = false;
                break;
            }
        }

        return allArePositive;
    }

    /**
     * Prints the array's elements
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
