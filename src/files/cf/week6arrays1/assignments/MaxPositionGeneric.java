package files.cf.week6arrays1.assignments;

/**
 * Objective. Create a generic getMaxPosition method. Make it error-prone free and bug free by trying every possible
 * wrong input case. Test it.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class MaxPositionGeneric {

    public static void main(String[] args) {

        int maxPosition1 = -1;
        int maxPosition2 = -1;
        int[] arr = {1, 0, 2, -1, 8, 6, 11, 9, -11, 7, 4, 5, 3, 10};
        int[] arr2 = {7};   // getMaxPosition also works with singleton arrays

        try {
            maxPosition1 = getMaxPosition(arr, 0, arr.length);
        } catch (Exception e) {}

        try {
            maxPosition2 = getMaxPosition(arr2, 0, arr2.length);
        } catch (Exception e) {}

        // "maxPosition + 1" makes it user-friendly.
        System.out.printf("MAX value: %d\tMAX position: %d%n", arr[maxPosition1], maxPosition1 + 1);
        System.out.printf("MAX value: %d\tMAX position: %d%n", arr2[maxPosition2], maxPosition2 + 1);

        // getMaxPosition testing with invalid input. The objective is that error codes are returned appropriately.
        try {
            int test1 = getMaxPosition(arr, -1, arr.length);
        } catch (Exception e) {}                                                // test passed

        try {
            int test2 = getMaxPosition(arr, 0, 100);
        } catch (Exception e) {}                                                // test passed

        try {
            int test3 = getMaxPosition(arr, 7, 7);
        } catch (Exception e) {}                                                // test passed
    }

    /**
     * Returns the position of the maximum value in an array of integers.
     *
     * @param arr       array input of type Integer
     * @param low       array index search starting point inclusively. [low....high)
     * @param high      array index search stop point exclusively. [low....high)
     * @return          array index of the maximum value. In case that user's input is invalid it returns error codes
     *                  -1, -2, -3, (see comments in method).
     */
    public static int getMaxPosition(int[] arr, int low, int high) throws Exception {
        int arrayPosition = -4;     // Initialize array position with -4 for debugging purposes. If no bugs are left
                                    // arrayPosition always takes the values from 0 to 2,147,483,647 after proper
                                    // method call.

        int errorCode = -5;         // Initialize errorCode with -5 for debugging purposes. If no bugs are left
                                    // errorCode only takes values: 0, -1, -2, -3.

        errorCode = isValidInput(arr, low, high);       // isValidInput call for input validation.

        if (errorCode != 0) {                           // if errorCode != 0 (0 means input is valid) call
            displayErrorMessages(errorCode);            // displayErrorMessages to display the appropriate message.
            throw new Exception();
        }

        int max = arr[low];                             // max must be initialized AFTER throw new Exception();. Else
                                                        // invalid input may not be handled properly.

        if (high - low != 1) {                          // Ensures that search range is > 1. Else search range = 1.
            for (int i = low + 1; i < high; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    arrayPosition = i;
                }
            }
        } else arrayPosition = low;                     // Sets arrayPosition = low which is valid because the search
                                                        // range is of size 1.

        return arrayPosition;
    }

    /**
     * Checks if user-input is valid for the getMaxPosition method. If error code = 0 it means that the user input is
     * valid. Else it is not valid.
     *
     * @param arr       array input of type Integer
     * @param low       array index search starting point inclusively. [low....high)
     * @param high      array index search stop point exclusively. [low....high)
     * @return          error code from 0 (0 means input is valid) to -3
     */
    public static int isValidInput(int[] arr, int low, int high) {
        int errorCode = 0;                                  // Default. If input is valid, remains unchanged.

        if (low < 0) errorCode = -1;                        // low can not be negative
        if (high > arr.length) errorCode = -2;              // high can not be bigger than the array size
        if (high - low <= 0) errorCode = -3;                // search index range must always be greater than
                                                            // or equal to 1.

        return errorCode;
    }

    /**
     * Displays the appropriate error message for each error code (-1, -2, -3).
     *
     * @param errorCode     the error code that isValidInput returns (-1, -2, -3)
     */
    public static void displayErrorMessages(int errorCode) {
        switch (errorCode) {
            case -1:
                System.out.printf("- Error with:%nError Code: -1. int low argument can not be negative.%n");
                break;
            case -2:
                System.out.printf("- Error with:%nError Code: -2. int high argument can not be greater than the size" +
                                                                                                    " of the array.%n");
                break;
            case -3:
                System.out.printf("- Error with:%nError Code: -3. Search range must be at least of size 1.%n");
                break;
        }
    }
}