package files.cf.week3;

import java.util.Scanner;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια,
 * δηλαδή 1 αστεράκι 10 φορές.
 */
public class Stars10App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Insert number of iterations.");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;
        }
    }
}
