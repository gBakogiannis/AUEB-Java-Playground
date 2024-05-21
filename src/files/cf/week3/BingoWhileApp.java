package files.cf.week3;

import java.util.Scanner;

/**
 * Guesses repeatedly until the key will eventually be
 * found. This method or repeated guesses in
 * cryptography, for guessing passwords or cryptographic
 * keys, is called brute-force.
 */
public class BingoWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
            System.out.println("Please guess the key number");
            inputNum = in.nextInt();

            if (inputNum == key) {
                bingo = true;
                System.out.println("Bingo, Great guess");
            } else {
                System.out.println("Try again");
            }
        } while (!bingo);
    }
}
