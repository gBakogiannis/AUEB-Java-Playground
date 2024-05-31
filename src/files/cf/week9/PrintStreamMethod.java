package files.cf.week9;

import java.io.PrintStream;
import java.io.FileNotFoundException;

public class PrintStreamMethod {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\" +
                                                                                                       "week9\\cf.txt");

        printMsg(ps, "Hello Coding Plus");          // Prints to ps
        printMsg(System.out, "Coding Factory");     // Prints to stdout
    }

    /**
     * Prints a string message to PrintStream.
     *
     * @param ps        the PrintStream object
     * @param message   the message to print
     */
    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
