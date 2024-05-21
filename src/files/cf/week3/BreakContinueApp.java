package files.cf.week3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break και
 * continue.
 */
public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            // If the number is 5, ignore it
            // and immediately continue to next loop.
            if (num == 5) {
                continue;
            }
            sum += num;
            // If the number equals 10 then
            // stop immediately the loop
            // and get out of while.
            if (num == 10) {
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
