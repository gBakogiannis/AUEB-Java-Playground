package files.cf.week3;

import java.util.Scanner;

/**
 * Nested while. Το Generic While τρέχει
 * τρεις φορές.
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int times = 1;

        while (times <= 3) {
            System.out.println("Please insert, beginValue, EndValue and Step");
            start = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();

            while (start <= endValue) {
                counter++;
                start += step;
            }

            System.out.println("Iterations count: " + counter);
            counter=0;  // reset iterations count
            times++;
        }
    }
}
