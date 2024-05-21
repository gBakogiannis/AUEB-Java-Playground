package files.cf.week3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων
 * αριθμών, από το 1-10.
 */
public class SumNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
