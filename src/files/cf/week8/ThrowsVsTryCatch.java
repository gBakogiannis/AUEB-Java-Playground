package files.cf.week8;

import java.io.IOException;

/**
 * Checked exceptions could be addressed
 * using try/catch
 */
public class ThrowsVsTryCatch {

    public static void main(String[] args) throws IOException {
        char ch = (char) System.in.read();
    }
}
