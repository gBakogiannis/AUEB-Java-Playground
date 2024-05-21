package files.cf.week7.assignments;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * A simple cryptography app where it encodes a string by substituting each character with the next ASCII character.
 * It is implemented with extended ASCII in mind (256 character codes).
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class EncodeApp {

    public static void main(String[] args) throws FileNotFoundException {
        // Reads original message from input file. Outputs encoded message to output file.
        File inputFile = new File("src/files/cf/week7/assignments/original_message.txt");   // input file
        File outputFile = new File("src/files/cf/week7/assignments/encoded_message.txt");   // output file
        Scanner sc = new Scanner(inputFile);
        PrintStream ps = new PrintStream(outputFile);
        String message = sc.nextLine();
        String encodedMessage;                                                      // stores the encrypted message

        System.out.println("Original message:");
        System.out.println(message);

        try {
            encodedMessage = encode(message);          // encodes original message
            System.out.println("Encoded message:");
            System.out.println(encodedMessage);
            ps.println(encodedMessage);                // writes encoded message to the output file
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * It is implemented with extended ASCII in mind (256 character codes).
     *
     * This encoding method transforms a string by replacing each character with the character that directly follows it
     * in the ASCII table. For example, the character 'A' (ASCII code 65) is replaced by 'B' (ASCII code 66),
     * 'B' by 'C', and so on. This means that every character in the input string is shifted forward by one position in
     * the ASCII sequence. If the character is the last one in the ASCII range, it wraps around to the beginning of the
     * range. This transformation results in a new string where each original character is replaced by its subsequent
     * ASCII character.
     *
     * @param message               the input String
     * @return                      the encoded String
     * @throws Exception            if the String's characters do not belong to the "Extended ASCII" character set
     */
    public static String encode(String message) throws Exception {
        // Checks if String characters belong to the "Extended ASCII" character set.
        if (!ensureExtendedASCII(message)) throw new Exception("Please use \"Extended ASCII\" characters only!");

        char[] array = message.toCharArray();
        int ASCIIvalue;
        StringBuilder sb = new StringBuilder();     // Use of StringBuilder for time efficiency.

        for (char character : array) {
            ASCIIvalue = (int) character;
            if (ASCIIvalue == 255) {
                sb.append((char) 0);
            } else {
                sb.append((char) (ASCIIvalue + 1));
            }
        }

        return sb.toString();
    }

    /**
     * Ensures that all the characters in a String belong to the "Extended ASCII" character set.
     *
     * @param message       the input String
     * @return              true if all characters belong to the "Extended ASCII" character set, false if there is one
     *                      or more characters that do not belong to the "Extended ASCII".
     */
    public static boolean ensureExtendedASCII(String message) {
        boolean areAllCharactersASCII = true;
        char[] array = message.toCharArray();
        int ASCIIvalue;

        for (char character : array) {
            ASCIIvalue = (int) character;
            if (ASCIIvalue > 255) {
                areAllCharactersASCII = false;
                break;
            }
        }

        return areAllCharactersASCII;
    }

}