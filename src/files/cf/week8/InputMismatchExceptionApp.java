package files.cf.week8;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Input mismatch exception when user inserts
 * a non-numeric string instead of integer.
 */
public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;

        while (true) {
            try {
                System.out.println("Please insert an int");
                inputNum = sc.nextInt();
                if (inputNum == 12) break;
                System.out.println("Input number: " + inputNum);
            } catch (InputMismatchException e) {
                sc.nextLine();
                //e.printStackTrace();
                System.out.println("Error in input, please insert an int");
            }
        }
    }
}
