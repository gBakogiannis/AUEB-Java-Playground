package files.cf.week8.assignments;

import java.util.Scanner;

/**
 * Simulates a CRUD app. Prints a user menu with 5 choices. 1 for create, 2 for read, 3 for update, 4 for delete,
 * 5 for EXIT. When the user selects a choice, the app is printing a message in order to simulate the service call by
 * the user. The app is always running until users presses 5 for exit.
 */
public class UserMenuApp {

    // ANSI escape code for clearing the entire screen
    public static final String ANSI_CLEAR_SCREEN = "\u001B[2J";
    // ANSI escape code for moving the cursor to the top-left corner
    public static final String ANSI_HOME = "\u001B[H";

    public static void main(String[] args) {

        clearScreen();      // Clears screen for better UX. Works on Terminal only (CLI). It doesn't work in IntelliJ's
                            // default output. It has been tested on Windows 11 CLI only.
        printMenu();

        while (true) {      // exits when user gives 5
            try {
                printChoice(getChoice());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Prints the user menu.
     */
    public static void printMenu() {
        System.out.println("Select choice:");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. EXIT");
    }

    /**
     * Gets user's choice with a Scanner. Ensures that the user input is of type int.
     *
     * @return  An int representing the user's choice.
     */
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;

        while (true) {
            if (sc.hasNextInt()) {      // Ensure that user's input is of type int
                userChoice = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please provide a number from 1 to 5."); // Inform the user
                sc.nextLine();
                continue;
            }
        }
        return userChoice;
    }

    /**
     * Prints a service simulation according to the user's choice.
     *
     * @param choice                            the user's choice
     * @throws IllegalArgumentException         if user gives another number instead of 1 to 5 which is invalid.
     */
    public static void printChoice(int choice) throws IllegalArgumentException {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Invalid input. Please provide a number from 1 to 5.");
        } else {
            switch(choice) {
                case 1:
                    clearScreen();  // Clears screen for better UX
                    printMenu();
                    System.out.println("Creating file...");
                    break;
                case 2:
                    clearScreen();  // Clears screen for better UX
                    printMenu();
                    System.out.println("Fetching file...");
                    break;
                case 3:
                    clearScreen();  // Clears screen for better UX
                    printMenu();
                    System.out.println("Saving changes...");
                    break;
                case 4:
                    clearScreen();  // Clears screen for better UX
                    printMenu();
                    System.out.println("File deleted.");
                    break;
                case 5:
                    clearScreen();  // Clears screen for better UX
                    System.out.println("Goodbye!");
                    System.exit(0);     // Program EXIT by user's choice
            }
        }
    }

    /**
     * It clears terminal's (CLI) screen and places the cursor to the top left corner.
     */
    public static void clearScreen() {
        System.out.print(ANSI_CLEAR_SCREEN);
        System.out.print(ANSI_HOME);
    }
}