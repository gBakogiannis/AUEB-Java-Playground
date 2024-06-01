package files.cf.week9.assignments;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Reads from locations.txt file and writes the data in output.txt with a new format.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class LocationsApp {

    public static void main(String[] args) {
        File fdOut = new File("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\week9\\" +
                "assignments\\output.txt");     // the output file
        String line;                            // stores each locations.txt line the program reads
        int counter = 0;                        // stores how many rows the locations.txt file has
        String[] documentRow;                   // stores each locations.txt line in a table format

        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\George\\IdeaProjects\\" +
                "MyPlayground11\\src\\files\\cf\\week9\\assignments\\locations.txt"));
             PrintWriter pw = new PrintWriter(fdOut, StandardCharsets.UTF_8))
        {
            bf.mark(1_000_000);     // mark the beginning of the stream

            // Find the number of rows in locations.txt. We need to know in order to locate the last line in the
            // document where there must be no comma in the end.
            while ((line = bf.readLine()) != null) {
                counter++;
            }

            bf.reset();                          // reset to the start of locations.txt

            // Write to output.txt. All lines end with comma. We ignore the last one because must have no comma.
            for (int i = 1; i < counter; i++) {
                line = bf.readLine();
                documentRow = line.split(",");
                writeRow(documentRow, pw, true);
            }

            // Last line in output.txt must have no comma.
            line = bf.readLine();
            documentRow = line.split(",");
            writeRow(documentRow, pw, false);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Takes as an input a line from locations.txt in a table form. Writes the data to the output.txt with the new
     * format.
     *
     * @param documentRow       a line from the input document in table format
     * @param pw                a PrintWriter for the output
     * @param comma             if true writes the line with comma in the end, else without comma
     */
    public static void writeRow(String[] documentRow, PrintWriter pw, boolean comma) {
        if (comma == true) {
            pw.printf("{ location: '%s', latitude: %s, longitude: %s },", documentRow[0], documentRow[1],
                    documentRow[2]);
            pw.println();
        } else {
            pw.printf("{ location: '%s', latitude: %s, longitude: %s }", documentRow[0], documentRow[1],
                    documentRow[2]);
            pw.println();
        }
    }
}
