package files.cf.week9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("C:/Users/George/IdeaProjects/MyPlayground11/src/files/cf/week9/file6.txt");

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split(" ");

                for (String token : tokens) {
                    System.out.printf("%s ", token);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
