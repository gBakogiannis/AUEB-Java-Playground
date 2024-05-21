package files.cf.week7;

import java.util.Scanner;

/**
 * Typecast from String to int. If the string
 * is not a valid int then NumberFormatException
 * is thrown.
 */
public class TypecastsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert an int:");
        lexeme = sc.next();
        num = Integer.parseInt(lexeme);

        System.out.printf("Num is: %d", num);
    }
}
