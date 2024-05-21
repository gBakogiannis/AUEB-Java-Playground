package files.cf.week4.ex;

import java.util.Scanner;

/**
 * Τυπώνει κάθετα n αστεράκια, όπου n ο αριθμός
 * που δίνει ο χρήστης.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class VerticalStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Δώστε πόσα αστεράκια θέλετε να εκτυπωθούν κάθετα σε αριθμό (int):");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
