package files.cf.week6arrays1;

public class ReplaceWithNextWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        shiftLeftByOne(arr, 0);
        printArray(arr);
    }

    /**
     * Replaces each array element with the next one
     * starting at a particular position.
     *
     * @param arr       the source array
     * @param low       the position to start
     */
    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null) return;
        if ((low < 0) || (low > arr.length - 1)) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = 0;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
