package files.cf.week9;

import java.io.PrintStream;
import java.io.FileNotFoundException;

/**
 * Prints with PrintStream class.
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/Users/George/IdeaProjects/MyPlayground11/src/files/cf/" +
                                                                                                      "week9/f1.txt")) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
