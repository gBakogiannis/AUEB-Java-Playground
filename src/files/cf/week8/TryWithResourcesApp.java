package files.cf.week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) throws FileNotFoundException {
        int num = 0;
        File fd = new File("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\week8" +
                                                                                                         "\\hello.txt");

        try (Scanner sc = new Scanner(fd)) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                System.out.println(num);
            } else {
                System.out.println("Error in input");
                sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static Scanner getFileDescriptor(String s) throws FileNotFoundException {
        File fd = new File(s);

        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
