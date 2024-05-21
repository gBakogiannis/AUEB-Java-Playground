package files.cf.week7;

/**
 * Εκτυπώνει ένα String σε μορφή substrings
 * ενός χαραχτήρα τη φορά.
 *
 * @author A. Androutsos
 */
public class SubstringDemo {

    public static void main(String[] args) {
        String s = "This is AUEB";

        for (int i = 0; i < s.length(); i ++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}
