package files.cf.week9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Το πρόγραμμα αυτό δοκιμάζει διάφορα encodings για χρήση με
 * τους PrintStream και PrintWriter
 *
 * Ελληνικά υποστηρίζονται από UTF-8, Windows-1253, ISO-8859-7
 * Ελληνικά ΔΕΝ υποστηρίζονται από Windows-1252, ISO-8859-1 (Latin1)
 *
 * @author thanos
 */
public class IOEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

        PrintStream ps = new PrintStream("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\" +
                "week9\\testEncode1.txt", "UTF-8");
        PrintWriter pw = new PrintWriter("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\" +
                "week9\\textEncode2.txt", "Windows-1252");

        ps.println("Οικονομικό Πανεπιστήμιο Αθηνών");
        pw.println("Οικονομικό Πανεπιστήμιο Αθηνών");

        ps.close();
        pw.close();
    }
}
