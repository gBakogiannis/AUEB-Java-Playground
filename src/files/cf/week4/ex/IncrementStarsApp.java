package files.cf.week4.ex;

import java.util.Scanner;

/**
 * Εμφανίζει από 1 έως n αστεράκια αυξανόμενα
 * κατά ένα σε κάθε γραμμή ανάλογα με το n που
 * εισάγει ο χρήστης.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class IncrementStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Παρακαλώ δώστε τον μέγιστο αριθμό αστεριών σε ακέραιο (int):");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
