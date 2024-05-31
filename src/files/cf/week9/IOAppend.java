package files.cf.week9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Το πρόγραμμα αυτό επιδεικνύει πως κάνουμε append (δηλ. γράφουμε στο τέλος)
 * σε ένα αρχείο. Παρατηρήστε την FileOutputStream, που παίρνει το όνομα του αρχείου
 * αλλά και μία παράμετρο true που είναι το append
 *
 * Θα τρέξουμε δύο φορές αυτό το πρόγραμμα και
 * αναμένουμε δύο εγγραφές σε κάθε αρχείο
 *
 * @author thanos
 */
public class IOAppend {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\George\\IdeaProjects\\" +
                "MyPlayground11\\src\\files\\cf\\week9\\TestAppend1.txt", true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:\\Users\\George\\IdeaProjects\\" +
                "MyPlayground11\\src\\files\\cf\\week9\\TestAppend2.txt", true));

        ps.println("Hello from PrintStream");
        pw.println("Hello from PrintWriter");

        ps.close();
        pw.close();
    }
}
