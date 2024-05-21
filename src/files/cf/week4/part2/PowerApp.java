package files.cf.week4.part2;

import java.util.Scanner;

/**
 * Ορίζει μέθοδο που υπολογίζει το a^n.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = 0;

        System.out.println("Please insert a and n");
        a = sc.nextInt();
        n = sc.nextInt();

        System.out.printf("%d ^ %d = %d", a, n, pow(a, n));
    }

    /**
     * Power a^n.
     *
     * @param a     the base
     * @param n     the power to raise
     * @return      the power of a to n
     */
    public static int pow(int a, int n) {
        int power = 1;

        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }

}
