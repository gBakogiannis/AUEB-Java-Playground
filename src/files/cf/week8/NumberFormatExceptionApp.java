package files.cf.week8;

import java.util.Scanner;

/**
 * NumberFormatException is thrown when
 * we parse a non-numeric token with
 * wrapper classes, such as Integer.parseInt()
 */
public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please insert an int");
        inputStr = sc.nextLine();
        if (isInt(inputStr)) {
            num = Integer.parseInt(inputStr);
            System.out.println("Input number: " + num);
        } else {
            System.out.println("Error in parsing. Please insert an integer");
        }
    }

    /**
     * Returns true if the source string
     * evaluates to integer.
     *
     * @param s     the source string
     * @return      true, if the string evaluates to int,
     *              false otherwise
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
