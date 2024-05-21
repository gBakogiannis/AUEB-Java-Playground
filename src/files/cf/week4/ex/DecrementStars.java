package files.cf.week4.ex;

import java.util.Scanner;

/**
 * Εκτυπώνει n αστεράκια μειωμένα κατά ένα
 * σε κάθε γραμμή ανάλογα με το n το οποίο
 * δίνει ο χρήστης.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class DecrementStars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Παρακαλώ δώστε το μέγιστο μήκος\n" +
                "της γραμμής αστεριών που θέλετε να εκτυπώσετε σε ακέραιο (int):");
        n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}