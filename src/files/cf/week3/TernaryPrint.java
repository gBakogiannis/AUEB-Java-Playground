package files.cf.week3;

import java.util.Scanner;

/**
 * Βρίσκει το απόλυτο ενός ακεραίου
 * και το εμφανίζει άμεσα στην printf
 */
public class TernaryPrint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num");
        num = in.nextInt();

        System.out.printf("Abs of %d is: %d", num, (num > 0) ? num : -num);
    }
}
