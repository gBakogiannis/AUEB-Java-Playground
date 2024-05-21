package files.cf.week3;

import java.util.Scanner;

/**
 * Υπολογίζει το n! (n παραγοντικό),
 * δηλαδή το 1*2*3*..*n. Εξ ορισμού είναι
 * 0! = 1. Είναι παρόμοιο με το γινόμενο
 * των n πρώτων αριθμών.
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            facto = facto * i;
            i++;
        }

        System.out.printf("%d! = %d", n, facto);
    }
}
