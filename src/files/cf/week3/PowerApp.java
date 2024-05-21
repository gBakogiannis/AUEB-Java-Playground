package files.cf.week3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^b.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert a, b");
        a = in.nextInt();
        b = in.nextInt();

        while (i <= b) {
            result *= a;
            i++;
        }
        System.out.printf("%d^%d = %d", a, b, result);
    }
}
