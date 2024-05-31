package files.cf.week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβάζει από ένα αρχείο ακεραίων και γράφει
 * σε ένα άλλο αρχείο το άθροισμα και τον μέσο όρο.
 *
 * @author A. Androutsos
 */
public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\" +
                "week9\\IntIn.txt"));
        PrintStream ps = new PrintStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\" +
                "week9\\IntOut.txt");
        String token;
        int num = 0, sum = 0, count = 0;
        double average = 0.0;

        while (sc.hasNext()) {
            token = sc.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        average = (double) sum / count;
        ps.printf("To άθροισμα είναι %d%n", sum);
        ps.printf(Locale.ENGLISH, "Ο μέσος όρος είναι %.2f", average);

        sc.close();
        ps.close();
    }

    /**
     * Ελέγχει αν το String s είναι αριθμός.
     *
     * @param s το προς έλεγχο String
     * @return  true, αν το s είναι αριθμός, αλλιώς false.
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
