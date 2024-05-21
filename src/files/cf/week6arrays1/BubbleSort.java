package files.cf.week6arrays1;

/**
 * Ταξινομεί έναν πίνακα με τη μέθοδο Bubble Short
 */
public class BubbleSort {

    public static int[] arr = {2, 6, 9, 3, 1, 4, 3, 12};

    public static void main(String[] args) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) swap(j, j + 1);
            }
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

    public static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}