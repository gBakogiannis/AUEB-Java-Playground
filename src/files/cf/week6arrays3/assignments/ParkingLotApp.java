package files.cf.week6arrays3.assignments;

/**
 * It reads and prints the maximum number of vehicles that were parked in a parking lot simultaneously.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class ParkingLotApp {

    public static void main(String[] args) {
        int[][] arrivalDepartureTimes = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        // Original array
        System.out.println("The original array is:");
        printArray(arrivalDepartureTimes);

        // "Custom" array
        System.out.println("The \"custom\" array is:");
        int[][] cArray = createCustomArray(arrivalDepartureTimes);
        printArray(cArray);

        // Sorted array
        System.out.println("The sorted array is:");
        int[][] sArray = mergeSortByFirstCol(cArray, 0, cArray.length - 1);
        printArray(sArray);

        // Number of vehicles parked simultaneously
        int simultaneously = getMaxSimultaneousVehicles(sArray);
        System.out.printf("The number of vehicles that were parked simultaneously in the parking lot was: %d.%n",
                                                                                                        simultaneously);
    }

    /**
     * It creates and returns a "custom array". It takes as an input a two-dimensional integer array which has stored
     * data of the arrival-time and departure-time for each vehicle in a parking lot. The input array is of the form:
     *
     *                                                                              {{arrival-time, departure-time},
     *                                                                               ...,
     *                                                                               ...,
     *                                                                               ...,
     *                                                                               {arrival=time, departure-time}}
     *
     * It then creates and returns a "custom" integer array of size (2 * inputArray.length) * 2. The "custom" array
     * has all the arrival and departure times of the input array in its first column. In the second column the value 1
     * indicates arrival time and the value 0 indicates departure time.
     *
     * @param arr           The input array.
     * @return              "Custom" array with all the arrival and departure times of the input array. In the second
     *                      column 1 indicates arrival-time, 0 indicates departure-time.
     */
    public static int[][] createCustomArray(int[][] arr) {
        int[][] customArray = new int[2 * arr.length][2];

        // In the even positions of the "custom" array add the arrival-times indicated by value "1" in the second
        // column.
        for (int i = 0; i < customArray.length; i += 2) {
            customArray[i][0] = arr[i/2][0];
            customArray[i][1] = 1;
        }

        // In the odd positions of the "custom" array add the departure-times indicated by value "0" in the second
        // column.
        for (int i = 1; i < customArray.length; i += 2) {
            customArray[i][0] = arr[i/2][1];
        }

        return customArray;
    }

    /**
     * It sorts the input array BY FIRST COLUMN VALUE ONLY using a "Merge Sort" algorithm and returns the sorted array.
     *
     * @param arr       The input array.
     * @param left      The left split of the array.
     * @param right     The right split of the array.
     * @return          The sorted array.
     */
    public static int[][] mergeSortByFirstCol(int[][] arr, int left, int right) {
        // if arr.length <= 1 return arr
        if (right - left <= 0) return new int[][] { arr[right] };

        // choose a pivot -> middle - easy split
        int middle = (right + left) / 2;

        int[][] leftArr = mergeSortByFirstCol(arr, left, middle);
        int[][] rightArr = mergeSortByFirstCol(arr, middle + 1, right);

        return merge(leftArr, rightArr);
    }

    /**
     * Merges two split parts of an array as part of the "Merge Sort" algorithm.
     *
     * @param leftArr           The left split of the array.
     * @param rightArr          The right split of the array.
     * @return                  The merged array containing elements from both splits, sorted in ascending order.
     */
    public static int[][] merge(int[][] leftArr, int[][] rightArr) {
        int[][] merged = new int[leftArr.length + rightArr.length][2];
        int i = 0, j = 0, k = 0;

        while ((i < leftArr.length) && (j < rightArr.length)) {
            if (leftArr[i][0] > rightArr[j][0]) {
                merged[k++] = rightArr[j++];
            } else {
                merged[k++] = leftArr[i++];
            }
        }

        while (i < leftArr.length) {
            merged[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            merged[k++] = rightArr[j++];
        }

        return merged;
    }

    /**
     * Returns an integer representing the maximum number of vehicles that were parked in the parking lot
     * simultaneously.
     *
     * @param arr           The input array. ("Custom" array created with "createCustomArray" method.)
     * @return              The maximum number of vehicles that were parked simultaneously.
     */
    public static int getMaxSimultaneousVehicles(int[][] arr) {
        int maxSimultaneousVehicles = 0;
        int counter = 0;

        for (int[] element : arr) {
            if (element[1] == 1) {
                counter++;
                if (counter > maxSimultaneousVehicles) {
                    maxSimultaneousVehicles = counter;
                }
            } else {
                counter--;
            }
        }

        return maxSimultaneousVehicles;
    }

    /**
     * It prints the input array.
     *
     * @param arr       The input array.
     */
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}