package files.cf.week3.ex;

import java.util.Scanner;

/**
 * An app that reads a calendar year from the
 * user in stdio. The app determines whether the year is
 * a leap year or not.
 *
 * @author Bakogiannis George
 * @version 1.0
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please enter a calendar year:");
        year = in.nextInt();

        // If a year is divisible by 400, it is a leap year.
        if (year % 400 == 0) {
            System.out.printf("Year %d is a leap year!%n", year);
            System.exit(0); // Terminate the program successfully
        }

        // If a year is divisible by 4 but NOT by 100, then it is a leap year.
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("Year %d is a leap year!%n", year);
            System.exit(0); // Terminate the program successfully
        }

        // If the program hasn't exited yet then the year is NOT leap.
        System.out.printf("Year %d is not a leap year.%n", year);
    }
}
