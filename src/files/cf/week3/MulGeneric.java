package files.cf.week3;

import java.util.Scanner;

/**
 * Υπολογίζει το γινόμενο των n πρώτων
 * ακεραίων.
 */
public class MulGeneric {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // το 1 είναι το ουδέτερο στοιχείο του πολ/σμού
        int result = 1;
        int n = 0;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
