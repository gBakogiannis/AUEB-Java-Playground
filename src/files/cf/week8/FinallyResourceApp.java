package files.cf.week8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        try (sc) {
            num = sc.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
