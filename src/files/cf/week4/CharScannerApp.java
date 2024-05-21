package files.cf.week4;

import java.util.Scanner;

/**
 * Διαβάζει char με Scanner.
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        // Η nextLine επιστρέφει όλη τη γραμμή μέχρι το \n
        // Η charAt(0) επιστρέφει το πρώτο char ως UTF-16
        inputChar = in.nextLine().charAt(0);

        System.out.println("Input char: " + inputChar);
    }
}
