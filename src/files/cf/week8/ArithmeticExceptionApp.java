package files.cf.week8;

import java.util.Scanner;

/**
 * java Arithmetic Exception
 */
public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert a numerator and a denominator");
        numerator = sc.nextInt();
        denominator = sc.nextInt();

        result = numerator / denominator;

        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }
}
