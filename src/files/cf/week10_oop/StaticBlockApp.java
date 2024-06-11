package files.cf.week10_oop;

import java.util.Scanner;

public class StaticBlockApp {
    static Scanner in = new Scanner(System.in);
    static int count;

    static {
        int num = in.nextInt();
        count = (num == 1) ? 1 : 0;
    }

    public StaticBlockApp() {
    }
}
