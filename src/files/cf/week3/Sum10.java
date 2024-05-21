package files.cf.week3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων
 * αριθμών, από το 1-10.
 */
public class Sum10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
