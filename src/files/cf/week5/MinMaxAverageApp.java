package files.cf.week5;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει μία ακολουθία ακεραίων που
 * τελειώνει με το 0 και το πρόγραμμα υπολογίζει
 * τα min, max, average.
 */
public class MinMaxAverageApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average = 0;
        int count = 0;
        int sum = 0;

        System.out.println("Please insert a sequence of integers (0 for end)");
        while ((num = sc.nextInt()) !=0) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
            count++;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f", ((double) sum / count));
    }
}
