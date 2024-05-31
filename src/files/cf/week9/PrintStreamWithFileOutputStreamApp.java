package files.cf.week9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Auto-flush και charset με FileOutputStream
 */
public class PrintStreamWithFileOutputStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\George\\IdeaProjects\\" +
                "MyPlayground11\\src\\files\\cf\\week9\\file1.txt"), true, StandardCharsets.UTF_8)) {
            ps.println("Hello");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
