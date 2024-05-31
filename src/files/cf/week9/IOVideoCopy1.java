package files.cf.week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Αντιγράφει ένα αρχείο βίντεο. Υπολογίζει το χρόνο
 * αντιγραφής. Χρησιμοποιεί FileInputStream και
 * FileOutputStream διαβάζοντας και γράφοντας ένα
 * byte τη φορά.
 *
 * @author A. Androutsos
 */
public class IOVideoCopy1 {

    public static void main(String[] args) throws java.io.IOException {
        int b, count = 0;

        try (FileInputStream in = new FileInputStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\" +
                "files\\cf\\week9\\video.mp4");
             FileOutputStream out = new FileOutputStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\" +
                     "src\\files\\cf\\week9\\videoCopy.mp4")) {

            long start = System.nanoTime();
            // Αντέγραψε το αρχείο
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("Το αρχείο με μέγεθος %d kBytes (%d bytes) αντιγράφηκε%n", count / 1024, count);
            System.out.printf("Time: %.2f seconds", elapsed / 1_000_000_000.0);
        }
    }
}
