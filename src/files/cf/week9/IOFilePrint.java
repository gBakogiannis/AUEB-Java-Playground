package files.cf.week9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Εκτυπώνει σε αρχείο χαρακτήρες με τη χρήση
 * των PrintStream και PrintWriter.
 *
 * @author A. Androutsos
 */
public class IOFilePrint {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\" +
                                                                                        "cf\\week9\\IOSimpleTest1.txt");
             PrintWriter pw = new PrintWriter("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\" +
                                                                                        "cf\\week9\\IOSimpleTest2.txt"))
        {
            ps.println("Hello World2! from PrintStream");
            pw.println("Hello World2! from PrintWriter");
        } catch (FileNotFoundException e) {
            System.out.println("Το αρχείο δεν βρέθηκε");
        }
    }
}
