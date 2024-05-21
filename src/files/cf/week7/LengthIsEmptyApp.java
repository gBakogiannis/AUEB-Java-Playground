package files.cf.week7;

/**
 * Demonstrates string length.
 */
public class LengthIsEmptyApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "";
        boolean isEmpty;

        int num = 333;

        System.out.printf("String %s, Length: %d%n", s1, s1.length());

        // Empty -> length == 0
        isEmpty = s2.isEmpty();
        System.out.printf("s2 is empty: %s, s2 length is: %d%n", isEmpty, s2.length());

        System.out.printf("Number %s", num);
    }
}
