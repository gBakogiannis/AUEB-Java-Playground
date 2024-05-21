package files.cf.week4;

import java.util.Scanner;

/**
 * Switch instead of many if-then-else.
 * Gets user's choice and gives feedback.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one fo the following");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");
            System.out.println("Please insert your choice");

            // Get the choice
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start one-player game");
                    break;
                case 2:
                    System.out.println("Start two-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Exit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice !=4);

        System.out.println("Goodbye!");
    }
}
