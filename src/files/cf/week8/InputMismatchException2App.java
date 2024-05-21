package files.cf.week8;

import java.util.Scanner;

/**
 * InputMismatchException with state-testing.
 */
public class InputMismatchException2App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC = 12;

        while (true) {
            System.out.println("Please insert an int");

            if (sc.hasNextInt()) {
                inputNum = sc.nextInt();
            } else {
                System.out.println("Please insert a valid int");
                sc.nextLine();
                continue;
            }
            if (inputNum == MAGIC) break;
            System.out.println("Input num = " + inputNum);
        }
    }
}
