package files.cf.week7;

import java.util.Scanner;

public class ConsoleManipulation {
    // ANSI escape code for clearing the entire screen
    public static final String ANSI_CLEAR_SCREEN = "\u001B[2J";
    // ANSI escape code for moving the cursor to the top-left corner
    public static final String ANSI_HOME = "\u001B[H";

    public static void main(String[] args) {
        int userChoice = 0;
        Scanner sc = new Scanner(System.in);

        printInstructions();

        do {
            userChoice = sc.nextInt();
            printStars(userChoice);
        } while (userChoice != 4);
    }

    public static void printInstructions() {
        System.out.println("Select 1 for horizontal stars, 2 for vertical stars, 3 for a stars square, 4 for EXIT.");
    }

    public static void printStars(int userChoice) {
        switch (userChoice) {
            case 1:
                horizontal();
                break;
            case 2:
                vertical();
                break;
            case 3:
                square();
                break;
            case 4:
                goodbye();
        }
    }

    public static void horizontal() {
        clearScreen();
        printInstructions();
        System.out.println("1. Horizontal Stars:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void vertical() {
        clearScreen();
        printInstructions();
        System.out.println("2. Vertical Stars:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }
    }

    public static void square() {
        clearScreen();
        printInstructions();
        System.out.println("3. Square of Stars:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void goodbye() {
        clearScreen();
        System.out.println("Program Exited");
        System.out.println();
        System.out.println("... Goodbye!");
        System.out.println();
    }

    public static void clearScreen() {
        System.out.print(ANSI_CLEAR_SCREEN);
        System.out.print(ANSI_HOME);
    }
}