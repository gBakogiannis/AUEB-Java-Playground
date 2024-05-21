package files.cf.week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\George\\IdeaProjects\\MyPlayground11\\src\\files\\cf\\week8" +
                                                                                                   "\\random-file.txt");

        try (Scanner sc = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Exception: " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
