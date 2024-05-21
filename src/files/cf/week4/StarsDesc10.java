package files.cf.week4;

/**
 * Εκτυπώνει 10 αστεράκια στη 1η σειρά,
 * 9 αστεράκια στη 2η σειρά, μέχρι 1
 * αστεράκι στη 10η σειρά.
 */
public class StarsDesc10 {

    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
