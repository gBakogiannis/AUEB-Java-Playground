package files.cf.week6arrays1;

/**
 * Moves elements one position to the left.
 * Last element becomes zero. Essentialy,
 * replaces each array element with the next one.
 */
public class ArrayReplaceNextApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
