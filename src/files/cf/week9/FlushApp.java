package files.cf.week9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Auto-flush enabled with FileOutputStream
 */
public class FlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\George\\IdeaProjects\\" +
                "MyPlayground11\\src\\files\\cf\\week9\\flush-file.txt"), true)) {
            ps.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
