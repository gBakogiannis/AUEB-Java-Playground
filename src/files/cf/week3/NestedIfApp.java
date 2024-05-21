package files.cf.week3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Δέχεται ως είσοδο: 1) Σύνολο βαθμολογίας
 * και 2) πλήθος μαθημάτων, και υπολογίζει
 * τον μέσο όρο. Στη συνέχεια δίνει feedback
 * στον χρήστη: 9-10 Άριστα, 7-8 Καλώς,
 * 5-6 Λίαν καλώς, κάτω από 5 Αποτυχία.
 */
public class NestedIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules' count");
        modulesCount = in.nextInt();

        if (modulesCount == 0) {
            System.out.println("Modules' count can not be zero");
            System.exit(1);
        }

        average = totalMarks / modulesCount;
        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >= 7) {
            System.out.println("Very Good: " + average);
        } else if (average >= 5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Fail: " + average);
        }
    }
}
