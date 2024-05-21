package files.cf.weed6arrays2.assignments;

import java.util.Scanner;

/**
 * An app that asks for six (6) integers from the user with values between 1 and 49. It informs the user if in those six
 * numbers are:
 * <ul>
 *     <li>no more than three even numbers</li>
 *     <li>no more than three odd numbers</li>
 *     <li>no more than three consecutive numbers</li>
 *     <li>no more than three numbers ending in the same unit digit</li>
 *     <li>no more than three numbers having the same tens digit</li>
 * </ul>
 *
 */
public class PredicatesApp {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[6];

        // User-Input code block
        System.out.println("Please give six numbers between 1 and 49.");
        populateByUser(arr);

        // User-Output code block
        System.out.print("Among those six integers (");
        customPrintArr(arr);
        System.out.println("):");
        System.out.println("- there are no more than three even numbers: _________________________"
                                                                                                 + upToThreeEvens(arr));
        System.out.println("- there are no more than three odd numbers: __________________________"
                                                                                                  + upToThreeOdds(arr));
        System.out.println("- there are no more than three consecutive numbers: __________________"
                                                                                           + upToThreeConsecutive(arr));
        System.out.println("- there are no more than three numbers ending in the same unit digit: "
                                                                                            + upToThreeSameEnding(arr));
        System.out.println("- there are no more than three numbers having the same tens digit: ___"
                                                                                              + upToThreeSameTens(arr));

    }

    /**
     * Populates an integer array with the values that the user gives. It ensures that
     * values are in range between 1 and 49 as it is specified by the exercise.
     *
     * @param arr       the array that will be populated by the user
     */
    public static void populateByUser(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // "i + 1" makes it user friendly
            System.out.println("Give a number for position " + (i + 1) + ":");
            int tmp = sc.nextInt();
            if (tmp > 0 && tmp < 50) {
                arr[i] = tmp;
            } else {
                System.out.println("The number must be between 1 and 49!");
                i--;                                                          // reduce counter by 1
            }
        }
    }

    /**
     * A custom array print method for the specific needs of this app.
     *
     * @param arr       the input array
     */
    public static void customPrintArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1]);
    }

    /**
     * Checks if the array has up to three even numbers (returns true).
     * Else returns false.
     *
     * @param arr       the input array
     * @return          false if more than three are found, true otherwise
     */
    public static boolean upToThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;

        for (int element : arr) {
            if (element % 2 == 0){
                evens++;
            }
        }
        return evens <= 3;
    }

    /**
     * Checks if the array has up to three odd numbers (returns true).
     * Else returns false.
     *
     * @param arr       the input array
     * @return          false if more than three are found, true otherwise
     */
    public static boolean upToThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;

        for (int element : arr) {
            if (element % 2 != 0) {
                odds++;
            }
        }
        return odds <= 3;
    }

    /**
     * Checks if the array has up to three consecutive numbers (returns true).
     * Else returns false.
     *
     * @param arr       the input array
     * @return          false if more than three are found, true otherwise
     */
    public static boolean upToThreeConsecutive(int[] arr) {
        if (arr == null) return false;
        int cons = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2)) {
                cons++;
            }
        }
        return cons <= 1;
    }

    /**
     * Checks if the array has up to three numbers with the same unit ending (returns true).
     * Else returns false.
     *
     * @param arr       the input array
     * @return          false if more than three are found, true otherwise
     */
    public static boolean upToThreeSameEnding(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean sameEndingLimit = true;

        for (int element : arr) {
            endings[element % 10]++;
        }
        for (int element : endings) {
            if (element > 3) {
                sameEndingLimit = false;
                break;
            }
        }
        return sameEndingLimit;
    }

    /**
     * Checks if the array has up to three numbers with the same tens digit (returns true).
     * Else returns false.
     *
     * @param arr       the input array
     * @return          false if more than three are found, true otherwise
     */
    public static boolean upToThreeSameTens(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean sameEndingLimit = true;

        for (int element : arr) {
            endings[(element % 100) / 10]++;
        }
        for (int element: endings) {
            if (element > 3) {
                sameEndingLimit = false;
                break;
            }
        }
        return sameEndingLimit;
    }
}
