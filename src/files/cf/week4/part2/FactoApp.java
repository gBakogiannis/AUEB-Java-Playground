package files.cf.week4.part2;

import java.util.Scanner;

/**
 * Ορίζει μία μέθοδο που υπολογίζει το
 * παραγοντικό το n (n!).
 */
public class FactoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  0;

        System.out.println("Please insert an int");
        n = sc.nextInt();

        System.out.printf("%d! = %d", n, facto(n));

    }

    /**
     * Recursive version of n!
     *
     * @param n     the n number of n!
     * @return      1*2*..*n
     */
    public static int facto(int n) {
        return (n <= 1) ? 1 : n * facto(n-1);
    }
}
