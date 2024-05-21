package files.cf.week7.assignments;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * A simple decipher - decoder app. It decodes an encoded - ciphered message encoded by the EncodeApp.
 *
 * @author George Bakogiannis
 * @version 1.0
 */
public class DecodeApp {

    public static void main(String[] args) throws FileNotFoundException {
        // Reads encrypted message from EncodeApp's output file
        File inputFile = new File("src/files/cf/week7/assignments/encoded_message.txt");
        Scanner sc = new Scanner(inputFile);
        String encryptedMessage = sc.nextLine();
        String decodedMessage;                  // stores the deciphered message

        System.out.println("The encoded message is:");
        System.out.println(encryptedMessage);

        try {
            decodedMessage = decode(encryptedMessage);      // decodes the encrypted message
            System.out.println("The decoded message is:");
            System.out.println(decodedMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Deciphers - decodes a ciphered - encoded message. The method works in the opposite way of
     * "EncodeApp.encode(String message)" method.
     *
     * It is implemented with extended ASCII in mind (256 character codes).
     *
     * This encoding method transforms a string by replacing each character with the character that directly precedes it
     * in the ASCII table. For example, the character 'B' (ASCII code 66) is replaced by 'A' (ASCII code 65),
     * 'C' by 'B', and so on. This means that every character in the input string is shifted backward by one position in
     * the ASCII sequence. If the character is the first one in the ASCII range, it replaces it with the end of the
     * range. This transformation results in a new string where each original character is replaced by its preceding
     * ASCII character.
     *
     * @param message               the input String
     * @return                      the deciphered - decoded String
     * @throws Exception            if the String has non "Extended ASCII" characters
     */
    public static String decode(String message) throws Exception {
        // Checks if String characters belong to "Extended ASCII" characters set.
        if (!ensureExtendedASCII(message)) throw new Exception("Please use \"Extended ASCII\" characters only!");

        char[] array = message.toCharArray();
        int ASCIIvalue;
        StringBuilder sb = new StringBuilder();         // Use of StringBuilder for time efficiency.

        for (char character : array) {
            ASCIIvalue = (int) character;
            if (ASCIIvalue == 0) {
                sb.append((char) 255);
            } else {
                sb.append((char) (ASCIIvalue - 1));
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
