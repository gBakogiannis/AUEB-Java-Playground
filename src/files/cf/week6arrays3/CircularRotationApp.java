package files.cf.week6arrays3;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Initial Array:");
        print(arr);

        int[] leftRotated = doCircularLeftShiftBy(arr, 2);
        System.out.println("Left Rotated by 2:");
        print(leftRotated);

        int[] rightRotated = doCircularRightShiftBy(arr, 3);
        System.out.println("Right rotated by 3:");
        print(rightRotated);

    }

    /**
     * Rotates the elements of an array clockwise by an offset.
     *
     * @param arr       the given array of integers
     * @param offset    the distance to rotate
     * @return          the rotated array, or null if the given array is null
     */
    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    /**
     * Rotates the elements of an array counterclockwise by an offset.
     *
     * @param arr       the given array of integers
     * @param offset    the distance to rotate
     * @return          the rotated array, or null if the given array is null
     */
    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void print(int[] arr) {
        if (arr == null) return;
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
