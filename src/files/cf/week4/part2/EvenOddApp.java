package files.cf.week4.part2;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("Please insert an int");
        a = sc.nextInt();

        System.out.printf("Ο %d%sείναι άρτιος", a, isEven(a) ? " " : " δεν ");
    }

    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }
}
