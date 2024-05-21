package files.cf.week4.ex;

import java.util.Scanner;

/**
 * Εμφανίζει αστεράκια με 5 διαφορετικούς τρόπους
 * κατ' επιλογήν του χρήστη.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class StarsApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            printMenu();
            printStars(getUserInput());
        } while (true);
    }

    /**
     * Prints User Menu.
     */
    public static void printMenu() {
        System.out.println();
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    /**
     * Gets and returns User Input of type int.
     *
     * @return      User's input (int)
     */
    public static int getUserInput() {
        return sc.nextInt();
    }

    /**
     * Prints n Stars horizontally.
     *
     * @param n     the number of Stars.
     */
    public static void horizontalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    /**
     * Prints n Stars vertically.
     *
     * @param n     the number of Stars.
     */
    public static void verticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints a square of size n - stars sides.
     * E.g. if n = 4 the square will be of 4 * 4 stars.
     *
     * @param n     the square side in stars length.
     */
    public static void squareOfStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(n);
            System.out.println();
        }
    }

    /**
     * Prints n lines of Stars with +1 increment.
     *
     * @param n     how many lines will be printed.
     */
    public static void incrementStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(i);
            System.out.println();
        }
    }

    /**
     * Prints n lines of Stars with -1 decrement.
     *
     * @param n     how many lines will be printed.
     */
    public static void decrementStars(int n) {
        for (int i = n; n >= 1; n--) {
            horizontalStars(n);
            System.out.println();
        }
    }

    /**
     * Prints the Stars according to User's choice,
     * or EXIT'S program if user has selected exit (6).
     *
     * @param choice        User's menu choice.
     */
    public static void printStars(int choice) {
        switch (choice) {
            case 1:
                giveNumMessage();
                horizontalStars(getUserInput());
                break;
            case 2:
                giveNumMessage();
                verticalStars(getUserInput());
                break;
            case 3:
                giveNumMessage();
                squareOfStars(getUserInput());
                break;
            case 4:
                giveNumMessage();
                incrementStars(getUserInput());
                break;
            case 5:
                giveNumMessage();
                decrementStars(getUserInput());
                break;
            case 6:                                 // EXIT Program and goodbye message!
                printGoodbyeMessage();
                System.exit(0);
            default:                                // Correct INPUT check and User advising.
                printWarning();
                break;
        }
    }

    /**
     * Prints: Δώστε αριθμό για αστεράκια:
     */
    public static void giveNumMessage() {
        System.out.println("Δώστε αριθμό για αστεράκια:");
    }

    /**
     * Prints: Goodbye!
     */
    public static void printGoodbyeMessage() {
        System.out.println("Goodbye!");
    }

    /**
     * Prints warning message advising the user to give correct input.
     */
    public static void printWarning() {
        System.out.println("Λάθος αριθμός, επιλέξτε επιλογή από 1 έως 6!");
    }
}
