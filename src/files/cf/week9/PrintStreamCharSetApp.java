package files.cf.week9;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Defines PrintStream with charset.
 */
public class PrintStreamCharSetApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\" +
                                                                      "cf\\week9\\file.txt", StandardCharsets.UTF_8);) {
            ps.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
