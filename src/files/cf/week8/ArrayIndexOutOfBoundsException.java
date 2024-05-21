package files.cf.week8;

/**
 * Throws ArrayIndexOutOfBoundsException
 */
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
