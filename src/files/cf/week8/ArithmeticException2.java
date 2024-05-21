package files.cf.week8;

import java.util.Scanner;

/**
 * java Arithmetic Exception with try/catch
 */
public class ArithmeticException2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator (0 for quit) and a denominator");
                numerator = sc.nextInt();
                if (numerator == 0) {
                    break;
                }
                denominator = sc.nextInt();
                result = numerator / denominator;
                System.out.printf("%d / %d = %d%n", numerator, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("Error. Denominator should not be zero");
            }
        }
        System.out.println("Thanks for using the app");
    }
}
