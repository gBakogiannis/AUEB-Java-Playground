package files.cf.week4.ex;

import java.util.Scanner;

/**
 * Εκτυπώνει ένα "τετράγωνο" αστεριών, διαστάσεων
 * n, όπου το n το δίνει ο χρήστης.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class NSquareStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Δώστε το μέγεθος του τετραγώνου αστεριών σε ακέραιο αριθμό (int):");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
