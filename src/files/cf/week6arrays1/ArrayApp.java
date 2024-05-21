package files.cf.week6arrays1;

/**
 * Δήλωση πίνακα ακεραίων τριών θέσεων,
 * populate (αρχικοποίηση τιμών) και
 * εκτύπωση τιμών.
 */
public class ArrayApp {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 12;

        int[] arr2 = new int[4];

        int[] myArray = {1, 2, 3, 4, 5, 6};

        System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1] + ", arr[2] = " + arr[2]);
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3]);
    }
}
