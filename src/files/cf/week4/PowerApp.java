package files.cf.week4;

import java.util.Scanner;

/**
 * Υπολογίζει το a^b, π.χ. το 2^3 = 8.
 * Διαβάζει το a και το b από τον χρήστη.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("Please insert a, b (ints)");
        a = in.nextInt();
        b = in.nextInt();

        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.printf("%d ^ %d = %d%n", a, b, result);
    }
}
