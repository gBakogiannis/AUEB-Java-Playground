package files.cf.week3;

/**
 * Υπολογίζει το γινόμενο των 10 πρώτων
 * ακεραίων.
 */
public class Mul10 {

    public static void main(String[] args) {
        // το 1 είναι το ουδέτερο στοιχείο του πολ/σμού
        int result = 1;
        int i = 1;

        while (i <= 10) {
            result *= i;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
