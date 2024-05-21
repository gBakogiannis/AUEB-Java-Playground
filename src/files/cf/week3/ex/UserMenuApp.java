package files.cf.week3.ex;

import java.util.Scanner;

/**
 * Displays a user menu repeatedly till
 * the user selects 5 (exit).
 *
 * @author Bakogiannis George
 * @version 1.0
 */
public class UserMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userSelection = 0;

        do {
            System.out.println("Παρακαλώ διαλέξατε επιλογή:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            userSelection = in.nextInt();

            if (userSelection <= 0 || userSelection > 5) {
                System.out.println("Λάθος εισαγωγή. Παρακαλώ διαλέξατε επιλογή (1 έως 5).");
            } else if (userSelection == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (userSelection == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (userSelection == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (userSelection == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else {    // if (userSelection == 5)
                System.out.println("Thank you for using UserMenuApp. Bye!");
            }
        } while (userSelection != 5);
    }
}