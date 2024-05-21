package files.cf.week3;

/**
 * Εκτυπώνει 10 αστεράκια (10 φορές
 * από ένα αστεράκι).
 */
public class Stars10CountDown {

    public static void main(String[] args) {

        int i = 10;

        while (i >= 1) {
            System.out.print("*");
            i--;
        }
    }
}
