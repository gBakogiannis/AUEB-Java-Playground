package files.cf.week9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Αντιγράφει ένα αρχείο video. Υπολογίζει το χρόνο
 * αντιγραφής. Χρησιμοποιεί FileInputStream και
 * FileOutputStream διαβάζοντας και γράφοντας 8192 bytes
 * (= 8 kBytes) τη φορά.
 *
 * @author A. Androutsos
 */
public class IOVideoCopy2 {

    public static void main(String[] args) throws java.io.IOException {
        int b, count = 0;
        byte[] buf = new byte[8192];

        try (FileInputStream in = new FileInputStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\" +
                "files\\cf\\week9\\video.mp4");
             FileOutputStream out = new FileOutputStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\" +
                     "src\\files\\cf\\week9\\videoCopy.mp4")) {

            long start = System.nanoTime();

            // Αντέγραψε το αρχείο
            while ((b = in.read(buf)) != -1) {
                out.write(buf, 0, b);
                count += b;
            }

            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("Το αρχείο με μέγεθος %d kBytes (%d bytes) αντιγράφηκε%n", count / 1024, count);
            System.out.printf("Time: %.2f seconds", elapsed / 1_000_000_000.0);
        }
    }
}
