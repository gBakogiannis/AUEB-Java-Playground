package files.cf.week4.part2;

/**
 * Χρησιμοποιεί τη μέθοδο swap() για
 * να ανταλλάξει αμοιβαία τις τιμές των α, β.
 * Ο τρόπος αυτός αμοιβαίας ανταλλαγής δε
 * δουλεύει γιατί τα a, b περνάνε ως input
 * (read only) και όχι ως output.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        swap(a, b);

        System.out.printf("a = %d, b = %d", a, b);

    }

    /**
     * Swaps a, b.
     *
     * @param a     the first int
     * @param b     the second int
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
