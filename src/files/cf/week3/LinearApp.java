package files.cf.week3;

import java.util.Scanner;

/**
 * Διαιρεί δύο ακεραίους. Ελέγχει αν ο num2 είναι 0
 * οπότε δεν μπορεί να προχωρήσει η διαίρεση.
 */
public class LinearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert the numerator");
        numerator = in.nextInt();
        System.out.println("Please insert the denominator");
        denominator = in.nextInt();

        if (denominator == 0) System.exit(1);

        result = numerator / denominator;
        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }
}