package files.cf.week9;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * Prints text with PrintWriter
 */
public class PrintWriterApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\" +
                                                                                                "cf\\week9\\fw.txt");) {
            pw.println("Hello World!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
