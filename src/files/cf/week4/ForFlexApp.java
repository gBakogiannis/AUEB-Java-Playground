package files.cf.week4;

import java.util.Scanner;

/**
 * Flexible for. Διαβάζει από το stdin την
 * αρχική τιμή, τελική τιμή και το step.
 * Εκτυπώνει κάθε τιμή του i και το πλήθος
 * των επαναλήψεων.
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please insert start value, end value and step.");
        startValue = in.nextInt();
        endValue= in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(iterations);
    }
}
